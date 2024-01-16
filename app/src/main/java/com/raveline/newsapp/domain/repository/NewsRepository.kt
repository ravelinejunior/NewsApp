package com.raveline.newsapp.domain.repository

import androidx.paging.PagingData
import com.raveline.newsapp.domain.model.ArticleModel
import kotlinx.coroutines.flow.Flow

interface NewsRepository {
    fun getNews(sources: List<String>): Flow<PagingData<ArticleModel>>
    fun searchNews(query: String, sources: List<String>): Flow<PagingData<ArticleModel>>

    suspend fun upsertArticle(articleModel: ArticleModel)
    suspend fun deleteArticle(articleModel: ArticleModel)

    fun getAllStoredNews():Flow<List<ArticleModel>>
    suspend fun getSelectedArticle(url:String):ArticleModel?
}