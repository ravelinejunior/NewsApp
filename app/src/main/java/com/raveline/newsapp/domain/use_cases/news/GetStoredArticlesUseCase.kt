package com.raveline.newsapp.domain.use_cases.news

import com.raveline.newsapp.data.local.NewsDao
import com.raveline.newsapp.domain.model.ArticleModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetStoredArticlesUseCase @Inject constructor(private val dao: NewsDao) {
    operator fun invoke(): Flow<List<ArticleModel>> =
        dao.getAllStoredNews()
}