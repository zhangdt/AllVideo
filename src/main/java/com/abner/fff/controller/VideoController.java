package com.abner.fff.controller;

import com.abner.fff.bean.Video;
import com.abner.fff.utils.RedisManager;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/api")
public class VideoController {

    private final String EYE_TAG = "Eyepetizer";
    private final String V_TAG = "Vmovier";

    @Autowired
    private RedisManager redisManager;

    @RequestMapping(value = "/getVideosByTag", method = RequestMethod.GET)
    public List<Video> getIndexTabs(
            @RequestParam(name = "tag") String tag) {
//        return "123";
        System.out.println(tag);
        if (EYE_TAG.equals(tag))
            return redisManager.getVideosByKeyAndTag(RedisManager.HOT_KEY, EYE_TAG);
        else if (V_TAG.equals(tag))
            return redisManager.getVideosByKeyAndTag(RedisManager.HOT_KEY, V_TAG);
        else
            return null;
    }
}
