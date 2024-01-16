package com.raveline.newsapp.domain.use_cases.news

import com.raveline.newsapp.domain.model.ArticleModel
import com.raveline.newsapp.domain.repository.NewsRepository
import javax.inject.Inject

class UpsertArticleUseCase @Inject constructor(private val repository: NewsRepository) {
    suspend operator fun invoke(articleModel: ArticleModel) {
        repository.upsertArticle(articleModel)
    }
}