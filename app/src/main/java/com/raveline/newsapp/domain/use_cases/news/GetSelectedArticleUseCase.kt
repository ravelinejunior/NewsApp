package com.raveline.newsapp.domain.use_cases.news

import com.raveline.newsapp.domain.model.ArticleModel
import com.raveline.newsapp.domain.repository.NewsRepository
import javax.inject.Inject

class GetSelectedArticleUseCase @Inject constructor(private val repository: NewsRepository) {
    suspend operator fun invoke(url: String): ArticleModel? =
        repository.getSelectedArticle(url = url)
}