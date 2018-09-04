package com.abner.fff.job;

import com.abner.fff.bean.EyeIndexTabsResp;
import com.abner.fff.bean.Video;
import com.abner.fff.service.EyepetizerService;
import com.abner.fff.utils.RedisManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class EyepetizerCrawler {
    private static final String TAG = "Eyepetizer";
    private List<Video> videos = new ArrayList<>();

    @Autowired
    private RedisManager redisManager;

    @Autowired
    private EyepetizerService eyepetizerService;
    @Scheduled(fixedRate = 6000*6000*12)
    private void start(){
        System.out.println("EyepetizerCrawler start");
//        System.out.println(
        EyeIndexTabsResp eyeIndexTabsResp = eyepetizerService.getIndexTabs("http://baobab.kaiyanapp.com/api/v4/tabs/selected");
        for (EyeIndexTabsResp.ItemListBean item:eyeIndexTabsResp.getItemList())
        {
            Video video = new Video();
            if ("video".equals(item.getType()))
            {
                System.out.println(item.getData().getTitle());
                video.setType(TAG);
                video.setTitle(item.getData().getTitle());
                video.setDescription(item.getData().getDescription());
                video.setHeaderImage(item.getData().getCover().getHomepage());
                video.setDate(item.getData().getDate());
                video.setPlayUrl(item.getData().getPlayUrl());
                videos.add(video);
            }
        }
        redisManager.saveVideos(RedisManager.HOT_KEY+"_"+TAG,videos);
//        saveNewsToRedis(mPage);
//        mPage++;
    }

}
