package com.pyh.dayuweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by pyh on 2017/3/31.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
