package raf.console.primenotes.domain.use_cases

import raf.console.primenotes.domain.repo.NoteRepo
import javax.inject.Inject

// Юз-кейс для получения заметок с определённым значением sortOrder
class GetNotesBySortOrderUseCase @Inject constructor(
    private val noteRepo: NoteRepo
) {
    operator fun invoke(sortOrder: Int) = noteRepo.getNotesBySortOrder(sortOrder)
}