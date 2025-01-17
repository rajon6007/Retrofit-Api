package com.example.restapi_dipti_16.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.restapi_dipti_16.Product16
import com.example.restapi_dipti_16.R

class ProductAdapter16(private val products:List<Product16>): RecyclerView.Adapter<ProductAdapter16.ProductViewHolder>() {
    inner class ProductViewHolder(iteView: View): RecyclerView.ViewHolder(iteView) {

        val productImg = iteView.findViewById<ImageView>(R.id.productImage)
        val productName = iteView.findViewById<TextView>(R.id.nameTxt)
        val productPrice = iteView.findViewById<TextView>(R.id.priceTxt)
        val productId=iteView.findViewById<TextView>(R.id.Id)
        val productDesc=iteView.findViewById<TextView>(R.id.desId)

        fun bind(product: Product16){
            productName.text = product.title
            productPrice.text = "$${product.price}"
            productId.text= product.id.toString()
            productDesc.text = product.description

            Glide.with(itemView).load(product.images[0])
                .into(productImg)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.product_list_16,parent,false)
        return ProductViewHolder(view)
    }

    override fun getItemCount(): Int {
        return products.size
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val product = products[position]
        holder.bind(product)
    }
}