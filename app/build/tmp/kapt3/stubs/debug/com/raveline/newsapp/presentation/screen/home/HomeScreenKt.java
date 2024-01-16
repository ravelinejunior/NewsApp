package com.raveline.newsapp.presentation.screen.home;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aF\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u00a8\u0006\u000b"}, d2 = {"HomeScreen", "", "state", "Lcom/raveline/newsapp/presentation/screen/home/components/HomeState;", "event", "Lkotlin/Function1;", "Lcom/raveline/newsapp/presentation/screen/home/components/HomeEvent;", "articles", "Landroidx/paging/compose/LazyPagingItems;", "Lcom/raveline/newsapp/domain/model/ArticleModel;", "navigateToDetails", "app_debug"})
public final class HomeScreenKt {
    
    /**
     * `HomeScreen` is a composable function that displays the home screen of the news application.
     * It's annotated with `@Composable`, indicating that it's a composable function that describes part of the UI.
     *
     * @property state The current state of the home screen.
     * @property event A function type parameter that takes a `HomeEvent` and returns `Unit`.
     * It's used to handle events in the `HomeScreen`.
     * @property articles A `LazyPagingItems` of `ArticleModel` that represents the articles to be displayed.
     * @property navigateToDetails A function type parameter that takes an `ArticleModel` and returns `Unit`.
     * It's used to navigate to the details screen of a particular article.
     *
     * @method HomeScreen This function sets up the UI for the home screen.
     */
    @androidx.annotation.RequiresExtension(extension = android.os.Build.VERSION_CODES.S, version = 7)
    @kotlin.OptIn(markerClass = {androidx.compose.foundation.ExperimentalFoundationApi.class})
    @androidx.compose.runtime.Composable
    public static final void HomeScreen(@org.jetbrains.annotations.NotNull
    com.raveline.newsapp.presentation.screen.home.components.HomeState state, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.raveline.newsapp.presentation.screen.home.components.HomeEvent, kotlin.Unit> event, @org.jetbrains.annotations.NotNull
    androidx.paging.compose.LazyPagingItems<com.raveline.newsapp.domain.model.ArticleModel> articles, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.raveline.newsapp.domain.model.ArticleModel, kotlin.Unit> navigateToDetails) {
    }
}