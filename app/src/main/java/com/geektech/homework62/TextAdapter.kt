package com.geektech.homework62

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.geektech.homework62.databinding.ItemTextBinding

class TextAdapter(private val list: ArrayList<TextModel>) :
    RecyclerView.Adapter<TextAdapter.MessageViewHolder>() {

    inner class MessageViewHolder(private val binding: ItemTextBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(tModel: TextModel) {
            binding.itemText.text = tModel.text
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
        return MessageViewHolder(
            ItemTextBinding.inflate(
                LayoutInflater.from(parent.context),
                parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

}