package com.raveline.newsapp.data.repository_impl;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e0\rH\u0016J\"\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00100\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000eH\u0016J\u001b\u0010\u0013\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0014\u001a\u00020\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J*\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00100\r2\u0006\u0010\u0017\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000eH\u0016J\u0019\u0010\u0018\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Lcom/raveline/newsapp/data/repository_impl/NewsRepositoryImpl;", "Lcom/raveline/newsapp/domain/repository/NewsRepository;", "newsApi", "Lcom/raveline/newsapp/data/remote/services/NewsApi;", "newsDao", "Lcom/raveline/newsapp/data/local/NewsDao;", "(Lcom/raveline/newsapp/data/remote/services/NewsApi;Lcom/raveline/newsapp/data/local/NewsDao;)V", "deleteArticle", "", "articleModel", "Lcom/raveline/newsapp/domain/model/ArticleModel;", "(Lcom/raveline/newsapp/domain/model/ArticleModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllStoredNews", "Lkotlinx/coroutines/flow/Flow;", "", "getNews", "Landroidx/paging/PagingData;", "sources", "", "getSelectedArticle", "url", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchNews", "query", "upsertArticle", "app_debug"})
public final class NewsRepositoryImpl implements com.raveline.newsapp.domain.repository.NewsRepository {
    @org.jetbrains.annotations.NotNull
    private final com.raveline.newsapp.data.remote.services.NewsApi newsApi = null;
    @org.jetbrains.annotations.NotNull
    private final com.raveline.newsapp.data.local.NewsDao newsDao = null;
    
    @javax.inject.Inject
    public NewsRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.raveline.newsapp.data.remote.services.NewsApi newsApi, @org.jetbrains.annotations.NotNull
    com.raveline.newsapp.data.local.NewsDao newsDao) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.raveline.newsapp.domain.model.ArticleModel>> getNews(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> sources) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.raveline.newsapp.domain.model.ArticleModel>> searchNews(@org.jetbrains.annotations.NotNull
    java.lang.String query, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> sources) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object upsertArticle(@org.jetbrains.annotations.NotNull
    com.raveline.newsapp.domain.model.ArticleModel articleModel, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object deleteArticle(@org.jetbrains.annotations.NotNull
    com.raveline.newsapp.domain.model.ArticleModel articleModel, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<java.util.List<com.raveline.newsapp.domain.model.ArticleModel>> getAllStoredNews() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getSelectedArticle(@org.jetbrains.annotations.NotNull
    java.lang.String url, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.raveline.newsapp.domain.model.ArticleModel> $completion) {
        return null;
    }
}