package raf.console.primenotes.data.repo


import kotlinx.coroutines.flow.Flow
import raf.console.primenotes.data.local.dao.NoteDao
import raf.console.primenotes.data.local.model.Note
import raf.console.primenotes.domain.repo.NoteRepo
import java.util.*

class NoteRepoImpl(
    private val noteDao: NoteDao
) : NoteRepo {

    // Получить все заметки
    override fun getAllNotes(): Flow<List<Note>> = noteDao.getAllNotes()

    // Получить все заметки, отсортированные по названию
    override fun getAllNotesOrderByTitle(): Flow<List<Note>> = noteDao.getAllNotesOrderByTitle()

    // Получить все важные заметки
    override fun getAllImportantNotes(): Flow<List<Note>> = noteDao.getAllImportantNotes()

    // Получить все закреплённые заметки
    override fun getAllBookmarkedNotes(): Flow<List<Note>> = noteDao.getAllBookmarkedNotes()

    // Получить все выполненные заметки
    override fun getAllCompletedNotes(): Flow<List<Note>> = noteDao.getAllCompletedNotes()

    // Получить все заметки с вложениями
    override fun getAllNotesWithAttachments(): Flow<List<Note>> = noteDao.getAllNotesWithAttachments()

    // Получить все заметки с изображениями
    override fun getAllNotesWithImages(): Flow<List<Note>> = noteDao.getAllNotesWithImages()

    // Получить все заметки с аудио
    override fun getAllNotesWithAudio(): Flow<List<Note>> = noteDao.getAllNotesWithAudio()

    // Получить заметки по статусу
    override fun getNotesByStatus(status: String): Flow<List<Note>> = noteDao.getNotesByStatus(status)

    // Получить заметки по тегу
    override fun getNotesByTag(tag: String): Flow<List<Note>> = noteDao.getNotesByTag(tag)

    // Получить заметки с напоминаниями
    override fun getNotesWithReminders(): Flow<List<Note>> = noteDao.getNotesWithReminders()

    // Получить заметки по дате напоминания
    override fun getNotesByReminderDateRange(startDate: Date, endDate: Date): Flow<List<Note>> =
        noteDao.getNotesByReminderDateRange(startDate, endDate)

    // Получить заметки по языку программирования
    override fun getNotesByLanguage(language: String): Flow<List<Note>> = noteDao.getNotesByLanguage(language)

    // Получить заметки по геолокации
    override fun getNotesByLocation(location: String): Flow<List<Note>> = noteDao.getNotesByLocation(location)

    // Получить заметки по категории
    override fun getNotesByCategory(category: String): Flow<List<Note>> = noteDao.getNotesByCategory(category)

    // Получить заметки по ID
    override fun getNoteById(id: Long): Flow<Note> = noteDao.getNoteById(id)

    // Получить заметки по содержанию
    override fun getNotesByContent(content: String): Flow<List<Note>> = noteDao.getNotesByContent(content)

    // Получить заметки по названию
    override fun getNotesByTitle(title: String): Flow<List<Note>> = noteDao.getNotesByTitle(title)

    // Получить заметки по времени создания (диапазон дат)
    override fun getNotesByDateRange(startDate: Date, endDate: Date): Flow<List<Note>> =
        noteDao.getNotesByDateRange(startDate, endDate)

    // Получить заметки с определённым приоритетом
    override fun getNotesByPriority(priority: Int): Flow<List<Note>> = noteDao.getNotesByPriority(priority)

    // Получить заметки с определённым цветом
    override fun getNotesByColor(color: String): Flow<List<Note>> = noteDao.getNotesByColor(color)

    // Получить заметки с указанным текстовым форматом
    override fun getNotesByTextFormat(format: String): Flow<List<Note>> = noteDao.getNotesByTextFormat(format)

    // Получить заметки с заданным количеством просмотров
    override fun getNotesByMinViewCount(minViews: Int): Flow<List<Note>> = noteDao.getNotesByMinViewCount(minViews)

    // Получить заметки с определённым значением sortOrder
    override fun getNotesBySortOrder(sortOrder: Int): Flow<List<Note>> = noteDao.getNotesBySortOrder(sortOrder)

    // Получить заметки по ключу шифрования
    override fun getNotesByEncryptionKey(encryptionKey: String): Flow<List<Note>> =
        noteDao.getNotesByEncryptionKey(encryptionKey)

    // Получить заметки, которые связаны с другими заметками
    override fun getRelatedNotes(relatedNoteIds: List<Long>): Flow<List<Note>> = noteDao.getRelatedNotes(relatedNoteIds)

    // Получить заметки с комментарием
    override fun getNotesWithComments(): Flow<List<Note>> = noteDao.getNotesWithComments()

    // Обновить путь изображения для заметки
    override suspend fun updateImagePath(id: Long, imagePath: String): Int = noteDao.updateImagePath(id, imagePath)

    // Обновить путь аудиофайла для заметки
    override suspend fun updateAudioPath(id: Long, audioPath: String): Int = noteDao.updateAudioPath(id, audioPath)

    // Вставить новую заметку
    override suspend fun insert(note: Note) = noteDao.insert(note)

    // Обновить существующую заметку
    override suspend fun update(note: Note) = noteDao.update(note)

    // Удалить заметку
    override suspend fun delete(note: Note) = noteDao.delete(note)
}
