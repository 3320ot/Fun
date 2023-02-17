package com.app.`fun`.domain.model

data class Image(
    val id: Long,
    val storageUrl: String,
    val originalUrl: String,
    val likeCount: Long,
    val favouriteCount: Long,
    val weight: Long // For future AI integration
)