package com.raveline.newsapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.raveline.newsapp.domain.model.ArticleModel

@Database(
    entities = [ArticleModel::class],
    version = 1
)
@TypeConverters(NewsSourceTypeConverter::class)
abstract class NewsDatabase : RoomDatabase() {
    abstract val newsDao: NewsDao
}