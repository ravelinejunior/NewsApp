package com.raveline.newsapp.domain.use_cases.app_entry

data class AppEntryUseCasesModel(
    val readAppEntry: ReadAppEntryUseCase,
    val saveAppEntryUseCase: SaveAppEntryUseCase
)