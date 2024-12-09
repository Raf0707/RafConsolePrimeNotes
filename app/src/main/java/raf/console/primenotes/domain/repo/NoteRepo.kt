package raf.console.primenotes.domain.repo

import kotlinx.coroutines.flow.Flow
import raf.console.primenotes.data.local.model.Note
import java.util.*

interface NoteRepo {

    // Получить все заметки
    fun getAllNotes(): Flow<List<Note>>

    // Получить все заметки, отсортированные по названию
    fun getAllNotesOrderByTitle(): Flow<List<Note>>

    // Получить все важные заметки
    fun getAllImportantNotes(): Flow<List<Note>>

    // Получить все закреплённые заметки
    fun getAllBookmarkedNotes(): Flow<List<Note>>

    // Получить все выполненные заметки
    fun getAllCompletedNotes(): Flow<List<Note>>

    // Получить все заметки с вложениями
    fun getAllNotesWithAttachments(): Flow<List<Note>>

    // Получить все заметки с изображениями
    fun getAllNotesWithImages(): Flow<List<Note>>

    // Получить все заметки с аудио
    fun getAllNotesWithAudio(): Flow<List<Note>>

    // Получить заметки по статусу
    fun getNotesByStatus(status: String): Flow<List<Note>>

    // Получить заметки по тегу
    fun getNotesByTag(tag: String): Flow<List<Note>>

    // Получить заметки с напоминаниями
    fun getNotesWithReminders(): Flow<List<Note>>

    // Получить заметки по дате напоминания
    fun getNotesByReminderDateRange(startDate: Date, endDate: Date): Flow<List<Note>>

    // Получить заметки по языку программирования
    fun getNotesByLanguage(language: String): Flow<List<Note>>

    // Получить заметки по геолокации
    fun getNotesByLocation(location: String): Flow<List<Note>>

    // Получить заметки по категории
    fun getNotesByCategory(category: String): Flow<List<Note>>

    // Получить заметки по ID
    fun getNoteById(id: Long): Flow<Note>

    // Получить заметки по содержанию
    fun getNotesByContent(content: String): Flow<List<Note>>

    // Получить заметки по названию
    fun getNotesByTitle(title: String): Flow<List<Note>>

    // Получить заметки по времени создания (диапазон дат)
    fun getNotesByDateRange(startDate: Date, endDate: Date): Flow<List<Note>>

    // Получить заметки с определённым приоритетом
    fun getNotesByPriority(priority: Int): Flow<List<Note>>

    // Получить заметки с определённым цветом
    fun getNotesByColor(color: String): Flow<List<Note>>

    // Получить заметки с указанным текстовым форматом
    fun getNotesByTextFormat(format: String): Flow<List<Note>>

    // Получить заметки с заданным количеством просмотров
    fun getNotesByMinViewCount(minViews: Int): Flow<List<Note>>

    // Получить заметки с определённым значением sortOrder
    fun getNotesBySortOrder(sortOrder: Int): Flow<List<Note>>

    // Получить заметки по ключу шифрования
    fun getNotesByEncryptionKey(encryptionKey: String): Flow<List<Note>>

    // Получить заметки, которые связаны с другими заметками
    fun getRelatedNotes(relatedNoteIds: List<Long>): Flow<List<Note>>

    // Получить заметки с комментарием
    fun getNotesWithComments(): Flow<List<Note>>

    // Обновить путь изображения для заметки
    suspend fun updateImagePath(id: Long, imagePath: String): Int

    // Обновить путь аудиофайла для заметки
    suspend fun updateAudioPath(id: Long, audioPath: String): Int

    // Вставить новую заметку
    suspend fun insert(note: Note)

    // Обновить существующую заметку
    suspend fun update(note: Note)

    // Удалить заметку
    suspend fun delete(note: Note)
}
