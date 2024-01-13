package com.raveline.newsapp.presentation.screen.search.components

import androidx.paging.PagingData
import com.raveline.newsapp.domain.model.ArticleModel
import kotlinx.coroutines.flow.Flow

data class SearchState(
    val query: String = "",
    val articles: Flow<PagingData<ArticleModel>>?=null
)
