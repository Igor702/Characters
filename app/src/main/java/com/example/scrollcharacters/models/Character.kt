package com.example.scrollcharacters.models

import com.example.rickandmorthy.network.models.ModelLocation
import com.example.rickandmorthy.network.models.ModelOrigin

data class Character(
    val id: Int,
    val name: String,
    val status: String,
    val species: String,
    val type: String,
    val gender: String,
    val origin: ModelOrigin,
    val location: ModelLocation,
    val image: String,
    val episodeIds: List<Int>?,
    val url: String,
    val created: String
)