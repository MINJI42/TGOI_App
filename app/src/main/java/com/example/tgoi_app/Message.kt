package com.example.tgoi_app

data class Message(
    val senderId: String,
    val senderNickname: String,
    val content: String,
    val timestamp: Long
)
