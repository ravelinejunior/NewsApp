package com.raveline.newsapp.presentation.screen.search.components

sealed class SearchEvents {
    data class UpdateSearchQuery(val query: String) : SearchEvents()
    object SearchNews : SearchEvents()
}