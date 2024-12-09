package raf.console.primenotes.domain.use_cases

import raf.console.primenotes.domain.repo.NoteRepo
import javax.inject.Inject

// Юз-кейс для обновления пути аудиофайла заметки
class UpdateAudioPathUseCase @Inject constructor(
    private val noteRepo: NoteRepo
) {
    suspend operator fun invoke(id: Long, audioPath: String) = noteRepo.updateAudioPath(id, audioPath)
}