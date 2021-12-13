package com.tegar.cleanapp.persentation.main.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tegar.cleanapp.databinding.ItemProductBinding
import com.tegar.cleanapp.domain.product.entity.ProductEntity


class HomeProductAdapter(private val products: MutableList<ProductEntity>) : RecyclerView.Adapter<HomeProductAdapter.ViewHolder>(){
    interface OnItemTap {
        fun onTap(product: ProductEntity)
    }

    fun setItemTapListener(l: OnItemTap){
        onTapListener = l
    }

    private var onTapListener: OnItemTap? = null

    fun updateList(mProducts: List<ProductEntity>){
        products.clear()
        products.addAll(mProducts)
        notifyDataSetChanged()
    }

    inner class ViewHolder(private val itemBinding: ItemProductBinding) : RecyclerView.ViewHolder(itemBinding.root){
        fun bind(product: ProductEntity){
            itemBinding.productNameTextView.text = product.name
            itemBinding.root.setOnClickListener {
                onTapListener?.onTap(product)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = ItemProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(products[position])

    override fun getItemCount() = products.size
}
