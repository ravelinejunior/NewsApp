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
    suspend fun upsertNews(articleModel: ArticleModel)

    @Delete
    suspend fun deleteNews(articleModel: ArticleModel)

    @Query("SELECT * FROM ARTICLES_TABLE ORDER BY id DESC")
    fun getAllStoredNews(): Flow<List<ArticleModel>>

    @Query("SELECT * FROM ARTICLES_TABLE WHERE url =:url")
    suspend fun getSelectedArticle(url:String):ArticleModel?

}