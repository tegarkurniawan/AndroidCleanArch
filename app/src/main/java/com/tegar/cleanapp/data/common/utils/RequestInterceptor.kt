package com.tegar.cleanapp.data.common.utils

import com.tegar.cleanapp.infra.utils.SharedPrefs
import okhttp3.Interceptor
import okhttp3.Response

class RequestInterceptor constructor(private val pref: SharedPrefs) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val token = pref.getToken()
        val newReq = chain.request().newBuilder().addHeader("Authorization", token).build()
        return chain.proceed(newReq)
    }
}