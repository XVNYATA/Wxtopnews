package com.github.xvnyata.wxtopnews.http;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by xvnyata on 16-3-11.
 */
public class RestClient {
    private static final String BASE_URL = "http://news.at.zhihu.com/api/4/news/before/";
    private static RestClient instance = new RestClient();
    private static ApiService api;

    private RestClient() {
        OkHttpClient okHttpClient = new OkHttpClient();
        // okHttpClient.networkInterceptors().add(new AddHeaderInterceptor());
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        api = retrofit.create(ApiService.class);


    }

    public static ApiService api() {
        return api;
    }
}