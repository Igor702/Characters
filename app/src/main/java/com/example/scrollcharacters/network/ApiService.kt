package com.example.scrollcharacters.network

import com.example.scrollcharacters.models.ModelRequest
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET


private const val BASE_URL = "https://rickandmortyapi.com/api/"

private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

val logger: HttpLoggingInterceptor =
    run {
        val httpLoggingInterceptor = HttpLoggingInterceptor()
        httpLoggingInterceptor.apply {
            httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        }
    }
val okHttpClient: OkHttpClient =
    OkHttpClient.Builder().addInterceptor(com.example.scrollcharacters.network.logger).build()

private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .client(okHttpClient)
    .baseUrl(BASE_URL)
    .build()


interface CharactersServiceApi {

    @GET("character?")
    suspend fun loadCharacters(): ModelRequest
}

object CharactersApi {
    val retrofitService: CharactersServiceApi by lazy {
        retrofit.create(CharactersServiceApi::class.java)
    }

}