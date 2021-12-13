package com.tegar.cleanapp.domain.product.usecase

import com.tegar.cleanapp.data.common.utils.WrappedResponse
import com.tegar.cleanapp.data.product.remote.dto.ProductResponse
import com.tegar.cleanapp.domain.common.base.BaseResult
import com.tegar.cleanapp.domain.product.ProductRepository
import com.tegar.cleanapp.domain.product.entity.ProductEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetProductByIdUseCase @Inject constructor(private val productRepository: ProductRepository) {
    suspend fun invoke(id: String) : Flow<BaseResult<ProductEntity, WrappedResponse<ProductResponse>>> {
        return productRepository.getProductById(id)
    }
}
