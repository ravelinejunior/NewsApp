package com.raveline.newsapp.domain.model


import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import com.raveline.newsapp.utils.Constants.ARTICLES_NEWS_DATABASE_TABLE
import kotlinx.parcelize.Parcelize

@Entity(tableName = ARTICLES_NEWS_DATABASE_TABLE)
@Parcelize
data class ArticleModel(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,

    @SerializedName("source")
    val source: SourceModel,
    @SerializedName("author")
    val author: String? = "",
    @SerializedName("title")
    val title: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("url")
    val url: String,
    @SerializedName("urlToImage")
    val urlToImage: String,
    @SerializedName("publishedAt")
    val publishedAt: String,
    @SerializedName("content")
    val content: String,
    var isStored:Boolean = false
) : Parcelable