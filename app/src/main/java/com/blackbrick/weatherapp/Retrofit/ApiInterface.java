package com.blackbrick.weatherapp.Retrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("weather?appid=f848af7b978dffec84997276fc2ca8a2")
    Call<Example> getWeatherData(@Query("q") String name);
}
