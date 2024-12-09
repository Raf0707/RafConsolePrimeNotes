package raf.console.primenotes.domain.use_cases

import raf.console.primenotes.domain.repo.NoteRepo
import javax.inject.Inject

// Юз-кейс для получения заметок по времени создания (диапазон дат)
class GetNotesByDateRangeUseCase @Inject constructor(
    private val noteRepo: NoteRepo
) {
    operator fun invoke(startDate: java.util.Date, endDate: java.util.Date) =
        noteRepo.getNotesByDateRange(startDate, endDate)
}