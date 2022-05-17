package com.example.scrollcharacters.data

import androidx.annotation.DrawableRes

data class Character(
//    @DrawableRes val image: Int,
//    val name: String,
//    val age: Int
    val id: Int,
    val name: String,
    val status: String,
    val species: String,
    val type: String,
    val gender: String,
    val origin: String,
    val location: String,
    @DrawableRes val image: Int,
    val episodeIds: String,
    val url: String,
    val created: String
)