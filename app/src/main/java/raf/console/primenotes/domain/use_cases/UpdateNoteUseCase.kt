package raf.console.primenotes.domain.use_cases

import raf.console.primenotes.data.local.model.Note
import raf.console.primenotes.domain.repo.NoteRepo
import javax.inject.Inject

// Юз-кейс для обновления заметки
class UpdateNoteUseCase @Inject constructor(
    private val noteRepo: NoteRepo
) {
    suspend operator fun invoke(note: Note) = noteRepo.update(note)
}