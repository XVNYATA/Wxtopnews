package com.github.xvnyata.wxtopnews.task;

import android.os.AsyncTask;

import com.github.xvnyata.wxtopnews.http.RestClient;
import com.github.xvnyata.wxtopnews.model.News;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by xvnyata on 16-3-11.
 */
public class Getnews extends AsyncTask {
   public List<News.StoriesEntity> entityList;
    @Override
    protected Object doInBackground(Object[] params) {
        RestClient.api().getgson("20160310").enqueue(new Callback<News>() {
            @Override
            public void onResponse(Call<News> call, Response<News> response) {
                entityList=response.body().getStories();
            }

            @Override
            public void onFailure(Call<News> call, Throwable t) {

            }
        });
        return entityList;
    }

    @Override
    protected void onPostExecute(Object o) {
        //更新uI
        super.onPostExecute(o);
    }
}
