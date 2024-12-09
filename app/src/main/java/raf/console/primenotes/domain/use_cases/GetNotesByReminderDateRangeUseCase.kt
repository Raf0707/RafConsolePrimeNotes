package raf.console.primenotes.domain.use_cases

import raf.console.primenotes.domain.repo.NoteRepo
import javax.inject.Inject

// Юз-кейс для получения заметок по дате напоминания
class GetNotesByReminderDateRangeUseCase @Inject constructor(
    private val noteRepo: NoteRepo
) {
    operator fun invoke(startDate: java.util.Date, endDate: java.util.Date) =
        noteRepo.getNotesByReminderDateRange(startDate, endDate)
}