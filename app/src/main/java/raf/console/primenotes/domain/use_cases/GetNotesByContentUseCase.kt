package raf.console.primenotes.domain.use_cases

import raf.console.primenotes.domain.repo.NoteRepo
import javax.inject.Inject

// Юз-кейс для получения заметок по содержанию
class GetNotesByContentUseCase @Inject constructor(
    private val noteRepo: NoteRepo
) {
    operator fun invoke(content: String) = noteRepo.getNotesByContent(content)
}