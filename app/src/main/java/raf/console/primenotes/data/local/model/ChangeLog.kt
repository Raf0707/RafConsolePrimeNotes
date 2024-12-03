package raf.console.primenotes.data.local.model

import java.util.Date

data class ChangeLog(
    val timestamp: Date, // Время изменения
    val changes: String // Описание изменения
)