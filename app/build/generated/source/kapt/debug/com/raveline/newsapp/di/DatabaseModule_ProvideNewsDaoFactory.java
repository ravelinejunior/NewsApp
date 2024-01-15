package com.raveline.newsapp.di;

import com.raveline.newsapp.data.local.NewsDao;
import com.raveline.newsapp.data.local.NewsDatabase;
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
public final class DatabaseModule_ProvideNewsDaoFactory implements Factory<NewsDao> {
  private final Provider<NewsDatabase> newsDatabaseProvider;

  public DatabaseModule_ProvideNewsDaoFactory(Provider<NewsDatabase> newsDatabaseProvider) {
    this.newsDatabaseProvider = newsDatabaseProvider;
  }

  @Override
  public NewsDao get() {
    return provideNewsDao(newsDatabaseProvider.get());
  }

  public static DatabaseModule_ProvideNewsDaoFactory create(
      Provider<NewsDatabase> newsDatabaseProvider) {
    return new DatabaseModule_ProvideNewsDaoFactory(newsDatabaseProvider);
  }

  public static NewsDao provideNewsDao(NewsDatabase newsDatabase) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideNewsDao(newsDatabase));
  }
}
