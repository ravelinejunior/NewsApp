package com.raveline.newsapp.presentation.screen.bookmark.components;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\rH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u000e"}, d2 = {"Lcom/raveline/newsapp/presentation/screen/bookmark/components/BookmarkViewModel;", "Landroidx/lifecycle/ViewModel;", "newsUseCase", "Lcom/raveline/newsapp/domain/use_cases/news/NewsUseCaseModel;", "(Lcom/raveline/newsapp/domain/use_cases/news/NewsUseCaseModel;)V", "_state", "Landroidx/compose/runtime/MutableState;", "Lcom/raveline/newsapp/presentation/screen/bookmark/components/BookmarkState;", "state", "Landroidx/compose/runtime/State;", "getState", "()Landroidx/compose/runtime/State;", "getArticlesState", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class BookmarkViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.raveline.newsapp.domain.use_cases.news.NewsUseCaseModel newsUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<com.raveline.newsapp.presentation.screen.bookmark.components.BookmarkState> _state = null;
    
    @javax.inject.Inject
    public BookmarkViewModel(@org.jetbrains.annotations.NotNull
    com.raveline.newsapp.domain.use_cases.news.NewsUseCaseModel newsUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.State<com.raveline.newsapp.presentation.screen.bookmark.components.BookmarkState> getState() {
        return null;
    }
    
    private final void getArticlesState() {
    }
}