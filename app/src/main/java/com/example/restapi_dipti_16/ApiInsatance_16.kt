package com.example.restapi_dipti_16

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiInsatance_16 {
    val retrofit = Retrofit.Builder()
        .baseUrl("https://api.escuelajs.co/api/v1/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()


    val apiService = retrofit.create(ApiService_16::class.java)

}