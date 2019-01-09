package com.mahesaiqbal.androidversionwithrx.network

import com.mahesaiqbal.androidversionwithrx.model.Android
import io.reactivex.Observable
import retrofit2.http.GET

interface Service {
    @GET("api/android")
    fun getData(): Observable<List<Android>>
}