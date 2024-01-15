package com.raveline.newsapp.domain.use_cases.news

import com.raveline.newsapp.data.local.NewsDao
import com.raveline.newsapp.domain.model.ArticleModel
import javax.inject.Inject

class DeleteArticleUseCase @Inject constructor(private val dao: NewsDao) {
    suspend operator fun invoke(articleModel: ArticleModel){
        dao.deleteNews(articleModel)
    }
}