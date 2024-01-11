package com.raveline.newsapp.di

import android.app.Application
import com.raveline.newsapp.data.manager_impl.LocalUserManagerImpl
import com.raveline.newsapp.data.remote.services.NewsApi
import com.raveline.newsapp.data.repository_impl.NewsRepositoryImpl
import com.raveline.newsapp.domain.manager.LocalUserManager
import com.raveline.newsapp.domain.repository.NewsRepository
import com.raveline.newsapp.domain.use_cases.app_entry.AppEntryUseCasesModel
import com.raveline.newsapp.domain.use_cases.app_entry.ReadAppEntryUseCase
import com.raveline.newsapp.domain.use_cases.app_entry.SaveAppEntryUseCase
import com.raveline.newsapp.domain.use_cases.news.GetNewsUseCase
import com.raveline.newsapp.domain.use_cases.news.NewsUseCaseModel
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
    fun provideNewsRepository(newsApi: NewsApi): NewsRepository =
        NewsRepositoryImpl(newsApi)

    @Provides
    @Singleton
    fun provideGetNewsUseCase(repository: NewsRepository): NewsUseCaseModel =
        NewsUseCaseModel(
            newsUseCase = GetNewsUseCase(repository)
        )

}















