package com.raveline.newsapp.presentation.screen.details.components

import com.raveline.newsapp.domain.model.ArticleModel

sealed class DetailsEvent {
    data class UpsertArticle( val article: ArticleModel) : DetailsEvent()
    object RemoveSideEffect : DetailsEvent()
}