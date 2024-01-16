package com.raveline.newsapp.domain.use_cases.news

import com.raveline.newsapp.domain.model.ArticleModel
import com.raveline.newsapp.domain.repository.NewsRepository
import javax.inject.Inject

class DeleteArticleUseCase @Inject constructor(private val repository: NewsRepository) {
    suspend operator fun invoke(articleModel: ArticleModel) {
        repository.deleteArticle(articleModel)
    }
}