package com.raveline.newsapp.domain.use_cases.news;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J#\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/raveline/newsapp/domain/use_cases/news/GetNewsUseCase;", "", "newsRepository", "Lcom/raveline/newsapp/domain/repository/NewsRepository;", "(Lcom/raveline/newsapp/domain/repository/NewsRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/raveline/newsapp/domain/model/ArticleModel;", "sources", "", "", "app_debug"})
public final class GetNewsUseCase {
    @org.jetbrains.annotations.NotNull
    private final com.raveline.newsapp.domain.repository.NewsRepository newsRepository = null;
    
    @javax.inject.Inject
    public GetNewsUseCase(@org.jetbrains.annotations.NotNull
    com.raveline.newsapp.domain.repository.NewsRepository newsRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.raveline.newsapp.domain.model.ArticleModel>> invoke(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> sources) {
        return null;
    }
}