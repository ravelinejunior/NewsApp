package com.raveline.newsapp.presentation.screen.search.components

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.raveline.newsapp.domain.use_cases.news.SearchNewsUseCase
import com.raveline.newsapp.utils.Constants.SourcesApiQueryList
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * `SearchViewModel` is a class that represents a ViewModel for searching news.
 * This class is responsible for managing the UI-related data in the lifecycle conscious way.
 * It communicates with the `SearchNewsUseCase` to get the data and updates the UI state accordingly.
 *
 * @property useCase The useCase is a private property injected into the constructor. It's an instance of `SearchNewsUseCase`.
 * @property _state A private mutable state of `SearchState`. This state is updated based on the search events.
 * @property state A public immutable state of `SearchState`. UI observes this state for any changes.
 *
 * @constructor Creates a new instance of `SearchViewModel`.
 * @param useCase An instance of `SearchNewsUseCase` which is a required parameter for the class constructor.
 *
 * @function onEvent This function takes in the search events and updates the state based on the event type.
 * @param events An instance of `SearchEvents` which represents the search related events.
 *
 * @function searchNews This is a private function that gets the articles from the use case and updates the articles in the state.
 */
@HiltViewModel
class SearchViewModel @Inject constructor(
    private val useCase: SearchNewsUseCase
) : ViewModel() {
    private val _state = mutableStateOf(SearchState())
    val state: State<SearchState> = _state

    fun onEvent(events: SearchEvents) {
        when (events) {
            is SearchEvents.UpdateSearchQuery -> {
                _state.value = state.value.copy(query = events.query)
            }

            is SearchEvents.SearchNews -> {
                searchNews()
            }
        }
    }

    private fun searchNews() {
        val articles = useCase(
            query = state.value.query,
            sources = SourcesApiQueryList
        ).cachedIn(viewModelScope)

        _state.value = state.value.copy(articles = articles)
    }
}