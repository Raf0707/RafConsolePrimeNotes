package raf.console.primenotes.domain.use_cases

import raf.console.primenotes.domain.repo.NoteRepo
import javax.inject.Inject

// Юз-кейс для обновления пути изображения заметки
class UpdateImagePathUseCase @Inject constructor(
    private val noteRepo: NoteRepo
) {
    suspend operator fun invoke(id: Long, imagePath: String) = noteRepo.updateImagePath(id, imagePath)
}