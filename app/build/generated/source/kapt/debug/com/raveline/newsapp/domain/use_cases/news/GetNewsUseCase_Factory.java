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
public final class GetNewsUseCase_Factory implements Factory<GetNewsUseCase> {
  private final Provider<NewsRepository> newsRepositoryProvider;

  public GetNewsUseCase_Factory(Provider<NewsRepository> newsRepositoryProvider) {
    this.newsRepositoryProvider = newsRepositoryProvider;
  }

  @Override
  public GetNewsUseCase get() {
    return newInstance(newsRepositoryProvider.get());
  }

  public static GetNewsUseCase_Factory create(Provider<NewsRepository> newsRepositoryProvider) {
    return new GetNewsUseCase_Factory(newsRepositoryProvider);
  }

  public static GetNewsUseCase newInstance(NewsRepository newsRepository) {
    return new GetNewsUseCase(newsRepository);
  }
}
