package com.raveline.newsapp.domain.use_cases.news;

import com.raveline.newsapp.data.local.NewsDao;
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
  private final Provider<NewsDao> daoProvider;

  public UpsertArticleUseCase_Factory(Provider<NewsDao> daoProvider) {
    this.daoProvider = daoProvider;
  }

  @Override
  public UpsertArticleUseCase get() {
    return newInstance(daoProvider.get());
  }

  public static UpsertArticleUseCase_Factory create(Provider<NewsDao> daoProvider) {
    return new UpsertArticleUseCase_Factory(daoProvider);
  }

  public static UpsertArticleUseCase newInstance(NewsDao dao) {
    return new UpsertArticleUseCase(dao);
  }
}
