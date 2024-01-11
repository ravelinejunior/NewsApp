package com.raveline.newsapp.data.manager_impl

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import com.raveline.newsapp.domain.manager.LocalUserManager
import com.raveline.newsapp.utils.Constants.APP_ENTRY_STORE_KEY
import com.raveline.newsapp.utils.Constants.USER_SETTINGS_STORE_KEY
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class LocalUserManagerImpl(
    private val context: Context
) : LocalUserManager {
    override suspend fun saveAppEntry() {
        context.dataStore.edit { settings ->
            settings[PreferencesKeys.APP_ENTRY] = true
        }
    }

    override fun readAppEntry(): Flow<Boolean> {
        return context.dataStore.data.map { prefs ->
            prefs[PreferencesKeys.APP_ENTRY] ?: false
        }
    }
}

private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = USER_SETTINGS_STORE_KEY)

private object PreferencesKeys {
    val APP_ENTRY = booleanPreferencesKey(APP_ENTRY_STORE_KEY)
}