package raf.console.primenotes.domain.use_cases

import raf.console.primenotes.domain.repo.NoteRepo
import javax.inject.Inject

// Юз-кейс для получения заметок по геолокации
class GetNotesByLocationUseCase @Inject constructor(
    private val noteRepo: NoteRepo
) {
    operator fun invoke(location: String) = noteRepo.getNotesByLocation(location)
}