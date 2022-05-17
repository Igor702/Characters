package com.example.scrollcharacters.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.scrollcharacters.R
import com.example.scrollcharacters.adapters.CharactersAdapter
import com.example.scrollcharacters.data.Character
import com.example.scrollcharacters.data.DataSource
import com.example.scrollcharacters.databinding.FragmentCharactersBinding

class CharactersFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val binding = FragmentCharactersBinding.inflate(inflater, container, false)
        val dataset: List<Character> = DataSource().loadData()


        binding.recyclerView.adapter = CharactersAdapter(dataset)


        return binding.root
    }





}