package com.raveline.newsapp.presentation.screen.onboarding.components;

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
public final class OnBoardingViewModel_Factory implements Factory<OnBoardingViewModel> {
  private final Provider<AppEntryUseCasesModel> appEntryUseCasesModelProvider;

  public OnBoardingViewModel_Factory(
      Provider<AppEntryUseCasesModel> appEntryUseCasesModelProvider) {
    this.appEntryUseCasesModelProvider = appEntryUseCasesModelProvider;
  }

  @Override
  public OnBoardingViewModel get() {
    return newInstance(appEntryUseCasesModelProvider.get());
  }

  public static OnBoardingViewModel_Factory create(
      Provider<AppEntryUseCasesModel> appEntryUseCasesModelProvider) {
    return new OnBoardingViewModel_Factory(appEntryUseCasesModelProvider);
  }

  public static OnBoardingViewModel newInstance(AppEntryUseCasesModel appEntryUseCasesModel) {
    return new OnBoardingViewModel(appEntryUseCasesModel);
  }
}
