package com.raveline.newsapp.domain.use_cases.app_entry

import com.raveline.newsapp.domain.manager.LocalUserManager

class SaveAppEntryUseCase (private val localUserManager: LocalUserManager){
    suspend operator fun invoke(){
        localUserManager.saveAppEntry()
    }
}