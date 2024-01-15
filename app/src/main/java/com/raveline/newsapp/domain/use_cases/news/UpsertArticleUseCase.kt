package com.raveline.newsapp.domain.use_cases.news

import com.raveline.newsapp.data.local.NewsDao
import com.raveline.newsapp.domain.model.ArticleModel
import javax.inject.Inject

class UpsertArticleUseCase @Inject constructor(private val dao: NewsDao) {
    suspend operator fun invoke(articleModel: ArticleModel){
        dao.insertNews(articleModel)
    }
}