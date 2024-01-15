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
public final class DeleteArticleUseCase_Factory implements Factory<DeleteArticleUseCase> {
  private final Provider<NewsDao> daoProvider;

  public DeleteArticleUseCase_Factory(Provider<NewsDao> daoProvider) {
    this.daoProvider = daoProvider;
  }

  @Override
  public DeleteArticleUseCase get() {
    return newInstance(daoProvider.get());
  }

  public static DeleteArticleUseCase_Factory create(Provider<NewsDao> daoProvider) {
    return new DeleteArticleUseCase_Factory(daoProvider);
  }

  public static DeleteArticleUseCase newInstance(NewsDao dao) {
    return new DeleteArticleUseCase(dao);
  }
}
