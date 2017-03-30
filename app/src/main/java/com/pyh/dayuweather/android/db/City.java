package com.pyh.dayuweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by pyh on 2017/3/30.
 */

public class City extends DataSupport{

    private int id;
    private String cityName;  //城市名字
    private int cityCode;   //城市代码号
    private int provinceId; //当前所属省份id

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getCityName(){
        return cityName;
    }

    public void setCityName(String cityName){
        this.cityName = cityName;
    }

    public int getCityCode(){
        return cityCode;
    }

    public void setCityCode(int cityCode){
        this.cityCode = cityCode;
    }

    public int getProvinceId(){
        return provinceId;
    }

    public void setProvinceId(int provinceId){
        this.provinceId = provinceId;
    }
}
