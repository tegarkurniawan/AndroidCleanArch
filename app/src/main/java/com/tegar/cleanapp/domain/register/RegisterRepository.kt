package com.tegar.cleanapp.domain.register

import com.tegar.cleanapp.data.common.utils.WrappedResponse
import com.tegar.cleanapp.data.register.remote.dto.RegisterRequest
import com.tegar.cleanapp.data.register.remote.dto.RegisterResponse
import com.tegar.cleanapp.domain.common.base.BaseResult
import com.tegar.cleanapp.domain.register.entity.RegisterEntity
import kotlinx.coroutines.flow.Flow

interface RegisterRepository {
    suspend fun register(registerRequest: RegisterRequest) : Flow<BaseResult<RegisterEntity,WrappedResponse<RegisterResponse>>>
}