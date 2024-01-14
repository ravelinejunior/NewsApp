package com.raveline.newsapp.domain.model


import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class SourceModel(
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val name: String
) : Parcelable