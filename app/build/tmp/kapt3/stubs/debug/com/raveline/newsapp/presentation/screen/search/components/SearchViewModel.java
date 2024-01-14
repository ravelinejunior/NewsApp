package com.raveline.newsapp.presentation.screen.search.components;

/**
 * `SearchViewModel` is a class that represents a ViewModel for searching news.
 * This class is responsible for managing the UI-related data in the lifecycle conscious way.
 * It communicates with the `SearchNewsUseCase` to get the data and updates the UI state accordingly.
 *
 * @property useCase The useCase is a private property injected into the constructor. It's an instance of `SearchNewsUseCase`.
 * @property _state A private mutable state of `SearchState`. This state is updated based on the search events.
 * @property state A public immutable state of `SearchState`. UI observes this state for any changes.
 *
 * @constructor Creates a new instance of `SearchViewModel`.
 * @param useCase An instance of `SearchNewsUseCase` which is a required parameter for the class constructor.
 *
 * @function onEvent This function takes in the search events and updates the state based on the event type.
 * @param events An instance of `SearchEvents` which represents the search related events.
 *
 * @function searchNews This is a private function that gets the articles from the use case and updates the articles in the state.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\rH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/raveline/newsapp/presentation/screen/search/components/SearchViewModel;", "Landroidx/lifecycle/ViewModel;", "useCase", "Lcom/raveline/newsapp/domain/use_cases/news/SearchNewsUseCase;", "(Lcom/raveline/newsapp/domain/use_cases/news/SearchNewsUseCase;)V", "_state", "Landroidx/compose/runtime/MutableState;", "Lcom/raveline/newsapp/presentation/screen/search/components/SearchState;", "state", "Landroidx/compose/runtime/State;", "getState", "()Landroidx/compose/runtime/State;", "onEvent", "", "events", "Lcom/raveline/newsapp/presentation/screen/search/components/SearchEvents;", "searchNews", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class SearchViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.raveline.newsapp.domain.use_cases.news.SearchNewsUseCase useCase = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<com.raveline.newsapp.presentation.screen.search.components.SearchState> _state = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.State<com.raveline.newsapp.presentation.screen.search.components.SearchState> state = null;
    
    @javax.inject.Inject
    public SearchViewModel(@org.jetbrains.annotations.NotNull
    com.raveline.newsapp.domain.use_cases.news.SearchNewsUseCase useCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.State<com.raveline.newsapp.presentation.screen.search.components.SearchState> getState() {
        return null;
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull
    com.raveline.newsapp.presentation.screen.search.components.SearchEvents events) {
    }
    
    private final void searchNews() {
    }
}