package com.raveline.newsapp.di

import android.app.Application
import com.raveline.newsapp.data.local.NewsDao
import com.raveline.newsapp.data.manager_impl.LocalUserManagerImpl
import com.raveline.newsapp.data.remote.services.NewsApi
import com.raveline.newsapp.data.repository_impl.NewsRepositoryImpl
import com.raveline.newsapp.domain.manager.LocalUserManager
import com.raveline.newsapp.domain.repository.NewsRepository
import com.raveline.newsapp.domain.use_cases.app_entry.AppEntryUseCasesModel
import com.raveline.newsapp.domain.use_cases.app_entry.ReadAppEntryUseCase
import com.raveline.newsapp.domain.use_cases.app_entry.SaveAppEntryUseCase
import com.raveline.newsapp.domain.use_cases.news.DeleteArticleUseCase
import com.raveline.newsapp.domain.use_cases.news.GetNewsUseCase
import com.raveline.newsapp.domain.use_cases.news.GetSelectedArticleUseCase
import com.raveline.newsapp.domain.use_cases.news.GetStoredArticlesUseCase
import com.raveline.newsapp.domain.use_cases.news.NewsUseCaseModel
import com.raveline.newsapp.domain.use_cases.news.SearchNewsUseCase
import com.raveline.newsapp.domain.use_cases.news.UpsertArticleUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providesLocalUserManager(
        application: Application
    ): LocalUserManager = LocalUserManagerImpl(application)

    @Provides
    @Singleton
    fun providesAppEntryUseCase(localUserManager: LocalUserManager): AppEntryUseCasesModel =
        AppEntryUseCasesModel(
            readAppEntry = ReadAppEntryUseCase(localUserManager),
            saveAppEntryUseCase = SaveAppEntryUseCase(localUserManager)
        )

    @Provides
    @Singleton
    fun provideNewsRepository(newsApi: NewsApi, dao: NewsDao): NewsRepository =
        NewsRepositoryImpl(newsApi, newsDao = dao)

    @Provides
    @Singleton
    fun provideGetNewsUseCase(
        repository: NewsRepository,
    ): NewsUseCaseModel =
        NewsUseCaseModel(
            newsUseCase = GetNewsUseCase(repository),
            searchNewsUseCase = SearchNewsUseCase(repository),
            upsertArticleUseCase = UpsertArticleUseCase(repository),
            deleteArticleUseCase = DeleteArticleUseCase(repository),
            getStoredArticlesUseCase = GetStoredArticlesUseCase(repository),
            getSelectedArticleUseCase = GetSelectedArticleUseCase(repository)
        )

}















