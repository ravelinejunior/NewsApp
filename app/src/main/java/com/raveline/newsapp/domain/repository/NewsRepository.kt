package com.raveline.newsapp.domain.repository

import androidx.paging.PagingData
import com.raveline.newsapp.domain.model.ArticleModel
import kotlinx.coroutines.flow.Flow

interface NewsRepository {
    fun getNews(sources: List<String>): Flow<PagingData<ArticleModel>>
}