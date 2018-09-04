package com.abner.fff.service.impl;

import com.abner.fff.api.EyepetizerApi;
import com.abner.fff.bean.EyeIndexTabsResp;
import com.abner.fff.service.EyepetizerService;
import com.abner.fff.utils.RetrofitManager;
import okhttp3.ResponseBody;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.IOException;

@Service
public class EyepetizerServiceImpl implements EyepetizerService {

    @Override
    public EyeIndexTabsResp getIndexTabs(String url) {
        try {
            return RetrofitManager
                    .getInstance()
                    .getRetrofitByTag("http://baobab.kaiyanapp.com/api/v4/")
                    .create(EyepetizerApi.class)
                    .getIndexTab(url)
                    .execute()
                    .body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
//                .execute(new Callback<EyeIndexTabsResp>() {
//                    @Override
//                    public void onResponse(Call<EyeIndexTabsResp> call, Response<EyeIndexTabsResp> response) {
//                        return response.body();
//                    }
//                    @Override
//                    public void onFailure(Call<EyeIndexTabsResp> call, Throwable throwable) {
//                        System.out.println(throwable.getMessage());
//                    }
//                });

    }
}
