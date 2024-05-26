package io.github.simpleweather.net

import okhttp3.Call
import okhttp3.Callback
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import okio.IOException

fun getAsync(url: String, callback: (String) -> Unit) {
    val client = OkHttpClient()
    val request = Request.Builder()
        .url(url)
        .build()
    val call = client.newCall(request)

    call.enqueue(object : Callback {
        override fun onFailure(call: Call, e: IOException) {
            callback("failure")
        }

        override fun onResponse(call: Call, response: Response) {
            if (response.isSuccessful) {
                //Log.d("Net","response:"+ response.body.string())
                callback(response.body.string())
            }
        }
    })
}