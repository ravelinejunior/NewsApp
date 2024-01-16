package com.raveline.newsapp.presentation.screen.home.components

/**
 * `HomeState` is a data class that represents the state of the home screen.
 *
 * @property newsTicker A string that represents the news ticker.
 * @property isLoading A boolean that represents whether the data is loading.
 * @property scrollValue An integer that represents the current scroll value.
 * @property maxScrollingValue An integer that represents the maximum scroll value.
 */
data class HomeState(
    val newsTicker: String = "",
    val isLoading: Boolean = false,
    val scrollValue: Int = 0,
    val maxScrollingValue: Int = 0
)
