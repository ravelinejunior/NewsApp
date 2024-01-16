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
public final class GetSelectedArticleUseCase_Factory implements Factory<GetSelectedArticleUseCase> {
  private final Provider<NewsRepository> repositoryProvider;

  public GetSelectedArticleUseCase_Factory(Provider<NewsRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GetSelectedArticleUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static GetSelectedArticleUseCase_Factory create(
      Provider<NewsRepository> repositoryProvider) {
    return new GetSelectedArticleUseCase_Factory(repositoryProvider);
  }

  public static GetSelectedArticleUseCase newInstance(NewsRepository repository) {
    return new GetSelectedArticleUseCase(repository);
  }
}
