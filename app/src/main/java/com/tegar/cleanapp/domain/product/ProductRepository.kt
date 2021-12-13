package com.tegar.cleanapp.domain.product

import com.tegar.cleanapp.data.common.utils.WrappedListResponse
import com.tegar.cleanapp.data.common.utils.WrappedResponse
import com.tegar.cleanapp.data.product.remote.dto.ProductCreateRequest
import com.tegar.cleanapp.data.product.remote.dto.ProductResponse
import com.tegar.cleanapp.data.product.remote.dto.ProductUpdateRequest
import com.tegar.cleanapp.domain.common.base.BaseResult
import com.tegar.cleanapp.domain.product.entity.ProductEntity
import kotlinx.coroutines.flow.Flow

interface ProductRepository {
    suspend fun getAllMyProducts() : Flow<BaseResult<List<ProductEntity>, WrappedListResponse<ProductResponse>>>
    suspend fun getProductById(id: String) : Flow<BaseResult<ProductEntity, WrappedResponse<ProductResponse>>>
    suspend fun updateProduct(productUpdateRequest: ProductUpdateRequest, id: String) : Flow<BaseResult<ProductEntity, WrappedResponse<ProductResponse>>>
    suspend fun deleteProductById(id: String) : Flow<BaseResult<Unit, WrappedResponse<ProductResponse>>>
    suspend fun createProduct(productCreateRequest: ProductCreateRequest) : Flow<BaseResult<ProductEntity, WrappedResponse<ProductResponse>>>
}