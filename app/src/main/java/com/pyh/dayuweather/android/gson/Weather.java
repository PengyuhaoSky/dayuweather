package com.pyh.dayuweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by pyh on 2017/3/31.
 */

public class Weather {   //创建实例类来引用创建的实体类

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;    //daily_forecast包含是一个数组
}
