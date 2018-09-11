package com.abner.fff.service.impl;

import com.abner.fff.api.XingpianchangApi;
import com.abner.fff.bean.XingPianChangVideoResp;
import com.abner.fff.service.XingpianchangService;
import com.abner.fff.utils.RetrofitManager;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class XingpianchangServiceImpl implements XingpianchangService {

    @Override
    public XingPianChangVideoResp getVideoUrl(String vid) {
        try {
            return RetrofitManager
                    .getInstance()
                    .getRetrofitByTag("https://openapi-vtom.vmovier.com/v3/")
                    .create(XingpianchangApi.class)
                    .getVideoUrl("https://openapi-vtom.vmovier.com/v3/video/"+vid+"?expand=resource,resource_origin?")
                    .execute()
                    .body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
