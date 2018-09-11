package com.abner.fff.utils;

import com.abner.fff.bean.Video;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 视频资源管理器
 */
@Component
public class RedisManager {

    public static final String HOT_KEY = "hot_key";

    @Autowired
    private  StringRedisTemplate stringRedisTemplate;

    /**
     *  保存视频信息到 Redis
     */
    public void saveVideos(String key, List<Video> videos){
        String value = JSONObject.toJSONString(videos);
        stringRedisTemplate.opsForValue().set(key, value);
    }

    /**
     *  得到视频信息
     */
    public List<Video> getVideosByKeyAndTag(String key, String tag){
        key = key + "_" + tag;
        String cacheValue = stringRedisTemplate.opsForValue().get(key);
        return JSONObject.parseArray(cacheValue, Video.class);
    }

}