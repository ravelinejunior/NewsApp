package com.raveline.newsapp.data.remote.dto


import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import android.os.Parcelable
import com.raveline.newsapp.domain.model.ArticleModel

@Parcelize
data class NewsResponseModel(
    @SerializedName("status")
    val status: String,
    @SerializedName("totalResults")
    val totalResults: Int,
    @SerializedName("articles")
    val articles: List<ArticleModel>
) : Parcelable