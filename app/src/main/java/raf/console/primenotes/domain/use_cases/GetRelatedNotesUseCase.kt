package raf.console.primenotes.domain.use_cases

import raf.console.primenotes.domain.repo.NoteRepo
import javax.inject.Inject

// Юз-кейс для получения связанных заметок
class GetRelatedNotesUseCase @Inject constructor(
    private val noteRepo: NoteRepo
) {
    operator fun invoke(relatedNoteIds: List<Long>) = noteRepo.getRelatedNotes(relatedNoteIds)
}