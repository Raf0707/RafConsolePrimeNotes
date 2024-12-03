package raf.console.primenotes.data.local.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Date

@Entity(tableName = "notes")
data class Note(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0, // Уникальный идентификатор заметки

    @ColumnInfo("title")
    val title: String, // Заголовок заметки

    @ColumnInfo("content")
    val content: String, // Основное содержимое заметки

    @ColumnInfo("createdDate")
    val createdDate: Date, // Дата создания заметки

    @ColumnInfo("lastUpdatedDate")
    val lastUpdatedDate: Date? = null, // Последняя дата обновления

    @ColumnInfo("isBookmarked")
    val isBookmarked: Boolean = false, // Закреплена ли заметка

    @ColumnInfo("isImportant")
    val isImportant: Boolean = false, // Является ли важной

    @ColumnInfo("isCompleted")
    val isCompleted: Boolean = false, // Является ли законченной

    @ColumnInfo("isEncrypted")
    val isEncrypted: Boolean = false, //Является ли зашифрованной

    @ColumnInfo("encryptionKey")
    val encryptionKey: String? = null, // ключ шифрования

    @ColumnInfo("comments")
    val comments: List<Comment> = emptyList(), // комментарии к заметке

    @ColumnInfo("relatedNotes")
    val relatedNotes: List<Long> = emptyList(), // Список ID связанных заметок

    @ColumnInfo("createdAt")
    val createdAt: Long = System.currentTimeMillis(), // тайм-штамп создания заметки

    @ColumnInfo("updatedAt") // тайм-штамп обновления заметки
    val updatedAt: Long? = null,

    @ColumnInfo("tags")
    val tags: List<String> = emptyList(), // Список тегов

    @ColumnInfo("reminderDate")
    val reminderDate: Date? = null, // Дата напоминания

    @ColumnInfo("repeatInterval")
    val repeatInterval: String? = null, // Интервал повторения напоминаний (например, "Ежедневно")

    @ColumnInfo("color")
    val color: String = "#FFFFFF", // Цвет заметки

    @ColumnInfo("attachments")
    val attachments: List<String> = emptyList(), // Список путей к вложениям

    @ColumnInfo("priority")
    val priority: Int = 0, // Приоритет заметки (0: нормальный, 1: высокий, 2: низкий)

    @ColumnInfo("isCodeNote")
    val isCodeNote: Boolean = false, // Является ли заметка кодом

    @ColumnInfo("language")
    val language: String? = null, // Язык программирования (например, "kotlin")

    @ColumnInfo("location")
    val location: String? = null, // Геолокация, где была создана заметка

    @ColumnInfo("history")
    val history: List<ChangeLog> = emptyList(), // История изменений

    @ColumnInfo("sharedWith")
    val sharedWith: List<String> = emptyList(), // Список пользователей, с которыми поделились заметкой

    @ColumnInfo("audioAttachment")
    val audioAttachment: String? = null, // Путь к звуковому файлу

    @ColumnInfo("status")
    val status: String = "active", // Статус заметки (active, archived, deleted)

    @ColumnInfo("viewCount")
    val viewCount: Int = 0, // Счётчик просмотров

    @ColumnInfo("category")
    val category: String? = null, // Категория заметки

    @ColumnInfo("textFormat")
    val textFormat: String? = null, // Формат текста (Markdown, HTML, PlainText)

    @ColumnInfo("sortOrder")
    val sortOrder: Int = 0, // Порядок сортировки заметки

    // Дополнительные поля для фото и голосовых заметок
    @ColumnInfo("imagePath")
    val imagePath: String? = null, // Path to the image file (optional)

    @ColumnInfo("audioPath")
    val audioPath: String? = null // Path to the audio file (optional)
)
