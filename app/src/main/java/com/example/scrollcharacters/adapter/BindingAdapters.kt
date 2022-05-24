package com.example.scrollcharacters.adapter

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.scrollcharacters.models.Character
import com.example.scrollcharacters.ui.CharactersAdapter

@BindingAdapter("listData")
fun bindRecyclerView(recyclerView: RecyclerView, data: List<Character>?) {
    val adapter = recyclerView.adapter as CharactersAdapter
    adapter.submitList(data)

}

