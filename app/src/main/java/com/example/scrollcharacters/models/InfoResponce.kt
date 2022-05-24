package com.example.scrollcharacters.models

data class InfoResponce(
    val count: Int,
    val pages: Int,
    val next: String,
    val prev: String?
)
