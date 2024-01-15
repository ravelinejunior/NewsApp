package com.raveline.newsapp.di;

import android.app.Application;
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
public final class DatabaseModule_ProvideNewsDatabaseFactory implements Factory<NewsDatabase> {
  private final Provider<Application> applicationProvider;

  public DatabaseModule_ProvideNewsDatabaseFactory(Provider<Application> applicationProvider) {
    this.applicationProvider = applicationProvider;
  }

  @Override
  public NewsDatabase get() {
    return provideNewsDatabase(applicationProvider.get());
  }

  public static DatabaseModule_ProvideNewsDatabaseFactory create(
      Provider<Application> applicationProvider) {
    return new DatabaseModule_ProvideNewsDatabaseFactory(applicationProvider);
  }

  public static NewsDatabase provideNewsDatabase(Application application) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideNewsDatabase(application));
  }
}
