package com.example.scrollcharacters.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.scrollcharacters.data.Character
import com.example.scrollcharacters.databinding.CharacterCardBinding
import com.example.scrollcharacters.ui.CharactersFragmentDirections

class CharactersAdapter(private val dataset: List<Character>) :
    RecyclerView.Adapter<CharactersAdapter.ViewHolder>() {
    class ViewHolder(private var binding: CharacterCardBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Character) {
            binding.textViewName.text = item.name
            binding.imageViewCharacter.setImageResource(item.image)
            binding.textViewId.text = item.id.toString()
            binding.textViewGender.text = item.gender
            binding.textViewType.text = item.type
            binding.cardId.setOnClickListener {
                it.findNavController().navigate(CharactersFragmentDirections.actionNavHostFragmentToDetailsFragment(item.id))
            }

        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val adapter = LayoutInflater.from(parent.context)

        return ViewHolder(
            CharacterCardBinding.inflate(adapter, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = dataset[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int = dataset.size
}