package com.example.restapi_dipti_16.ViewModel_16

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.restapi_dipti_16.ApiInsatance_16.apiService
import com.example.restapi_dipti_16.Product16
import kotlinx.coroutines.launch

class ProductViewModel_16:ViewModel() {


    private val _product = MutableLiveData<List<Product16>>()
    val products: LiveData<List<Product16>> get() = _product


    init {
        viewModelScope.launch{
            fetchproducts()
        }
    }

    private suspend fun fetchproducts() {
        try {
            val response =  apiService.getProducts()
            _product.postValue(response)
        }catch (e:Exception){

        }
    }
}