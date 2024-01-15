package com.raveline.newsapp.presentation.screen.bookmark.components

import com.raveline.newsapp.domain.model.ArticleModel

data class BookmarkState(
    val articleList:List<ArticleModel> = emptyList()
)
