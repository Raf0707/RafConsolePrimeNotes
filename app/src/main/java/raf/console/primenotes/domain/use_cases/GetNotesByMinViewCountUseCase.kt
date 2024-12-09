package raf.console.primenotes.domain.use_cases

import raf.console.primenotes.domain.repo.NoteRepo
import javax.inject.Inject

// Юз-кейс для получения заметок с заданным количеством просмотров
class GetNotesByMinViewCountUseCase @Inject constructor(
    private val noteRepo: NoteRepo
) {
    operator fun invoke(minViews: Int) = noteRepo.getNotesByMinViewCount(minViews)
}