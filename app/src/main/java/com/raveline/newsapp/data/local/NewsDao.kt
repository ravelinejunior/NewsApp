package com.raveline.newsapp.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.raveline.newsapp.domain.model.ArticleModel
import kotlinx.coroutines.flow.Flow

@Dao
interface NewsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNews(articleModel: ArticleModel)

    @Delete
    suspend fun deleteNews(articleModel: ArticleModel)

    @Query("SELECT * FROM ARTICLES_TABLE")
    fun getAllStoredNews(): Flow<List<ArticleModel>>

}