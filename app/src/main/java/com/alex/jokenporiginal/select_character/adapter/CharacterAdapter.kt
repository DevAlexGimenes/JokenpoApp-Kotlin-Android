package com.alex.jokenporiginal.select_character.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.alex.jokenporiginal.databinding.ViewModelChooseBinding
import com.alex.jokenporiginal.select_character.model.DCharacter

class CharacterAdapter(val characters: MutableList<DCharacter>, val onItemClickListener: OnItemClickListener): RecyclerView.Adapter<CharacterAdapter.CharacterViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder{
        val binding = ViewModelChooseBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CharacterViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CharacterAdapter.CharacterViewHolder, position: Int) {
        with(holder){
            with(characters[position]){
                binding.characterImage.setImageResource(character)
                binding.txtNameCharacter.text = nameCharacter
                holder.itemView.setOnClickListener {
                    onItemClickListener.onItemClicked(this)
                }
            }
        }
    }

    override fun getItemCount() = characters.size

    inner class CharacterViewHolder(val binding: ViewModelChooseBinding): RecyclerView.ViewHolder(binding.root)

    interface OnItemClickListener {
        fun onItemClicked(character: DCharacter)
    }

}