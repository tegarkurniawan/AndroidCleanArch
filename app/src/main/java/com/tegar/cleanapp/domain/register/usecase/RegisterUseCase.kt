package com.tegar.cleanapp.domain.register.usecase

import com.tegar.cleanapp.data.common.utils.WrappedResponse
import com.tegar.cleanapp.data.register.remote.dto.RegisterRequest
import com.tegar.cleanapp.data.register.remote.dto.RegisterResponse
import com.tegar.cleanapp.domain.common.base.BaseResult
import com.tegar.cleanapp.domain.register.RegisterRepository
import com.tegar.cleanapp.domain.register.entity.RegisterEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class RegisterUseCase @Inject constructor(private val registerRepository: RegisterRepository) {
    suspend fun invoke(registerRequest: RegisterRequest) : Flow<BaseResult<RegisterEntity, WrappedResponse<RegisterResponse>>> {
        return registerRepository.register(registerRequest)
    }
}