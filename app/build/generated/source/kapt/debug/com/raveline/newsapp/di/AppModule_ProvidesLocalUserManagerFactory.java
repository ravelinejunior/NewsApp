package com.raveline.newsapp.di;

import android.app.Application;
import com.raveline.newsapp.domain.manager.LocalUserManager;
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
public final class AppModule_ProvidesLocalUserManagerFactory implements Factory<LocalUserManager> {
  private final Provider<Application> applicationProvider;

  public AppModule_ProvidesLocalUserManagerFactory(Provider<Application> applicationProvider) {
    this.applicationProvider = applicationProvider;
  }

  @Override
  public LocalUserManager get() {
    return providesLocalUserManager(applicationProvider.get());
  }

  public static AppModule_ProvidesLocalUserManagerFactory create(
      Provider<Application> applicationProvider) {
    return new AppModule_ProvidesLocalUserManagerFactory(applicationProvider);
  }

  public static LocalUserManager providesLocalUserManager(Application application) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.providesLocalUserManager(application));
  }
}
