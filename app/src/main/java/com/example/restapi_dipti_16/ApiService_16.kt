package com.example.restapi_dipti_16

import retrofit2.http.GET

interface ApiService_16 {
    @GET("products")
    suspend fun getProducts():List<Product16>

}