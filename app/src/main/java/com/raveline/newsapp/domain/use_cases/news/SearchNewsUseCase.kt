package com.raveline.newsapp.domain.use_cases.news

import androidx.paging.PagingData
import com.raveline.newsapp.domain.model.ArticleModel
import com.raveline.newsapp.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class SearchNewsUseCase @Inject constructor(private val repository: NewsRepository) {
    operator fun invoke(query: String, sources: List<String>): Flow<PagingData<ArticleModel>> =
        repository.searchNews(query, sources)
}