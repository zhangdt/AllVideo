package com.abner.fff.job;

import com.abner.fff.utils.JsoupUtils;
import com.sun.corba.se.impl.copyobject.JavaStreamObjectCopierImpl;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 爬取场库
 */
@Component
public class VmovierCrawler {
    private static final String V_HOME_URL = "https://www.vmovier.com/";
    private int mPage =1;
    @Scheduled(fixedRate = 6000*5)
    private void start(){
        System.out.println("Crawler start"+mPage);
        saveNewsToRedis(mPage);
        mPage++;

//        System.out.print(document.body().toString());
//        saveMovieDetailsToRedis(V_HOME_URL+"/54757?from=index_new_title");
    }

    /**
     * 爬取场库最新的视频
     * @param page
     */
    private void saveNewsToRedis(int page)
    {
        Document document = JsoupUtils.getDocWithPC(V_HOME_URL+"?tab=new&page="+page);
//        Elements elements = document.getElementsByClass("clearfix");
        Elements elements = document.select("li.clearfix");
        for (Element element:elements)
        {
            String title  = element.select("a").first().attr("title");
            String href  = element.select("a").first().attr("href");
//            System.out.print(element.toString());
            String imageUrl = element.select("img").first().attr("src");
            System.out.println("title:"+title);
            System.out.println("href:https:"+href);
            System.out.println("imageUrl:"+imageUrl);
            saveMovieDetailsToRedis(V_HOME_URL+href);

        }
    }

    /**
     * 爬取视频详情
     * @param url
     */
    private void saveMovieDetailsToRedis(String url)
    {
        Document document = JsoupUtils.getDocWithPC(url);
//        System.out.println(document.body().toString());
        if(document.select("iframe").size()!=0) {
            String iFrameSrc = document.select("iframe").first().attr("src");
            Document voideDocument = JsoupUtils.getDocWithPC(iFrameSrc);
            String voideUrl = voideDocument.getElementById("player").attr("href");
//        System.out.println("src:"+iFrameSrc);
            System.out.println("voide:https:" + voideUrl);
        }else
        {
            document.select("script:contains(YKU.Player)");
//            document.toString().substring()
            System.out.println("爬取不到视频地址："+document.select("script").size());
        }
    }

}
