package raf.console.primenotes.domain.use_cases

import raf.console.primenotes.domain.repo.NoteRepo
import javax.inject.Inject

// Юз-кейс для получения заметок по ключу шифрования
class GetNotesByEncryptionKeyUseCase @Inject constructor(
    private val noteRepo: NoteRepo
) {
    operator fun invoke(encryptionKey: String) = noteRepo.getNotesByEncryptionKey(encryptionKey)
}