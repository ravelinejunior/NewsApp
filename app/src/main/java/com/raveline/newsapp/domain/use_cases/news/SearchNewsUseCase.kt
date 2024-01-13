package com.raveline.newsapp.domain.use_cases.news

import androidx.paging.PagingData
import com.raveline.newsapp.domain.model.ArticleModel
import com.raveline.newsapp.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

/**
 * `SearchNewsUseCase` is a class that represents a use case for searching news.
 * This class is responsible for coordinating the flow of data to and from the `NewsRepository`.
 *
 * @property repository The repository is a private property injected into the constructor. It's an instance of `NewsRepository`.
 *
 * @constructor Creates a new instance of `SearchNewsUseCase`.
 * @param repository An instance of `NewsRepository` which is a required parameter for the class constructor.
 *
 * @function invoke This function is an operator function that triggers the use case. It takes in a query string and a list of sources, and returns a `Flow` of `PagingData` of `ArticleModel`.
 * @param query A `String` that represents the search query.
 * @param sources A `List<String>` that represents the list of sources to search from.
 * @return A `Flow<PagingData<ArticleModel>>` that represents the result of the search operation.
 */
class SearchNewsUseCase @Inject constructor(private val repository: NewsRepository) {
    operator fun invoke(query: String, sources: List<String>): Flow<PagingData<ArticleModel>> =
        repository.searchNews(query, sources)
}