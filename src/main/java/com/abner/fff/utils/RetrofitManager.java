package com.abner.fff.utils;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.HashMap;

public class RetrofitManager {
    private HashMap<String, Retrofit> retrofits = new HashMap<String, Retrofit>();
    private static RetrofitManager instance;

    public static RetrofitManager getInstance() {
        if (instance != null) {
            return instance;
        }
        return new RetrofitManager();
    }

    public Retrofit getRetrofitByTag(String url) {
        if (retrofits.get(url) != null) {
            return retrofits.get(url);
        } else {
            Retrofit retrofit = new Retrofit
                    .Builder()
                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            retrofits.put(url, retrofit);
            return retrofit;
        }
    }

}
