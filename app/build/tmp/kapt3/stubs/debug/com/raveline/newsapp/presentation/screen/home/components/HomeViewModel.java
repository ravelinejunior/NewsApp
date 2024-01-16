package com.raveline.newsapp.presentation.screen.home.components;

/**
 * `HomeViewModel` is a ViewModel class that is responsible for preparing and managing the data for `HomeScreen`.
 * It's annotated with `@HiltViewModel`, indicating that it's a ViewModel that will be injected by Hilt.
 *
 * @property state The current state of the home screen.
 * @property getNews A `Flow<PagingData<ArticleModel>>` that represents the news articles to be displayed.
 *
 * @constructor Injects the required dependencies.
 *
 * @param newsUseCaseModel An instance of `NewsUseCaseModel`.
 *
 * @method onEvent Handles the events from the UI and performs the necessary actions.
 * @method updateScrollValue Updates the current scroll value of the state.
 * @method updateMaxScrollValue Updates the maximum scroll value of the state.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0019"}, d2 = {"Lcom/raveline/newsapp/presentation/screen/home/components/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "newsUseCaseModel", "Lcom/raveline/newsapp/domain/use_cases/news/NewsUseCaseModel;", "(Lcom/raveline/newsapp/domain/use_cases/news/NewsUseCaseModel;)V", "getNews", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/raveline/newsapp/domain/model/ArticleModel;", "getGetNews", "()Lkotlinx/coroutines/flow/Flow;", "<set-?>", "Landroidx/compose/runtime/MutableState;", "Lcom/raveline/newsapp/presentation/screen/home/components/HomeState;", "state", "getState", "()Landroidx/compose/runtime/MutableState;", "onEvent", "", "event", "Lcom/raveline/newsapp/presentation/screen/home/components/HomeEvent;", "updateMaxScrollValue", "newValue", "", "updateScrollValue", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private androidx.compose.runtime.MutableState<com.raveline.newsapp.presentation.screen.home.components.HomeState> state;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.raveline.newsapp.domain.model.ArticleModel>> getNews = null;
    
    @javax.inject.Inject
    public HomeViewModel(@org.jetbrains.annotations.NotNull
    com.raveline.newsapp.domain.use_cases.news.NewsUseCaseModel newsUseCaseModel) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<com.raveline.newsapp.presentation.screen.home.components.HomeState> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.raveline.newsapp.domain.model.ArticleModel>> getGetNews() {
        return null;
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull
    com.raveline.newsapp.presentation.screen.home.components.HomeEvent event) {
    }
    
    private final void updateScrollValue(int newValue) {
    }
    
    private final void updateMaxScrollValue(int newValue) {
    }
}