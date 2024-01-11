package com.raveline.newsapp.data.remote.services

import com.raveline.newsapp.data.remote.dto.NewsResponseModel
import com.raveline.newsapp.utils.Constants.API_NEWS_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {
    @GET("everything")
    suspend fun getNews(
        @Query("page") page: Int,
        @Query("sources") sources: String,
        @Query("apiKey") apiKey: String = API_NEWS_KEY
    ): Response<NewsResponseModel>
}