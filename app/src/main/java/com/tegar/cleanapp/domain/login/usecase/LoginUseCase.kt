package com.tegar.cleanapp.domain.login.usecase

import com.tegar.cleanapp.data.common.utils.WrappedResponse
import com.tegar.cleanapp.data.login.remote.dto.LoginRequest
import com.tegar.cleanapp.data.login.remote.dto.LoginResponse
import com.tegar.cleanapp.domain.common.base.BaseResult
import com.tegar.cleanapp.domain.login.LoginRepository
import com.tegar.cleanapp.domain.login.entity.LoginEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class LoginUseCase @Inject constructor(private val loginRepository: LoginRepository) {
    suspend fun execute(loginRequest: LoginRequest): Flow<BaseResult<LoginEntity, WrappedResponse<LoginResponse>>> {
        return loginRepository.login(loginRequest)
    }

}
