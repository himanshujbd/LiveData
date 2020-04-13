package com.madhusudan.livedatademo.ui.interfaces

import com.madhusudan.livedatademo.network.data.Country
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface RetrofitApiService {

    @GET("summary")
    fun fetchData(): Call<Country>

    companion object {
        operator fun invoke(): RetrofitApiService {
            return Retrofit.Builder()
                .baseUrl("https://api.covid19api.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(RetrofitApiService::class.java)
        }
    }
}