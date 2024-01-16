package com.raveline.newsapp.data.repository_impl

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.raveline.newsapp.data.local.NewsDao
import com.raveline.newsapp.data.remote.datasource.NewsPagingSource
import com.raveline.newsapp.data.remote.datasource.SearchNewsPagingSource
import com.raveline.newsapp.data.remote.services.NewsApi
import com.raveline.newsapp.domain.model.ArticleModel
import com.raveline.newsapp.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

class NewsRepositoryImpl @Inject constructor(
    private val newsApi: NewsApi,
    private val newsDao: NewsDao,
) : NewsRepository {
    override fun getNews(sources: List<String>): Flow<PagingData<ArticleModel>> {
        return Pager(
            config = PagingConfig(10),
            pagingSourceFactory = {
                NewsPagingSource(
                    newsApi = newsApi,
                    sources = sources.joinToString(",")
                )
            }
        ).flow
    }

    override fun searchNews(query: String, sources: List<String>): Flow<PagingData<ArticleModel>> {
        return Pager(
            config = PagingConfig(10),
            pagingSourceFactory = {
                SearchNewsPagingSource(
                    newsApi = newsApi,
                    query = query,
                    sources = sources.joinToString(",")
                )
            }
        ).flow
    }

    override suspend fun upsertArticle(articleModel: ArticleModel) {
        newsDao.upsertNews(articleModel)
    }

    override suspend fun deleteArticle(articleModel: ArticleModel) {
        newsDao.deleteNews(articleModel)
    }

    override fun getAllStoredNews(): Flow<List<ArticleModel>> {
        return newsDao.getAllStoredNews().onEach { it.reversed() }
    }

    override suspend fun getSelectedArticle(url: String): ArticleModel? {
        return newsDao.getSelectedArticle(url)
    }
}