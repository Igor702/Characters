package com.example.scrollcharacters.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.scrollcharacters.CharacterViewModel
import com.example.scrollcharacters.databinding.FragmentCharactersBinding

class CharactersFragment : Fragment() {

    val viewModel: CharacterViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val binding = FragmentCharactersBinding.inflate(inflater, container, false)

        binding.lifecycleOwner = this

        viewModel.getCharactersList()

        binding.viewModel = viewModel

        binding.recyclerView.adapter = CharactersAdapter()

        return binding.root
    }


}