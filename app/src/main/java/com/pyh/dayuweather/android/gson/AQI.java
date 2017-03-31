package com.pyh.dayuweather.android.gson;

/**
 * Created by pyh on 2017/3/31.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;

        public String pm25;
    }
}
