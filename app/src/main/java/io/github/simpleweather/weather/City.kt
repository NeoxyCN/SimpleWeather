package io.github.simpleweather.weather

import android.content.Context
import android.util.Log
import io.github.simpleweather.net.getAsync
import org.json.JSONArray

fun FetchCity(context: Context, province: String) {
    val ProvinceMap = FetchProvince(context)
    val ProvinceCode = ProvinceMap[province]

    val ProvinceUrl = "http://www.nmc.cn/f/rest/province/" + ProvinceCode
    Log.d("FetchCity", ProvinceUrl);
    var rawData = ""
    getAsync(ProvinceUrl) { responseBody ->
        rawData = responseBody
    }
    Log.d("FetchCity", rawData);
    val rawArray = JSONArray(rawData)
    val size = rawArray.length()
    Log.d("FetchCity", size.toString());
}