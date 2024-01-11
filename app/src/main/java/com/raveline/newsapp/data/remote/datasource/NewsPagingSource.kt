package com.raveline.newsapp.data.remote.datasource

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.raveline.newsapp.data.remote.dto.NewsResponseModel
import com.raveline.newsapp.data.remote.services.NewsApi
import com.raveline.newsapp.domain.model.ArticleModel

class NewsPagingSource(
    private val newsApi: NewsApi,
    private val sources: String
) : PagingSource<Int, ArticleModel>() {
    private var totalNewsCount = 0

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, ArticleModel> {
        val page = params.key ?: 1
        return try {
            val response = newsApi.getNews(sources = sources, page = page)
            val newsResponse: NewsResponseModel
            if (response.isSuccessful && response.body() != null) {
                newsResponse = response.body()!!
            } else {
                return LoadResult.Error(Throwable(response.message()))
            }

            totalNewsCount += newsResponse.totalResults
            val articles =
                newsResponse.articles.distinctBy { it.title } // Remove Duplicates

            return LoadResult.Page(
                data = articles,
                nextKey = if (totalNewsCount == newsResponse.totalResults) null else page + 1,
                prevKey = null
            )
        } catch (e: Exception) {
            e.printStackTrace()
            LoadResult.Error(throwable = e)
        }
    }

    override fun getRefreshKey(state: PagingState<Int, ArticleModel>): Int? {
        return state.anchorPosition?.let { anchor ->
            val anchorPage = state.closestPageToPosition(anchorPosition = anchor)
            anchorPage?.prevKey?.plus(1) ?: anchorPage?.nextKey?.minus(1)
        }
    }

}