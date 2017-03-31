package com.pyh.dayuweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by pyh on 2017/3/31.
 */

public class Basic {

    @SerializedName("city")         //用@SerializedName让JSON自断和java字段之间建立映射关系
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }
}
