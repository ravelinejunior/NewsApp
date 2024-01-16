package com.raveline.newsapp.presentation.screen.details.components;

import com.raveline.newsapp.domain.use_cases.news.NewsUseCaseModel;
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
public final class DetailsViewModel_Factory implements Factory<DetailsViewModel> {
  private final Provider<NewsUseCaseModel> newsUseCaseProvider;

  public DetailsViewModel_Factory(Provider<NewsUseCaseModel> newsUseCaseProvider) {
    this.newsUseCaseProvider = newsUseCaseProvider;
  }

  @Override
  public DetailsViewModel get() {
    return newInstance(newsUseCaseProvider.get());
  }

  public static DetailsViewModel_Factory create(Provider<NewsUseCaseModel> newsUseCaseProvider) {
    return new DetailsViewModel_Factory(newsUseCaseProvider);
  }

  public static DetailsViewModel newInstance(NewsUseCaseModel newsUseCase) {
    return new DetailsViewModel(newsUseCase);
  }
}
