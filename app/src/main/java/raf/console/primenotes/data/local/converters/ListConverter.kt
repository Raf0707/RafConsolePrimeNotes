package raf.console.primenotes.data.local.converters

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import raf.console.primenotes.data.local.model.Comment

class ListConverter {

    private val gson = Gson()

    // Конвертация List<Comment> в строку
    @TypeConverter
    fun fromCommentList(comments: List<Comment>?): String {
        return gson.toJson(comments)
    }

    // Конвертация строки в List<Comment>
    @TypeConverter
    fun toCommentList(data: String?): List<Comment> {
        if (data.isNullOrEmpty()) return emptyList()
        val listType = object : TypeToken<List<Comment>>() {}.type
        return gson.fromJson(data, listType)
    }

    // Аналогично для List<Long>
    @TypeConverter
    fun fromLongList(list: List<Long>?): String {
        return gson.toJson(list)
    }

    @TypeConverter
    fun toLongList(data: String?): List<Long> {
        if (data.isNullOrEmpty()) return emptyList()
        val listType = object : TypeToken<List<Long>>() {}.type
        return gson.fromJson(data, listType)
    }

    // Аналогично для List<String>
    @TypeConverter
    fun fromStringList(list: List<String>?): String {
        return gson.toJson(list)
    }

    @TypeConverter
    fun toStringList(data: String?): List<String> {
        if (data.isNullOrEmpty()) return emptyList()
        val listType = object : TypeToken<List<String>>() {}.type
        return gson.fromJson(data, listType)
    }
}