package com.github.xvnyata.wxtopnews.http;

import com.github.xvnyata.wxtopnews.model.News;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by xvnyata on 16-3-11.
 */
public interface ApiService {
    @GET("{day}")
    Call<News> getgson(@Path("day") String day);
}
