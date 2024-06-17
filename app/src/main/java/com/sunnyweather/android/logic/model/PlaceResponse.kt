package com.sunnyweather.android.logic.model

import com.google.gson.annotations.SerializedName

data class PlaceResponse(val status:String,val places:List<Place>)//译：地点响应

data class Place(val name:String,val location:Location,@SerializedName("formatted_address") val address:String)//译：地点
//@SerializedName让json字段和kotlin字段建立映射关系

data class Location(val lng:String, val lat:String)//译：定位