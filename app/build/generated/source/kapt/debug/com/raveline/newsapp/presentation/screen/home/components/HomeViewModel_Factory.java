package com.raveline.newsapp.presentation.screen.home.components;

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
public final class HomeViewModel_Factory implements Factory<HomeViewModel> {
  private final Provider<NewsUseCaseModel> newsUseCaseModelProvider;

  public HomeViewModel_Factory(Provider<NewsUseCaseModel> newsUseCaseModelProvider) {
    this.newsUseCaseModelProvider = newsUseCaseModelProvider;
  }

  @Override
  public HomeViewModel get() {
    return newInstance(newsUseCaseModelProvider.get());
  }

  public static HomeViewModel_Factory create(Provider<NewsUseCaseModel> newsUseCaseModelProvider) {
    return new HomeViewModel_Factory(newsUseCaseModelProvider);
  }

  public static HomeViewModel newInstance(NewsUseCaseModel newsUseCaseModel) {
    return new HomeViewModel(newsUseCaseModel);
  }
}
