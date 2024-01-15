package com.raveline.newsapp.presentation.screen.bookmark.components;

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
public final class BookmarkViewModel_Factory implements Factory<BookmarkViewModel> {
  private final Provider<NewsUseCaseModel> newsUseCaseProvider;

  public BookmarkViewModel_Factory(Provider<NewsUseCaseModel> newsUseCaseProvider) {
    this.newsUseCaseProvider = newsUseCaseProvider;
  }

  @Override
  public BookmarkViewModel get() {
    return newInstance(newsUseCaseProvider.get());
  }

  public static BookmarkViewModel_Factory create(Provider<NewsUseCaseModel> newsUseCaseProvider) {
    return new BookmarkViewModel_Factory(newsUseCaseProvider);
  }

  public static BookmarkViewModel newInstance(NewsUseCaseModel newsUseCase) {
    return new BookmarkViewModel(newsUseCase);
  }
}
