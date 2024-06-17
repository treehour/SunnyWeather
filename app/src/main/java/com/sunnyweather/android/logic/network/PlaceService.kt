package com.sunnyweather.android.logic.network

import com.sunnyweather.android.SunnyWeatherApplication
import com.sunnyweather.android.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {

    @GET("v2/place?token=${SunnyWeatherApplication.TOKEN}&lang=zn_CN")//调用方法时发送一条GET请求
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>//Query动态指定城市数据，返回数据自动解析成PlaceResponse对象
}