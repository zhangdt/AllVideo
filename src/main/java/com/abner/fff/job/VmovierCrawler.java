package com.abner.fff.job;

import com.abner.fff.bean.Video;
import com.abner.fff.utils.JsoupUtils;
import com.abner.fff.utils.RedisManager;
import com.sun.corba.se.impl.copyobject.JavaStreamObjectCopierImpl;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 爬取场库
 */
@Component
public class VmovierCrawler {
    private static final String V_HOME_URL = "https://www.vmovier.com/";
    private static final String TAG = "Vmovier";
    private int mPage =1;

    @Autowired
    private RedisManager redisManager;


    @Scheduled(fixedRate = 6000*6000*12)
    private void start(){
        System.out.println("VmovierCrawler start"+mPage);
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
        List<Video> videos = new ArrayList<>();
        Document document = JsoupUtils.getDocWithPC(V_HOME_URL+"index/index/p/"+page);
//        Elements elements = document.getElementsByClass("clearfix");
        if (document==null) return;
        Elements elements = document.select("li.clearfix");
        for (Element element:elements)
        {
            Video video = new Video();
            String title  = element.select("a").first().attr("title");
            String href  = element.select("a").first().attr("href");
//            System.out.print(element.toString());
            String imageUrl = element.select("img").first().attr("src");
            System.out.println("title:"+title);
            System.out.println("href:https:"+href);
            System.out.println("imageUrl:"+imageUrl);
            String playUrl = saveMovieDetailsToRedis(V_HOME_URL+href);
            video.setHeaderImage(imageUrl);
            video.setType(TAG);
            video.setTitle(title);
            video.setPlayUrl(playUrl);
            videos.add(video);
        }
        redisManager.saveVideos(RedisManager.HOT_KEY+"_"+TAG,videos);
    }

    /**
     * 爬取视频详情
     * @param url
     */
    private String saveMovieDetailsToRedis(String url)
    {
        Document document = JsoupUtils.getDocWithPC(url);
//        System.out.println(document.body().toString());
        if(document.select("iframe").size()!=0) {
            String iFrameSrc = document.select("iframe").first().attr("src");
            Document voideDocument = JsoupUtils.getDocWithPC(iFrameSrc);
            String voideUrl = voideDocument.getElementById("player").attr("href");
//        System.out.println("src:"+iFrameSrc);
            System.out.println("voide:https:" + voideUrl);
            return "https:"+voideUrl;
        }else
        {
//            document.select("script:contains(YKU.Player)");
//            document.toString().substring()
            System.out.println("爬取不到视频地址："+document.select("script").size());
            return "null";
        }
    }

}
