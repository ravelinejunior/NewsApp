package com.raveline.newsapp.domain.use_cases.news;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u000bH\u00c6\u0003J\t\u0010 \u001a\u00020\rH\u00c6\u0003JE\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u00c6\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020&H\u00d6\u0001J\t\u0010\'\u001a\u00020(H\u00d6\u0001R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006)"}, d2 = {"Lcom/raveline/newsapp/domain/use_cases/news/NewsUseCaseModel;", "", "newsUseCase", "Lcom/raveline/newsapp/domain/use_cases/news/GetNewsUseCase;", "searchNewsUseCase", "Lcom/raveline/newsapp/domain/use_cases/news/SearchNewsUseCase;", "upsertArticleUseCase", "Lcom/raveline/newsapp/domain/use_cases/news/UpsertArticleUseCase;", "deleteArticleUseCase", "Lcom/raveline/newsapp/domain/use_cases/news/DeleteArticleUseCase;", "getStoredArticlesUseCase", "Lcom/raveline/newsapp/domain/use_cases/news/GetStoredArticlesUseCase;", "getSelectedArticleUseCase", "Lcom/raveline/newsapp/domain/use_cases/news/GetSelectedArticleUseCase;", "(Lcom/raveline/newsapp/domain/use_cases/news/GetNewsUseCase;Lcom/raveline/newsapp/domain/use_cases/news/SearchNewsUseCase;Lcom/raveline/newsapp/domain/use_cases/news/UpsertArticleUseCase;Lcom/raveline/newsapp/domain/use_cases/news/DeleteArticleUseCase;Lcom/raveline/newsapp/domain/use_cases/news/GetStoredArticlesUseCase;Lcom/raveline/newsapp/domain/use_cases/news/GetSelectedArticleUseCase;)V", "getDeleteArticleUseCase", "()Lcom/raveline/newsapp/domain/use_cases/news/DeleteArticleUseCase;", "getGetSelectedArticleUseCase", "()Lcom/raveline/newsapp/domain/use_cases/news/GetSelectedArticleUseCase;", "getGetStoredArticlesUseCase", "()Lcom/raveline/newsapp/domain/use_cases/news/GetStoredArticlesUseCase;", "getNewsUseCase", "()Lcom/raveline/newsapp/domain/use_cases/news/GetNewsUseCase;", "getSearchNewsUseCase", "()Lcom/raveline/newsapp/domain/use_cases/news/SearchNewsUseCase;", "getUpsertArticleUseCase", "()Lcom/raveline/newsapp/domain/use_cases/news/UpsertArticleUseCase;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
public final class NewsUseCaseModel {
    @org.jetbrains.annotations.NotNull
    private final com.raveline.newsapp.domain.use_cases.news.GetNewsUseCase newsUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.raveline.newsapp.domain.use_cases.news.SearchNewsUseCase searchNewsUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.raveline.newsapp.domain.use_cases.news.UpsertArticleUseCase upsertArticleUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.raveline.newsapp.domain.use_cases.news.DeleteArticleUseCase deleteArticleUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.raveline.newsapp.domain.use_cases.news.GetStoredArticlesUseCase getStoredArticlesUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.raveline.newsapp.domain.use_cases.news.GetSelectedArticleUseCase getSelectedArticleUseCase = null;
    
    public NewsUseCaseModel(@org.jetbrains.annotations.NotNull
    com.raveline.newsapp.domain.use_cases.news.GetNewsUseCase newsUseCase, @org.jetbrains.annotations.NotNull
    com.raveline.newsapp.domain.use_cases.news.SearchNewsUseCase searchNewsUseCase, @org.jetbrains.annotations.NotNull
    com.raveline.newsapp.domain.use_cases.news.UpsertArticleUseCase upsertArticleUseCase, @org.jetbrains.annotations.NotNull
    com.raveline.newsapp.domain.use_cases.news.DeleteArticleUseCase deleteArticleUseCase, @org.jetbrains.annotations.NotNull
    com.raveline.newsapp.domain.use_cases.news.GetStoredArticlesUseCase getStoredArticlesUseCase, @org.jetbrains.annotations.NotNull
    com.raveline.newsapp.domain.use_cases.news.GetSelectedArticleUseCase getSelectedArticleUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.raveline.newsapp.domain.use_cases.news.GetNewsUseCase getNewsUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.raveline.newsapp.domain.use_cases.news.SearchNewsUseCase getSearchNewsUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.raveline.newsapp.domain.use_cases.news.UpsertArticleUseCase getUpsertArticleUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.raveline.newsapp.domain.use_cases.news.DeleteArticleUseCase getDeleteArticleUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.raveline.newsapp.domain.use_cases.news.GetStoredArticlesUseCase getGetStoredArticlesUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.raveline.newsapp.domain.use_cases.news.GetSelectedArticleUseCase getGetSelectedArticleUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.raveline.newsapp.domain.use_cases.news.GetNewsUseCase component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.raveline.newsapp.domain.use_cases.news.SearchNewsUseCase component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.raveline.newsapp.domain.use_cases.news.UpsertArticleUseCase component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.raveline.newsapp.domain.use_cases.news.DeleteArticleUseCase component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.raveline.newsapp.domain.use_cases.news.GetStoredArticlesUseCase component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.raveline.newsapp.domain.use_cases.news.GetSelectedArticleUseCase component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.raveline.newsapp.domain.use_cases.news.NewsUseCaseModel copy(@org.jetbrains.annotations.NotNull
    com.raveline.newsapp.domain.use_cases.news.GetNewsUseCase newsUseCase, @org.jetbrains.annotations.NotNull
    com.raveline.newsapp.domain.use_cases.news.SearchNewsUseCase searchNewsUseCase, @org.jetbrains.annotations.NotNull
    com.raveline.newsapp.domain.use_cases.news.UpsertArticleUseCase upsertArticleUseCase, @org.jetbrains.annotations.NotNull
    com.raveline.newsapp.domain.use_cases.news.DeleteArticleUseCase deleteArticleUseCase, @org.jetbrains.annotations.NotNull
    com.raveline.newsapp.domain.use_cases.news.GetStoredArticlesUseCase getStoredArticlesUseCase, @org.jetbrains.annotations.NotNull
    com.raveline.newsapp.domain.use_cases.news.GetSelectedArticleUseCase getSelectedArticleUseCase) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}