package com.raveline.newsapp.domain.use_cases.news

import androidx.paging.PagingData
import com.raveline.newsapp.domain.model.ArticleModel
import com.raveline.newsapp.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow

class GetNewsUseCase(private val newsRepository: NewsRepository) {
    operator fun invoke(sources: List<String>): Flow<PagingData<ArticleModel>> {
        return newsRepository.getNews(sources = sources)
    }
}