package com.raveline.newsapp.presentation.screen.search.components;

import com.raveline.newsapp.domain.use_cases.news.SearchNewsUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class SearchViewModel_Factory implements Factory<SearchViewModel> {
  private final Provider<SearchNewsUseCase> useCaseProvider;

  public SearchViewModel_Factory(Provider<SearchNewsUseCase> useCaseProvider) {
    this.useCaseProvider = useCaseProvider;
  }

  @Override
  public SearchViewModel get() {
    return newInstance(useCaseProvider.get());
  }

  public static SearchViewModel_Factory create(Provider<SearchNewsUseCase> useCaseProvider) {
    return new SearchViewModel_Factory(useCaseProvider);
  }

  public static SearchViewModel newInstance(SearchNewsUseCase useCase) {
    return new SearchViewModel(useCase);
  }
}
