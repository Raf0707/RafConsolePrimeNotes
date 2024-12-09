package raf.console.primenotes.presentation.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import raf.console.primenotes.common.ScreenViewState
import raf.console.primenotes.data.local.model.Note
import raf.console.primenotes.domain.use_cases.*
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val getAllNotesUseCase: GetAllNotesUseCase,
    private val getAllNotesOrderByTitleUseCase: GetAllNotesOrderByTitleUseCase,
    private val getAllImportantNotesUseCase: GetAllImportantNotesUseCase,
    private val getAllBookmarkedNotesUseCase: GetAllBookmarkedNotesUseCase,
    private val getAllCompletedNotesUseCase: GetAllCompletedNotesUseCase,
    private val getAllNotesWithAttachmentsUseCase: GetAllNotesWithAttachmentsUseCase,
    private val getAllNotesWithImagesUseCase: GetAllNotesWithImagesUseCase,
    private val getAllNotesWithAudioUseCase: GetAllNotesWithAudioUseCase,
    private val getNotesByStatusUseCase: GetNotesByStatusUseCase,
    private val getNotesByTagUseCase: GetNotesByTagUseCase,
    private val getNotesWithRemindersUseCase: GetNotesWithRemindersUseCase,
    private val getNotesByReminderDateRangeUseCase: GetNotesByReminderDateRangeUseCase,
    private val getNotesByLanguageUseCase: GetNotesByLanguageUseCase,
    private val getNotesByLocationUseCase: GetNotesByLocationUseCase,
    private val getNotesByCategoryUseCase: GetNotesByCategoryUseCase,
    private val getNoteByIdUseCase: GetNoteByIdUseCase,
    private val getNotesByContentUseCase: GetNotesByContentUseCase,
    private val getNotesByTitleUseCase: GetNotesByTitleUseCase,
    private val getNotesByDateRangeUseCase: GetNotesByDateRangeUseCase,
    private val getNotesByPriorityUseCase: GetNotesByPriorityUseCase,
    private val getNotesByColorUseCase: GetNotesByColorUseCase,
    private val getNotesByTextFormatUseCase: GetNotesByTextFormatUseCase,
    private val getNotesByMinViewCountUseCase: GetNotesByMinViewCountUseCase,
    private val getNotesBySortOrderUseCase: GetNotesBySortOrderUseCase,
    private val getNotesByEncryptionKeyUseCase: GetNotesByEncryptionKeyUseCase,
    private val getRelatedNotesUseCase: GetRelatedNotesUseCase,
    private val getNotesWithCommentsUseCase: GetNotesWithCommentsUseCase,
    private val updateImagePathUseCase: UpdateImagePathUseCase,
    private val updateAudioPathUseCase: UpdateAudioPathUseCase,
    private val addNoteUseCase: AddNoteUseCase,
    private val updateNoteUseCase: UpdateNoteUseCase,
    private val deleteNoteUseCase: DeleteNoteUseCase
) : ViewModel() {

    private val _state: MutableStateFlow<HomeState> = MutableStateFlow(HomeState())
    val state: StateFlow<HomeState> = _state.asStateFlow()

    init {
        getAllNotes()
    }

    private fun getAllNotes() {
        getAllNotesUseCase()
            .onEach {
                _state.value = HomeState(notes = ScreenViewState.Success(it))
            }
            .catch {
                _state.value = HomeState(notes = ScreenViewState.Error(it.message))
            }
            .launchIn(viewModelScope)
    }

    fun getAllNotesOrderByTitle() {
        getAllNotesOrderByTitleUseCase()
            .onEach {
                _state.value = HomeState(notes = ScreenViewState.Success(it))
            }
            .catch {
                _state.value = HomeState(notes = ScreenViewState.Error(it.message))
            }
            .launchIn(viewModelScope)
    }

    fun getAllImportantNotes() {
        getAllImportantNotesUseCase()
            .onEach {
                _state.value = HomeState(notes = ScreenViewState.Success(it))
            }
            .catch {
                _state.value = HomeState(notes = ScreenViewState.Error(it.message))
            }
            .launchIn(viewModelScope)
    }

    fun getAllBookmarkedNotes() {
        getAllBookmarkedNotesUseCase()
            .onEach {
                _state.value = HomeState(notes = ScreenViewState.Success(it))
            }
            .catch {
                _state.value = HomeState(notes = ScreenViewState.Error(it.message))
            }
            .launchIn(viewModelScope)
    }

    fun getAllCompletedNotes() {
        getAllCompletedNotesUseCase()
            .onEach {
                _state.value = HomeState(notes = ScreenViewState.Success(it))
            }
            .catch {
                _state.value = HomeState(notes = ScreenViewState.Error(it.message))
            }
            .launchIn(viewModelScope)
    }

    fun getAllNotesWithAttachments() {
        getAllNotesWithAttachmentsUseCase()
            .onEach {
                _state.value = HomeState(notes = ScreenViewState.Success(it))
            }
            .catch {
                _state.value = HomeState(notes = ScreenViewState.Error(it.message))
            }
            .launchIn(viewModelScope)
    }

    fun getAllNotesWithImages() {
        getAllNotesWithImagesUseCase()
            .onEach {
                _state.value = HomeState(notes = ScreenViewState.Success(it))
            }
            .catch {
                _state.value = HomeState(notes = ScreenViewState.Error(it.message))
            }
            .launchIn(viewModelScope)
    }

    fun getAllNotesWithAudio() {
        getAllNotesWithAudioUseCase()
            .onEach {
                _state.value = HomeState(notes = ScreenViewState.Success(it))
            }
            .catch {
                _state.value = HomeState(notes = ScreenViewState.Error(it.message))
            }
            .launchIn(viewModelScope)
    }

    fun getNotesByStatus(status: String) {
        getNotesByStatusUseCase(status)
            .onEach {
                _state.value = HomeState(notes = ScreenViewState.Success(it))
            }
            .catch {
                _state.value = HomeState(notes = ScreenViewState.Error(it.message))
            }
            .launchIn(viewModelScope)
    }

    fun getNotesByTag(tag: String) {
        getNotesByTagUseCase(tag)
            .onEach {
                _state.value = HomeState(notes = ScreenViewState.Success(it))
            }
            .catch {
                _state.value = HomeState(notes = ScreenViewState.Error(it.message))
            }
            .launchIn(viewModelScope)
    }

    fun getNotesWithReminders() {
        getNotesWithRemindersUseCase()
            .onEach {
                _state.value = HomeState(notes = ScreenViewState.Success(it))
            }
            .catch {
                _state.value = HomeState(notes = ScreenViewState.Error(it.message))
            }
            .launchIn(viewModelScope)
    }

    fun getNotesByReminderDateRange(startDate: java.util.Date, endDate: java.util.Date) {
        getNotesByReminderDateRangeUseCase(startDate, endDate)
            .onEach {
                _state.value = HomeState(notes = ScreenViewState.Success(it))
            }
            .catch {
                _state.value = HomeState(notes = ScreenViewState.Error(it.message))
            }
            .launchIn(viewModelScope)
    }

    fun getNotesByLanguage(language: String) {
        getNotesByLanguageUseCase(language)
            .onEach {
                _state.value = HomeState(notes = ScreenViewState.Success(it))
            }
            .catch {
                _state.value = HomeState(notes = ScreenViewState.Error(it.message))
            }
            .launchIn(viewModelScope)
    }

    fun getNotesByLocation(location: String) {
        getNotesByLocationUseCase(location)
            .onEach {
                _state.value = HomeState(notes = ScreenViewState.Success(it))
            }
            .catch {
                _state.value = HomeState(notes = ScreenViewState.Error(it.message))
            }
            .launchIn(viewModelScope)
    }

    fun getNotesByCategory(category: String) {
        getNotesByCategoryUseCase(category)
            .onEach {
                _state.value = HomeState(notes = ScreenViewState.Success(it))
            }
            .catch {
                _state.value = HomeState(notes = ScreenViewState.Error(it.message))
            }
            .launchIn(viewModelScope)
    }

    fun getNoteById(id: Long) {
        getNoteByIdUseCase(id)
            .onEach {
                _state.value = HomeState(notes = ScreenViewState.Success(listOf(it)))
            }
            .catch {
                _state.value = HomeState(notes = ScreenViewState.Error(it.message))
            }
            .launchIn(viewModelScope)
    }

    fun getNotesByContent(content: String) {
        getNotesByContentUseCase(content)
            .onEach {
                _state.value = HomeState(notes = ScreenViewState.Success(it))
            }
            .catch {
                _state.value = HomeState(notes = ScreenViewState.Error(it.message))
            }
            .launchIn(viewModelScope)
    }

    fun getNotesByTitle(title: String) {
        getNotesByTitleUseCase(title)
            .onEach {
                _state.value = HomeState(notes = ScreenViewState.Success(it))
            }
            .catch {
                _state.value = HomeState(notes = ScreenViewState.Error(it.message))
            }
            .launchIn(viewModelScope)
    }

    fun getNotesByDateRange(startDate: java.util.Date, endDate: java.util.Date) {
        getNotesByDateRangeUseCase(startDate, endDate)
            .onEach {
                _state.value = HomeState(notes = ScreenViewState.Success(it))
            }
            .catch {
                _state.value = HomeState(notes = ScreenViewState.Error(it.message))
            }
            .launchIn(viewModelScope)
    }

    fun getNotesByPriority(priority: Int) {
        getNotesByPriorityUseCase(priority)
            .onEach {
                _state.value = HomeState(notes = ScreenViewState.Success(it))
            }
            .catch {
                _state.value = HomeState(notes = ScreenViewState.Error(it.message))
            }
            .launchIn(viewModelScope)
    }

    fun getNotesByColor(color: String) {
        getNotesByColorUseCase(color)
            .onEach {
                _state.value = HomeState(notes = ScreenViewState.Success(it))
            }
            .catch {
                _state.value = HomeState(notes = ScreenViewState.Error(it.message))
            }
            .launchIn(viewModelScope)
    }

    fun getNotesByTextFormat(format: String) {
        getNotesByTextFormatUseCase(format)
            .onEach {
                _state.value = HomeState(notes = ScreenViewState.Success(it))
            }
            .catch {
                _state.value = HomeState(notes = ScreenViewState.Error(it.message))
            }
            .launchIn(viewModelScope)
    }

    fun getNotesByMinViewCount(viewCount: Int) {
        getNotesByMinViewCountUseCase(viewCount)
            .onEach {
                _state.value = HomeState(notes = ScreenViewState.Success(it))
            }
            .catch {
                _state.value = HomeState(notes = ScreenViewState.Error(it.message))
            }
            .launchIn(viewModelScope)
    }

    fun getNotesBySortOrder(sortOrder: Int) {
        getNotesBySortOrderUseCase(sortOrder)
            .onEach {
                _state.value = HomeState(notes = ScreenViewState.Success(it))
            }
            .catch {
                _state.value = HomeState(notes = ScreenViewState.Error(it.message))
            }
            .launchIn(viewModelScope)
    }

    fun getNotesByEncryptionKey(encryptionKey: String) {
        getNotesByEncryptionKeyUseCase(encryptionKey)
            .onEach {
                _state.value = HomeState(notes = ScreenViewState.Success(it))
            }
            .catch {
                _state.value = HomeState(notes = ScreenViewState.Error(it.message))
            }
            .launchIn(viewModelScope)
    }

    fun getRelatedNotes(noteId: Long) {
        getRelatedNotesUseCase(listOf(noteId))
            .onEach {
                _state.value = HomeState(notes = ScreenViewState.Success(it))
            }
            .catch {
                _state.value = HomeState(notes = ScreenViewState.Error(it.message))
            }
            .launchIn(viewModelScope)
    }

    fun getNotesWithComments() {
        getNotesWithCommentsUseCase()
            .onEach {
                _state.value = HomeState(notes = ScreenViewState.Success(it))
            }
            .catch {
                _state.value = HomeState(notes = ScreenViewState.Error(it.message))
            }
            .launchIn(viewModelScope)
    }

    fun addNote(note: Note) = viewModelScope.launch {
        addNoteUseCase(note)
    }

    fun updateNote(note: Note) = viewModelScope.launch {
        updateNoteUseCase(note)
    }



    fun deleteNote(note: Note) = viewModelScope.launch {
        deleteNoteUseCase(note)
    }
}

data class HomeState(
    val notes: ScreenViewState<List<Note>> = ScreenViewState.Loading,
)
