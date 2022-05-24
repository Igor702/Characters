package com.example.scrollcharacters

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.scrollcharacters.models.Character
import com.example.scrollcharacters.network.CharactersApi
import kotlinx.coroutines.launch

class CharacterViewModel : ViewModel() {

    private var _characters = MutableLiveData<List<Character>>()
    val characters: LiveData<List<Character>> = _characters


    fun getCharactersList() {
        viewModelScope.launch {

            try {

                _characters.value = CharactersApi.retrofitService.loadCharacters().results

            } catch (exception: Exception) {
            }
        }
    }


}