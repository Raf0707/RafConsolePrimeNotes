package raf.console.primenotes.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow
import raf.console.primenotes.data.local.model.Note
import java.util.*

@Dao
interface NoteDao {

    // Получить все заметки
    @Query("SELECT * FROM notes ORDER BY createdDate")
    fun getAllNotes(): Flow<List<Note>>

    // Получить все заметки, отсортированные по названию
    @Query("SELECT * FROM notes ORDER BY title")
    fun getAllNotesOrderByTitle(): Flow<List<Note>>

    // Получить все важные заметки
    @Query("SELECT * FROM notes WHERE isImportant = 1 ORDER BY createdDate")
    fun getAllImportantNotes(): Flow<List<Note>>

    // Получить все закреплённые заметки
    @Query("SELECT * FROM notes WHERE isBookmarked = 1 ORDER BY createdDate")
    fun getAllBookmarkedNotes(): Flow<List<Note>>

    // Получить все выполненные заметки
    @Query("SELECT * FROM notes WHERE isCompleted = 1 ORDER BY createdDate")
    fun getAllCompletedNotes(): Flow<List<Note>>

    // Получить все заметки с вложениями
    @Query("SELECT * FROM notes WHERE attachments IS NOT NULL AND attachments != '' ORDER BY createdDate")
    fun getAllNotesWithAttachments(): Flow<List<Note>>

    // Получить все заметки с изображениями
    @Query("SELECT * FROM notes WHERE imagePath IS NOT NULL ORDER BY createdDate")
    fun getAllNotesWithImages(): Flow<List<Note>>

    // Получить все заметки с аудио
    @Query("SELECT * FROM notes WHERE audioPath IS NOT NULL ORDER BY createdDate")
    fun getAllNotesWithAudio(): Flow<List<Note>>

    // Получить заметки по статусу
    @Query("SELECT * FROM notes WHERE status=:status ORDER BY createdDate")
    fun getNotesByStatus(status: String): Flow<List<Note>>

    // Получить заметки по тегу
    @Query("SELECT * FROM notes WHERE tags LIKE '%' || :tag || '%' ORDER BY createdDate")
    fun getNotesByTag(tag: String): Flow<List<Note>>

    // Получить заметки с напоминаниями
    @Query("SELECT * FROM notes WHERE reminderDate IS NOT NULL ORDER BY createdDate")
    fun getNotesWithReminders(): Flow<List<Note>>

    // Получить заметки по дате напоминания
    @Query("SELECT * FROM notes WHERE reminderDate BETWEEN :startDate AND :endDate ORDER BY createdDate")
    fun getNotesByReminderDateRange(startDate: Date, endDate: Date): Flow<List<Note>>

    // Получить заметки по языку программирования
    @Query("SELECT * FROM notes WHERE language=:language ORDER BY createdDate")
    fun getNotesByLanguage(language: String): Flow<List<Note>>

    // Получить заметки по геолокации
    @Query("SELECT * FROM notes WHERE location=:location ORDER BY createdDate")
    fun getNotesByLocation(location: String): Flow<List<Note>>

    // Получить заметки по категории
    @Query("SELECT * FROM notes WHERE category=:category ORDER BY createdDate")
    fun getNotesByCategory(category: String): Flow<List<Note>>

    // Получить заметки по ID
    @Query("SELECT * FROM notes WHERE id=:id ORDER BY createdDate")
    fun getNoteById(id: Long): Flow<Note>

    // Получить заметки по содержанию
    @Query("SELECT * FROM notes WHERE content LIKE '%' || :content || '%' ORDER BY createdDate")
    fun getNotesByContent(content: String): Flow<List<Note>>

    // Получить заметки по названию
    @Query("SELECT * FROM notes WHERE title=:title ORDER BY createdDate")
    fun getNotesByTitle(title: String): Flow<List<Note>>

    // Получить заметки по времени создания (диапазон дат)
    @Query("SELECT * FROM notes WHERE createdDate BETWEEN :startDate AND :endDate ORDER BY createdDate")
    fun getNotesByDateRange(startDate: Date, endDate: Date): Flow<List<Note>>

    // Получить заметки с определённым приоритетом
    @Query("SELECT * FROM notes WHERE priority=:priority ORDER BY createdDate")
    fun getNotesByPriority(priority: Int): Flow<List<Note>>

    // Получить заметки с определённым цветом
    @Query("SELECT * FROM notes WHERE color=:color ORDER BY createdDate")
    fun getNotesByColor(color: String): Flow<List<Note>>

    // Получить заметки с указанным текстовым форматом
    @Query("SELECT * FROM notes WHERE textFormat=:format ORDER BY createdDate")
    fun getNotesByTextFormat(format: String): Flow<List<Note>>

    // Получить заметки с заданным количеством просмотров
    @Query("SELECT * FROM notes WHERE viewCount >= :minViews ORDER BY createdDate")
    fun getNotesByMinViewCount(minViews: Int): Flow<List<Note>>

    // Получить заметки с определённым значением sortOrder
    @Query("SELECT * FROM notes WHERE sortOrder=:sortOrder ORDER BY createdDate")
    fun getNotesBySortOrder(sortOrder: Int): Flow<List<Note>>

    // Получить заметки по ключу шифрования
    @Query("SELECT * FROM notes WHERE encryptionKey=:encryptionKey ORDER BY createdDate")
    fun getNotesByEncryptionKey(encryptionKey: String): Flow<List<Note>>

    // Получить заметки, которые связаны с другими заметками
    @Query("SELECT * FROM notes WHERE id IN (:relatedNoteIds) ORDER BY createdDate")
    fun getRelatedNotes(relatedNoteIds: List<Long>): Flow<List<Note>>

    // Получить заметки с комментарием
    @Query("SELECT * FROM notes WHERE comments IS NOT NULL AND comments != '' ORDER BY createdDate")
    fun getNotesWithComments(): Flow<List<Note>>

    // Вставить новую заметку
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(note: Note)

    // Обновить существующую заметку
    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun update(note: Note)

    // Удалить заметку
    @Delete
    suspend fun delete(note: Note)

    // Обновить путь изображения для заметки
    @Query("UPDATE notes SET imagePath=:imagePath WHERE id=:id")
    suspend fun updateImagePath(id: Long, imagePath: String)

    // Обновить путь аудиофайла для заметки
    @Query("UPDATE notes SET audioPath=:audioPath WHERE id=:id")
    suspend fun updateAudioPath(id: Long, audioPath: String)
}
