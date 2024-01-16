package com.raveline.newsapp.di;

import com.raveline.newsapp.data.local.NewsDao;
import com.raveline.newsapp.data.remote.services.NewsApi;
import com.raveline.newsapp.domain.repository.NewsRepository;
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
public final class AppModule_ProvideNewsRepositoryFactory implements Factory<NewsRepository> {
  private final Provider<NewsApi> newsApiProvider;

  private final Provider<NewsDao> daoProvider;

  public AppModule_ProvideNewsRepositoryFactory(Provider<NewsApi> newsApiProvider,
      Provider<NewsDao> daoProvider) {
    this.newsApiProvider = newsApiProvider;
    this.daoProvider = daoProvider;
  }

  @Override
  public NewsRepository get() {
    return provideNewsRepository(newsApiProvider.get(), daoProvider.get());
  }

  public static AppModule_ProvideNewsRepositoryFactory create(Provider<NewsApi> newsApiProvider,
      Provider<NewsDao> daoProvider) {
    return new AppModule_ProvideNewsRepositoryFactory(newsApiProvider, daoProvider);
  }

  public static NewsRepository provideNewsRepository(NewsApi newsApi, NewsDao dao) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideNewsRepository(newsApi, dao));
  }
}
