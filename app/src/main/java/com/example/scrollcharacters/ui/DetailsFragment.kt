package com.example.scrollcharacters.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.example.scrollcharacters.R
import com.example.scrollcharacters.data.Character
import com.example.scrollcharacters.data.DataSource
import com.example.scrollcharacters.databinding.FragmentDetailsBinding

class DetailsFragment: Fragment() {

    private val args: DetailsFragmentArgs by navArgs()
    private lateinit var binding:FragmentDetailsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
         binding = FragmentDetailsBinding.inflate(inflater)

        bind(args.id)
        return binding.root
    }

    fun bind(id: Int) {
        val item = DataSource().loadData()[id-1]
        binding.textViewName.text = item.name
        binding.imageViewCharacter.setImageResource(item.image)
        binding.textViewId.text = item.id.toString()
        binding.textViewGender.text = item.gender
        binding.textViewType.text = item.type


    }


}