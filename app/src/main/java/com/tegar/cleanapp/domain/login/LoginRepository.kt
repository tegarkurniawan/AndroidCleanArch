package com.tegar.cleanapp.domain.login

import com.tegar.cleanapp.data.common.utils.WrappedResponse
import com.tegar.cleanapp.data.login.remote.dto.LoginRequest
import com.tegar.cleanapp.data.login.remote.dto.LoginResponse
import com.tegar.cleanapp.domain.common.base.BaseResult
import com.tegar.cleanapp.domain.login.entity.LoginEntity
import kotlinx.coroutines.flow.Flow

interface LoginRepository {
    suspend fun login(loginRequest: LoginRequest) : Flow<BaseResult<LoginEntity, WrappedResponse<LoginResponse>>>
}