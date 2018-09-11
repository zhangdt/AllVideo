package com.abner.fff.api;

import com.abner.fff.bean.EyeIndexTabsResp;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface EyepetizerApi {
    @GET()
    Call<EyeIndexTabsResp> getIndexTab(@Url String url);
}
