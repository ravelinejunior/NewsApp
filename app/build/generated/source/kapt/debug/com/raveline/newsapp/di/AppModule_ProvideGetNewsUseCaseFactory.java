package com.raveline.newsapp.di;

import com.raveline.newsapp.data.local.NewsDao;
import com.raveline.newsapp.domain.repository.NewsRepository;
import com.raveline.newsapp.domain.use_cases.news.NewsUseCaseModel;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class AppModule_ProvideGetNewsUseCaseFactory implements Factory<NewsUseCaseModel> {
  private final Provider<NewsRepository> repositoryProvider;

  private final Provider<NewsDao> daoProvider;

  public AppModule_ProvideGetNewsUseCaseFactory(Provider<NewsRepository> repositoryProvider,
      Provider<NewsDao> daoProvider) {
    this.repositoryProvider = repositoryProvider;
    this.daoProvider = daoProvider;
  }

  @Override
  public NewsUseCaseModel get() {
    return provideGetNewsUseCase(repositoryProvider.get(), daoProvider.get());
  }

  public static AppModule_ProvideGetNewsUseCaseFactory create(
      Provider<NewsRepository> repositoryProvider, Provider<NewsDao> daoProvider) {
    return new AppModule_ProvideGetNewsUseCaseFactory(repositoryProvider, daoProvider);
  }

  public static NewsUseCaseModel provideGetNewsUseCase(NewsRepository repository, NewsDao dao) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideGetNewsUseCase(repository, dao));
  }
}
