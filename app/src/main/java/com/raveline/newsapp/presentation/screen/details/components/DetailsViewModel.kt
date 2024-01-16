package com.raveline.newsapp.presentation.screen.details.components

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.raveline.newsapp.domain.model.ArticleModel
import com.raveline.newsapp.domain.use_cases.news.NewsUseCaseModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * `DetailsViewModel` is a ViewModel class that is responsible for preparing and managing the data for `DetailsScreen`.
 * It's annotated with `@HiltViewModel`, indicating that it's a ViewModel that will be injected by Hilt.
 *
 * @property newsUseCase An instance of `NewsUseCaseModel` which is used to interact with the data layer of the application.
 * @property sideEffect A mutable state that holds a String value. It's used to handle side effects in the UI.
 *
 * @constructor Injects the required dependencies.
 *
 * @param newsUseCase An instance of `NewsUseCaseModel`.
 *
 * @method onEvent Handles the events from the UI and performs the necessary actions.
 * @method upsertArticle Inserts or updates an article in the database.
 * @method deleteArticle Deletes an article from the database.
 */
@HiltViewModel
class DetailsViewModel @Inject constructor(
    private val newsUseCase: NewsUseCaseModel
) : ViewModel() {
    var sideEffect by mutableStateOf<String?>(null)
        private set

    fun onEvent(event: DetailsEvent) {
        when (event) {
            is DetailsEvent.UpsertArticle -> {
                viewModelScope.launch {
                    val article = newsUseCase.getSelectedArticleUseCase.invoke(event.article.url)
                    if (article == null) {
                        upsertArticle(article = event.article.copy(isStored = true))
                    } else {
                        deleteArticle(article = event.article)
                    }
                }
            }

            is DetailsEvent.RemoveSideEffect -> {
                sideEffect = null
            }

            is DetailsEvent.UpdateIconHeader -> {

            }
        }
    }

    private suspend fun upsertArticle(article: ArticleModel) {
        newsUseCase.upsertArticleUseCase.invoke(article)
        sideEffect = "Article Saved Successfully"
    }

    private suspend fun deleteArticle(article: ArticleModel) {
        newsUseCase.deleteArticleUseCase.invoke(article)
        sideEffect = "Article Deleted Successfully"
    }
}