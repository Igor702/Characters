package com.example.scrollcharacters.data

import com.example.scrollcharacters.R

class DataSource {

    //TODO:change loadData for Character type
    fun loadData() = listOf<Character>(
        Character(1, "Rick Sanchez", "Alive", ":", "Cyborg",
            "Male","--" ,"Earth C137", R.drawable.rick_sanchez, "000", "url", "created"),
        Character(2, "Morty Smith", "Alive", ":", "Human",
            "Male","--" ,"Earth C137", R.drawable.morty501, "000", "url", "created"),
        Character(3, "Beth Smith", "Alive", ":", "Human",
            "Female","--" ,"Earth C137", R.drawable.beth_smith, "000", "url", "created"),
        Character(4, "Summer Smith", "Alive", ":", "Human",
            "Female","--" ,"Earth C137", R.drawable.summer_is_cool, "000", "url", "created"),
        Character(5, "Jerry Smith", "Alive", ":", "Human",
            "Male","--" ,"Earth C137", R.drawable.jerry_smith, "000", "url", "created"),
        Character(6, "Evil Morty", "Alive", ":", "Human",
            "Male","--" ,"Unknown", R.drawable.evilmortys1, "000", "url", "created"),
        Character(7, "Birdperson", "Alive", ":", "Humanoid",
            "Male","--" ,"Unknown", R.drawable.newbirdperson, "000", "url", "created"),
        Character(8, "Squanchy", "Alive", ":", "Humanoid",
            "Male","--" ,"Unknown", R.drawable.squanchy_, "000", "url", "created"),
        Character(9, "Abradolph Lincler", "Dead", ":", "Human",
            "Male","--" ,"Earth C137", R.drawable.abradolf_lincler_angry, "000", "url", "created"),
        Character(10, "Meeseeks", "Unknown", ":", "Helper",
            "Unknown","--" ,"Unknown", R.drawable.meeseekshq, "000", "url", "created"),


    )
}