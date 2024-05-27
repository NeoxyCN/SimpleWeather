package io.github.simpleweather.weather

import android.content.Context
import io.github.simpleweather.R

val ProvinceNum = 34;

fun FetchProvince(context: Context): MutableMap<String, String> {
    return mutableMapOf(
        context.getString(R.string.province_beijing) to "ABJ",
        context.getString(R.string.province_tianjin) to "ATJ",
        context.getString(R.string.province_hebei) to "AHE",
        context.getString(R.string.province_shanxi) to "ASX",
        context.getString(R.string.province_neimenggu) to "ANM",
        context.getString(R.string.province_liaoning) to "ALN",
        context.getString(R.string.province_jilin) to "AJL",
        context.getString(R.string.province_heilongjiang) to "AHL",
        context.getString(R.string.province_shanghai) to "ASH",
        context.getString(R.string.province_jiangsu) to "AJS",
        context.getString(R.string.province_zhejiang) to "AZJ",
        context.getString(R.string.province_anhui) to "AAH",
        context.getString(R.string.province_fujian) to "AFJ",
        context.getString(R.string.province_jiangxi) to "AJX",
        context.getString(R.string.province_shandong) to "ASD",
        context.getString(R.string.province_henan) to "AHA",
        context.getString(R.string.province_hubei) to "AHB",
        context.getString(R.string.province_hunan) to "AHN",
        context.getString(R.string.province_guangdong) to "AGD",
        context.getString(R.string.province_guangxi) to "AGX",
        context.getString(R.string.province_hainan) to "AHI",
        context.getString(R.string.province_chongqing) to "ACQ",
        context.getString(R.string.province_sichuan) to "ASC",
        context.getString(R.string.province_guizhou) to "AGZ",
        context.getString(R.string.province_yunan) to "AYN",
        context.getString(R.string.province_xizang) to "AXZ",
        context.getString(R.string.province_shanxi2) to "ASN",
        context.getString(R.string.province_gansu) to "AGS",
        context.getString(R.string.province_qinghai) to "AQH",
        context.getString(R.string.province_ningxia) to "ANX",
        context.getString(R.string.province_xinjiang) to "AXJ",
        context.getString(R.string.province_hongkong) to "AXG",
        context.getString(R.string.province_macau) to "AAM",
        context.getString(R.string.province_taiwan) to "ATW",
    )
}