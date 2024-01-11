package com.raveline.newsapp.di;

import com.raveline.newsapp.domain.manager.LocalUserManager;
import com.raveline.newsapp.domain.use_cases.app_entry.AppEntryUseCasesModel;
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
public final class AppModule_ProvidesAppEntryUseCaseFactory implements Factory<AppEntryUseCasesModel> {
  private final Provider<LocalUserManager> localUserManagerProvider;

  public AppModule_ProvidesAppEntryUseCaseFactory(
      Provider<LocalUserManager> localUserManagerProvider) {
    this.localUserManagerProvider = localUserManagerProvider;
  }

  @Override
  public AppEntryUseCasesModel get() {
    return providesAppEntryUseCase(localUserManagerProvider.get());
  }

  public static AppModule_ProvidesAppEntryUseCaseFactory create(
      Provider<LocalUserManager> localUserManagerProvider) {
    return new AppModule_ProvidesAppEntryUseCaseFactory(localUserManagerProvider);
  }

  public static AppEntryUseCasesModel providesAppEntryUseCase(LocalUserManager localUserManager) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.providesAppEntryUseCase(localUserManager));
  }
}
