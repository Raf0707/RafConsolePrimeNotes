package raf.console.primenotes.data.local.model

import java.util.Date

data class Comment(
    val userId: String, // ID пользователя
    val content: String, // Текст комментария
    val timestamp: Date // Время добавления комментария
)
