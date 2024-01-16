package com.raveline.newsapp.domain.use_cases.news

import com.raveline.newsapp.domain.model.ArticleModel
import com.raveline.newsapp.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetStoredArticlesUseCase @Inject constructor(private val repository: NewsRepository) {
    operator fun invoke(): Flow<List<ArticleModel>> =
        repository.getAllStoredNews()
}