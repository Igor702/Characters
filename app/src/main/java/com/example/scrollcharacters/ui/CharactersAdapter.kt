package com.example.scrollcharacters.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.scrollcharacters.databinding.CharacterCardBinding
import com.example.scrollcharacters.models.Character
import com.squareup.picasso.Picasso

class CharactersAdapter :
    ListAdapter<Character, CharactersAdapter.ViewHolder>(DiffCallback) {


    class ViewHolder(private var binding: CharacterCardBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Character) {
            binding.textViewName.text = "Name: " + item.name

            val imageView = binding.imageViewAvatar
            Picasso.get().load(item.image).into(imageView)
            binding.gender.text = "Gender: " + item.gender
            binding.status.text = "Status: " + item.status
            binding.executePendingBindings()


            binding.cardId.setOnClickListener {
                it.findNavController().navigate(
                    CharactersFragmentDirections.actionNavHostFragmentToDetailsFragment(item.id)
                )
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
        val item = getItem(position)
        holder.bind(item)
    }

    companion object DiffCallback : DiffUtil.ItemCallback<Character>() {

        override fun areItemsTheSame(oldItem: Character, newItem: Character): Boolean {
            return oldItem.name == newItem.name
        }

        override fun areContentsTheSame(oldItem: Character, newItem: Character): Boolean {
            return oldItem.id == newItem.id && oldItem.gender == newItem.gender
        }

    }

}