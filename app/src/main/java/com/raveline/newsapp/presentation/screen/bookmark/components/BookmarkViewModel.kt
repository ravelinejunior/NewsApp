package com.raveline.newsapp.presentation.screen.bookmark.components

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.raveline.newsapp.domain.use_cases.news.NewsUseCaseModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class BookmarkViewModel @Inject constructor(
    private val newsUseCase: NewsUseCaseModel
) : ViewModel() {
    private val _state = mutableStateOf(BookmarkState())
    val state: State<BookmarkState> get() = _state

    init {
        getArticlesState()
    }

    private fun getArticlesState() {
        newsUseCase.getStoredArticlesUseCase.invoke().onEach {
            _state.value = _state.value.copy(articleList = it)
        }.launchIn(viewModelScope)
    }
}