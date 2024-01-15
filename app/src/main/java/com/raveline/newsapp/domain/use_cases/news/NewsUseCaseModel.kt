package com.raveline.newsapp.domain.use_cases.news

data class NewsUseCaseModel (
    val newsUseCase: GetNewsUseCase,
    val searchNewsUseCase: SearchNewsUseCase,
    val upsertArticleUseCase: UpsertArticleUseCase,
    val deleteArticleUseCase: DeleteArticleUseCase,
    val getStoredArticlesUseCase: GetStoredArticlesUseCase
)