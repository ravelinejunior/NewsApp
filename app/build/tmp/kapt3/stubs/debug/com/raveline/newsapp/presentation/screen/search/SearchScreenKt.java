package com.raveline.newsapp.presentation.screen.search;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a8\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u00a8\u0006\t"}, d2 = {"SearchScreen", "", "state", "Lcom/raveline/newsapp/presentation/screen/search/components/SearchState;", "events", "Lkotlin/Function1;", "Lcom/raveline/newsapp/presentation/screen/search/components/SearchEvents;", "navigate", "", "app_debug"})
public final class SearchScreenKt {
    
    /**
     * `SearchScreen` is a composable function that represents the search screen in the application.
     * This function is responsible for displaying the search bar and the list of articles based on the search query.
     *
     * @param state An instance of `SearchState` which represents the current state of the search screen.
     * @param events A function that takes an instance of `SearchEvents` and performs actions based on the event.
     * @param navigate A function that takes a route as a `String` and navigates to the corresponding screen.
     *
     * @function SearchBar This is a composable function that displays the search bar. It takes in the current query, a boolean to indicate if the search bar is read-only, a function to handle value changes, and a function to handle search action.
     * @function ArticleList This is a composable function that displays the list of articles. It takes in the list of articles and a function to handle click events on the articles.
     */
    @androidx.annotation.RequiresExtension(extension = android.os.Build.VERSION_CODES.S, version = 7)
    @androidx.compose.runtime.Composable
    public static final void SearchScreen(@org.jetbrains.annotations.NotNull
    com.raveline.newsapp.presentation.screen.search.components.SearchState state, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.raveline.newsapp.presentation.screen.search.components.SearchEvents, kotlin.Unit> events, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> navigate) {
    }
}