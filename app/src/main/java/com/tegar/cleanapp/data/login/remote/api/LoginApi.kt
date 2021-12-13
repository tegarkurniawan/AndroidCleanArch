package com.tegar.cleanapp.data.login.remote.api

import com.tegar.cleanapp.data.common.utils.WrappedResponse
import com.tegar.cleanapp.data.login.remote.dto.LoginRequest
import com.tegar.cleanapp.data.login.remote.dto.LoginResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface LoginApi {
    @POST("auth/login")
    suspend fun login(@Body loginRequest: LoginRequest) : Response<WrappedResponse<LoginResponse>>

}