package com.raveline.newsapp.presentation.common;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a4\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\bH\u0007\u001a\b\u0010\t\u001a\u00020\u0001H\u0003\u001a\u0016\u0010\n\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007\u00a8\u0006\f"}, d2 = {"ArticleList", "", "modifier", "Landroidx/compose/ui/Modifier;", "articles", "Landroidx/paging/compose/LazyPagingItems;", "Lcom/raveline/newsapp/domain/model/ArticleModel;", "onClick", "Lkotlin/Function1;", "ShimmerEffect", "handlingPagingResult", "", "app_debug"})
public final class ArticleListKt {
    
    @androidx.compose.runtime.Composable
    public static final void ArticleList(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    androidx.paging.compose.LazyPagingItems<com.raveline.newsapp.domain.model.ArticleModel> articles, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.raveline.newsapp.domain.model.ArticleModel, kotlin.Unit> onClick) {
    }
    
    @androidx.compose.runtime.Composable
    public static final boolean handlingPagingResult(@org.jetbrains.annotations.NotNull
    androidx.paging.compose.LazyPagingItems<com.raveline.newsapp.domain.model.ArticleModel> articles) {
        return false;
    }
    
    @androidx.compose.runtime.Composable
    private static final void ShimmerEffect() {
    }
}