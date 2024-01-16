package com.raveline.newsapp.domain.use_cases.news;

import com.raveline.newsapp.domain.repository.NewsRepository;
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
public final class UpsertArticleUseCase_Factory implements Factory<UpsertArticleUseCase> {
  private final Provider<NewsRepository> repositoryProvider;

  public UpsertArticleUseCase_Factory(Provider<NewsRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public UpsertArticleUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static UpsertArticleUseCase_Factory create(Provider<NewsRepository> repositoryProvider) {
    return new UpsertArticleUseCase_Factory(repositoryProvider);
  }

  public static UpsertArticleUseCase newInstance(NewsRepository repository) {
    return new UpsertArticleUseCase(repository);
  }
}
