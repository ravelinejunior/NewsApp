package com.raveline.newsapp.presentation.screen.home.components

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.raveline.newsapp.domain.use_cases.news.NewsUseCaseModel
import com.raveline.newsapp.utils.Constants.SourcesApiQueryList
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * `HomeViewModel` is a ViewModel class that is responsible for preparing and managing the data for `HomeScreen`.
 * It's annotated with `@HiltViewModel`, indicating that it's a ViewModel that will be injected by Hilt.
 *
 * @property state The current state of the home screen.
 * @property getNews A `Flow<PagingData<ArticleModel>>` that represents the news articles to be displayed.
 *
 * @constructor Injects the required dependencies.
 *
 * @param newsUseCaseModel An instance of `NewsUseCaseModel`.
 *
 * @method onEvent Handles the events from the UI and performs the necessary actions.
 * @method updateScrollValue Updates the current scroll value of the state.
 * @method updateMaxScrollValue Updates the maximum scroll value of the state.
 */
@HiltViewModel
class HomeViewModel @Inject constructor(
    newsUseCaseModel: NewsUseCaseModel
) : ViewModel() {

    var state = mutableStateOf(HomeState())
        private set

    val getNews = newsUseCaseModel.newsUseCase(
        sources = SourcesApiQueryList
    ).cachedIn(viewModelScope)

    fun onEvent(event: HomeEvent) {
        when (event) {
            is HomeEvent.UpdateScrollValue -> {
                updateScrollValue(newValue = event.newValue)
            }

            is HomeEvent.UpdateMaxScrollValue -> {
                updateMaxScrollValue(newValue = event.newValue)
            }
        }
    }

    private fun updateScrollValue(newValue: Int) {
        state.value = state.value.copy(scrollValue = newValue)
    }

    private fun updateMaxScrollValue(newValue: Int) {
        state.value = state.value.copy(maxScrollingValue = newValue)
    }
}