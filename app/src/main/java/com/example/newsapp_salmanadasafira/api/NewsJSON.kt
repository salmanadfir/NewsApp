package com.example.newsapp_salmanadasafira.api

data class NewsJSON(
    val news: List<New>,
    val page: Int,
    val status: String
)