package com.raveline.newsapp.presentation.viewmodel;

import com.raveline.newsapp.domain.use_cases.app_entry.AppEntryUseCasesModel;
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
public final class MainViewModel_Factory implements Factory<MainViewModel> {
  private final Provider<AppEntryUseCasesModel> appEntryUseCasesModelProvider;

  public MainViewModel_Factory(Provider<AppEntryUseCasesModel> appEntryUseCasesModelProvider) {
    this.appEntryUseCasesModelProvider = appEntryUseCasesModelProvider;
  }

  @Override
  public MainViewModel get() {
    return newInstance(appEntryUseCasesModelProvider.get());
  }

  public static MainViewModel_Factory create(
      Provider<AppEntryUseCasesModel> appEntryUseCasesModelProvider) {
    return new MainViewModel_Factory(appEntryUseCasesModelProvider);
  }

  public static MainViewModel newInstance(AppEntryUseCasesModel appEntryUseCasesModel) {
    return new MainViewModel(appEntryUseCasesModel);
  }
}
