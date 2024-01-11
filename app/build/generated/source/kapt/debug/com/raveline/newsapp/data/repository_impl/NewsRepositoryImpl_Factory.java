package com.raveline.newsapp.data.repository_impl;

import com.raveline.newsapp.data.remote.services.NewsApi;
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
public final class NewsRepositoryImpl_Factory implements Factory<NewsRepositoryImpl> {
  private final Provider<NewsApi> newsApiProvider;

  public NewsRepositoryImpl_Factory(Provider<NewsApi> newsApiProvider) {
    this.newsApiProvider = newsApiProvider;
  }

  @Override
  public NewsRepositoryImpl get() {
    return newInstance(newsApiProvider.get());
  }

  public static NewsRepositoryImpl_Factory create(Provider<NewsApi> newsApiProvider) {
    return new NewsRepositoryImpl_Factory(newsApiProvider);
  }

  public static NewsRepositoryImpl newInstance(NewsApi newsApi) {
    return new NewsRepositoryImpl(newsApi);
  }
}
