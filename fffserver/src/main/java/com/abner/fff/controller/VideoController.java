package com.abner.fff.controller;

import com.abner.fff.bean.Video;
import com.abner.fff.utils.RedisManager;
import com.abner.fff.utils.Result;
import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(value = "video")
@RestController()
@RequestMapping("/api")
public class VideoController {

    private final String EYE_TAG = "Eyepetizer";
    private final String V_TAG = "Vmovier";
    private final String X_TAG = "XingPianChang";

    @Autowired
    private RedisManager redisManager;

    @ApiOperation(value = "根据Tag获取Video",notes = "根据Tag获取Video",
            response = List.class, tags = {"Rule Cateory" })
    @ApiImplicitParam(name = "tag",value = "video的平台",required = true)
    @RequestMapping(value = "/getVideosByTag", method = RequestMethod.GET)
    public Result<List<Video>> getIndexTabs(
            @RequestParam(name = "tag") String tag) {
//        return "123";
        System.out.println(tag);
        if (EYE_TAG.equals(tag))
            return Result.ok(redisManager.getVideosByKeyAndTag(RedisManager.HOT_KEY, EYE_TAG));
        else if (V_TAG.equals(tag))
            return Result.ok(redisManager.getVideosByKeyAndTag(RedisManager.HOT_KEY, V_TAG));
        else if (X_TAG.equals(tag))
            return Result.ok(redisManager.getVideosByKeyAndTag(RedisManager.HOT_KEY,X_TAG));
        else
            return Result.error(null,"");
    }
}
