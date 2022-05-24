package com.example.scrollcharacters.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.navArgs
import com.example.scrollcharacters.CharacterViewModel
import com.example.scrollcharacters.databinding.FragmentDetailsBinding
import com.squareup.picasso.Picasso

class DetailsFragment : Fragment() {
    val viewModel: CharacterViewModel by activityViewModels()

    private val args: DetailsFragmentArgs by navArgs()
    private lateinit var binding: FragmentDetailsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailsBinding.inflate(inflater)

        bind(args.id - 1)
        return binding.root
    }

    fun bind(id: Int) {
        val temp = viewModel.characters.value
        val item = temp?.get(id)

        val imageView = binding.imageAvatar
        Picasso.get().load(item?.image).into(imageView)


        binding.textViewName.text = "Name: " + item?.name
        binding.textViewId.text = "Id: " + item?.id.toString()
        binding.textViewGender.text = "Gender: " + item?.gender
        if (item?.type == "") {
            binding.textViewType.text = "Type: " + "unknown"
        } else {
            binding.textViewType.text = "Type: " + item?.type
        }

        binding.textViewSpecies.text = "Species: " + item?.species
        binding.textViewOrigin.text = "Origin: " + item?.origin?.name


    }


}