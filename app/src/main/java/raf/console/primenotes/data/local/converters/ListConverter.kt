package raf.console.primenotes.data.local.converters

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import raf.console.primenotes.data.local.model.ChangeLog
import raf.console.primenotes.data.local.model.Comment

class ListConverter {

    private val gson = Gson()

    // Универсальный метод для преобразования списка в строку JSON
    private inline fun <reified T> listToJson(list: List<T>?): String {
        return gson.toJson(list)
    }

    // Универсальный метод для преобразования строки JSON в список
    private inline fun <reified T> jsonToList(data: String?): List<T> {
        if (data.isNullOrEmpty()) return emptyList()
        val listType = object : TypeToken<List<T>>() {}.type
        return gson.fromJson(data, listType)
    }

    // Конвертация List<Comment> в строку JSON
    @TypeConverter
    fun fromCommentList(comments: List<Comment>?): String {
        return listToJson(comments)
    }

    // Конвертация строки JSON в List<Comment>
    @TypeConverter
    fun toCommentList(data: String?): List<Comment> {
        return jsonToList(data)
    }

    // Конвертация List<Long> в строку JSON
    @TypeConverter
    fun fromLongList(list: List<Long>?): String {
        return listToJson(list)
    }

    // Конвертация строки JSON в List<Long>
    @TypeConverter
    fun toLongList(data: String?): List<Long> {
        return jsonToList(data)
    }

    // Конвертация List<String> в строку JSON
    @TypeConverter
    fun fromStringList(list: List<String>?): String {
        return listToJson(list)
    }

    // Конвертация строки JSON в List<String>
    @TypeConverter
    fun toStringList(data: String?): List<String> {
        return jsonToList(data)
    }

    // Конвертация List<ChangeLog> в строку JSON
    @TypeConverter
    fun fromChangeLogList(list: List<ChangeLog>?): String {
        return gson.toJson(list)
    }

    // Конвертация строки JSON в List<ChangeLog>
    @TypeConverter
    fun toChangeLogList(data: String?): List<ChangeLog> {
        if (data.isNullOrEmpty()) return emptyList()
        val listType = object : TypeToken<List<ChangeLog>>() {}.type
        return gson.fromJson(data, listType)
    }
}
