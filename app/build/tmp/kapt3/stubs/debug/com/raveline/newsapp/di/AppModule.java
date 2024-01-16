package com.raveline.newsapp.di;

@dagger.Module
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/raveline/newsapp/di/AppModule;", "", "()V", "provideGetNewsUseCase", "Lcom/raveline/newsapp/domain/use_cases/news/NewsUseCaseModel;", "repository", "Lcom/raveline/newsapp/domain/repository/NewsRepository;", "provideNewsRepository", "newsApi", "Lcom/raveline/newsapp/data/remote/services/NewsApi;", "dao", "Lcom/raveline/newsapp/data/local/NewsDao;", "providesAppEntryUseCase", "Lcom/raveline/newsapp/domain/use_cases/app_entry/AppEntryUseCasesModel;", "localUserManager", "Lcom/raveline/newsapp/domain/manager/LocalUserManager;", "providesLocalUserManager", "application", "Landroid/app/Application;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class AppModule {
    @org.jetbrains.annotations.NotNull
    public static final com.raveline.newsapp.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.raveline.newsapp.domain.manager.LocalUserManager providesLocalUserManager(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.raveline.newsapp.domain.use_cases.app_entry.AppEntryUseCasesModel providesAppEntryUseCase(@org.jetbrains.annotations.NotNull
    com.raveline.newsapp.domain.manager.LocalUserManager localUserManager) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.raveline.newsapp.domain.repository.NewsRepository provideNewsRepository(@org.jetbrains.annotations.NotNull
    com.raveline.newsapp.data.remote.services.NewsApi newsApi, @org.jetbrains.annotations.NotNull
    com.raveline.newsapp.data.local.NewsDao dao) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.raveline.newsapp.domain.use_cases.news.NewsUseCaseModel provideGetNewsUseCase(@org.jetbrains.annotations.NotNull
    com.raveline.newsapp.domain.repository.NewsRepository repository) {
        return null;
    }
}