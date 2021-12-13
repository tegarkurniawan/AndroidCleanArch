package com.tegar.cleanapp.domain.register.entity

data class RegisterEntity(
    val id: Int,
    val name: String,
    val email: String,
    val token: String
)