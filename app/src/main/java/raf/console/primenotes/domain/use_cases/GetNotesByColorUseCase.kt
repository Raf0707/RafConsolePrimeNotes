package raf.console.primenotes.domain.use_cases

import raf.console.primenotes.domain.repo.NoteRepo
import javax.inject.Inject

// Юз-кейс для получения заметок с определённым цветом
class GetNotesByColorUseCase @Inject constructor(
    private val noteRepo: NoteRepo
) {
    operator fun invoke(color: String) = noteRepo.getNotesByColor(color)
}