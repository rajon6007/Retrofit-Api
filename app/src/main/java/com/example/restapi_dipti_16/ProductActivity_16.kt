package com.example.restapi_dipti_16

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.restapi_dipti_16.Adapter.ProductAdapter16
import com.example.restapi_dipti_16.ViewModel_16.ProductViewModel_16
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ProductActivity_16 : AppCompatActivity() {
    private lateinit var productViewModel: ProductViewModel_16
    private lateinit var productAdapter: ProductAdapter16

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product16)

        productViewModel = ViewModelProvider(this).get(ProductViewModel_16::class.java)
        productAdapter = ProductAdapter16(emptyList())

        val refreshBtn: FloatingActionButton = findViewById(R.id.refreshBtn)

        refreshBtn.setOnClickListener{
            startActivity(Intent(this@ProductActivity_16,ProductActivity_16::class.java))
            finish()
        }

        val recyclerView: RecyclerView = findViewById(R.id.productRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        productViewModel.products.observe(this, Observer { product->
            productAdapter = ProductAdapter16(product)
            recyclerView.adapter = productAdapter
        })

    }
}