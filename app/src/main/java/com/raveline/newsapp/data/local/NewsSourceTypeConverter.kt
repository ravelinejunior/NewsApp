package com.raveline.newsapp.data.local

import androidx.room.ProvidedTypeConverter
import androidx.room.TypeConverter
import com.raveline.newsapp.domain.model.SourceModel

@ProvidedTypeConverter
class NewsSourceTypeConverter {
    @TypeConverter
    fun sourceToString(sourceModel: SourceModel): String {
        return "${sourceModel.id},${sourceModel.name}"
    }

    @TypeConverter
    fun stringToSource(values: String): SourceModel {
        val sourceString = values.split(",")
        return SourceModel(sourceString[0], sourceString[1])
    }
}