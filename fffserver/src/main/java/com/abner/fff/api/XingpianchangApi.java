package com.abner.fff.api;

import com.abner.fff.bean.XingPianChangVideoResp;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface XingpianchangApi {
    @GET
    Call<XingPianChangVideoResp> getVideoUrl(@Url String url);
}
