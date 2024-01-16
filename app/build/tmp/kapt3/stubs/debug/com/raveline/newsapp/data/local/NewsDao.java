package com.raveline.newsapp.data.local;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH\'J\u001b\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/raveline/newsapp/data/local/NewsDao;", "", "deleteNews", "", "articleModel", "Lcom/raveline/newsapp/domain/model/ArticleModel;", "(Lcom/raveline/newsapp/domain/model/ArticleModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllStoredNews", "Lkotlinx/coroutines/flow/Flow;", "", "getSelectedArticle", "url", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "upsertNews", "app_debug"})
@androidx.room.Dao
public abstract interface NewsDao {
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object upsertNews(@org.jetbrains.annotations.NotNull
    com.raveline.newsapp.domain.model.ArticleModel articleModel, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteNews(@org.jetbrains.annotations.NotNull
    com.raveline.newsapp.domain.model.ArticleModel articleModel, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM ARTICLES_TABLE ORDER BY id DESC")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.raveline.newsapp.domain.model.ArticleModel>> getAllStoredNews();
    
    @androidx.room.Query(value = "SELECT * FROM ARTICLES_TABLE WHERE url =:url")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getSelectedArticle(@org.jetbrains.annotations.NotNull
    java.lang.String url, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.raveline.newsapp.domain.model.ArticleModel> $completion);
}