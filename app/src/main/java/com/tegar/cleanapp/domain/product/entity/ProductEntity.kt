package com.tegar.cleanapp.domain.product.entity

data class ProductEntity(
    var id: Int,
    var name: String,
    var price: Int,
    var user: ProductUserEntity
)
