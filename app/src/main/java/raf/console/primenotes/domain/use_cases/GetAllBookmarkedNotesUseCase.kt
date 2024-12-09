package raf.console.primenotes.domain.use_cases

import raf.console.primenotes.data.local.model.Note
import raf.console.primenotes.domain.repo.NoteRepo
import javax.inject.Inject

// Юз-кейс для получения всех закреплённых заметок
class GetAllBookmarkedNotesUseCase @Inject constructor(
    private val noteRepo: NoteRepo
) {
    operator fun invoke() = noteRepo.getAllBookmarkedNotes()
}