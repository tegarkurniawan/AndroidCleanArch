package com.tegar.cleanapp.data.login

import com.tegar.cleanapp.data.common.module.NetworkModule
import com.tegar.cleanapp.data.login.remote.api.LoginApi
import com.tegar.cleanapp.data.login.repository.LoginRepositoryImpl
import com.tegar.cleanapp.domain.login.LoginRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module(includes = [NetworkModule::class])
@InstallIn(SingletonComponent::class)
class LoginModule {

    @Singleton
    @Provides
    fun provideLoginApi(retrofit: Retrofit) : LoginApi {
        return retrofit.create(LoginApi::class.java)
    }

    @Singleton
    @Provides
    fun provideLoginRepository(loginApi: LoginApi) : LoginRepository {
        return LoginRepositoryImpl(loginApi)
    }


}