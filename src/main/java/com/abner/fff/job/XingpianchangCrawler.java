package com.abner.fff.job;


import com.abner.fff.bean.XingPianChangVideoResp;
import com.abner.fff.service.XingpianchangService;
import com.abner.fff.utils.JsoupUtils;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class XingpianchangCrawler {
    private static final String TAG = "XingPianChang";

    @Autowired
    private XingpianchangService xingpianchangService;

    @Scheduled(fixedRate = 6000 * 6000 * 12)
    private void start() {
        getXingpianchangHotVideos();
    }

    /**
     * 爬取热门视频
     */
    private void getXingpianchangHotVideos() {
        //爬取新片场主页
        Document document = JsoupUtils.getDocWithPC("http://www.xinpianchang.com/channel/index/sort-like?from=tabArticle");
        Elements elements = null;
        if (document != null) {
            //新片场视频列表
            elements = document.select("li.enter-filmplay");
            for (Element element : elements) {
                String id = element.attr("data-articleid");
                System.out.println(id);
                System.out.println(element.select("p.fs_14").first().toString());
                System.out.println(element.select("img.lazy-img").first().attr("_src"));
                //根据id跳到视频播放页
                Document videoDoc = JsoupUtils.getDocWithPC("http://www.xinpianchang.com/a" + id + "?from=ArticleList");
                if (videoDoc != null) {
                    //获取vid
                    String regEx = "vid: \"([a-zA-z0-9])*\"";
//                    String regEx = "\\d+";
                    Pattern pattern = Pattern.compile(regEx);
                    Matcher matcher = pattern.matcher(videoDoc.toString());
                    if (matcher.find()) {
//                        System.out.println(matcher.group());
                        String vid = matcher.group().substring(6, matcher.group().length() - 1);
                        System.out.println(vid);
                        //根据vid请求接口拿到视频url数据
                        XingPianChangVideoResp xingPianChangVideoResp = xingpianchangService.getVideoUrl(vid);
                        if (xingPianChangVideoResp != null)
                        {
                            System.out.println(xingPianChangVideoResp.getData().getResource().getDefaultX().getHttps_url());
                        }
                    }
                }
            }
        }
    }
}
