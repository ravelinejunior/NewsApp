package com.raveline.newsapp.data.remote.datasource

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.raveline.newsapp.data.remote.dto.NewsResponseModel
import com.raveline.newsapp.data.remote.services.NewsApi
import com.raveline.newsapp.domain.model.ArticleModel

class SearchNewsPagingSource(
    private val newsApi: NewsApi,
    private val query: String,
    private val sources: String
) : PagingSource<Int, ArticleModel>() {
    private var totalNewsCount = 0
    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, ArticleModel> {
        val page = params.key ?: 1
        return try {
            val response = newsApi.searchNews(
                query = query,
                page = page,
                sources = sources
            )
            val searchResponse: NewsResponseModel

            if (response.isSuccessful && response.body() != null) {
                searchResponse = response.body()!!
            } else {
                return LoadResult.Error(Throwable(response.message()))
            }

            totalNewsCount += searchResponse.totalResults

            val articles = searchResponse.articles.distinctBy { it.title } // Remove Duplicates

            return LoadResult.Page(
                data = articles,
                nextKey = if (totalNewsCount == searchResponse.totalResults) null else page + 1,
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