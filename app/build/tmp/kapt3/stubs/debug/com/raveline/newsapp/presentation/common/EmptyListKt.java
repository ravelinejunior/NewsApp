package com.raveline.newsapp.presentation.common;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a>\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007\u001a&\u0010\r\u001a\u00020\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0007\u001a\b\u0010\u000e\u001a\u00020\u0001H\u0007\u001a\u0010\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u00a8\u0006\u0011"}, d2 = {"EmptyContent", "", "alphaAnim", "", "message", "", "resRaw", "", "articles", "Landroidx/paging/compose/LazyPagingItems;", "Lcom/raveline/newsapp/domain/model/ArticleModel;", "error", "Landroidx/paging/LoadState$Error;", "EmptyScreen", "EmptyScreenPreview", "parseErrorMessage", "mError", "app_debug"})
public final class EmptyListKt {
    
    @androidx.compose.runtime.Composable
    public static final void EmptyScreen(@org.jetbrains.annotations.Nullable
    androidx.paging.LoadState.Error error, @org.jetbrains.annotations.Nullable
    androidx.paging.compose.LazyPagingItems<com.raveline.newsapp.domain.model.ArticleModel> articles) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void EmptyContent(float alphaAnim, @org.jetbrains.annotations.NotNull
    java.lang.String message, int resRaw, @org.jetbrains.annotations.Nullable
    androidx.paging.compose.LazyPagingItems<com.raveline.newsapp.domain.model.ArticleModel> articles, @org.jetbrains.annotations.Nullable
    androidx.paging.LoadState.Error error) {
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String parseErrorMessage(@org.jetbrains.annotations.Nullable
    androidx.paging.LoadState.Error mError) {
        return null;
    }
    
    @androidx.compose.ui.tooling.preview.Preview(showBackground = true)
    @androidx.compose.runtime.Composable
    public static final void EmptyScreenPreview() {
    }
}