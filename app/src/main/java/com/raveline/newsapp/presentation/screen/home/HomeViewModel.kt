package com.raveline.newsapp.presentation.screen.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.raveline.newsapp.domain.use_cases.news.NewsUseCaseModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    newsUseCaseModel: NewsUseCaseModel
) : ViewModel() {
    val getNews = newsUseCaseModel.newsUseCase(
        sources = listOf("bbc-news", "abc-news", "google-news", "the-verge", "business-insider")
    ).cachedIn(viewModelScope)
}