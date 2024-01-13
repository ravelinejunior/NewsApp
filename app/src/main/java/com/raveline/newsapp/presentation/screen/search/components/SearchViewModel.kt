package com.raveline.newsapp.presentation.screen.search.components

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.raveline.newsapp.domain.use_cases.news.SearchNewsUseCase
import com.raveline.newsapp.presentation.screen.search.components.SearchEvents
import com.raveline.newsapp.presentation.screen.search.components.SearchState
import com.raveline.newsapp.utils.Constants.SourcesApiQueryList
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

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