package com.example.myshoppinglist.test

import androidx.recyclerview.widget.DiffUtil

class DialogDiffCallback: DiffUtil.ItemCallback<Dialog>() {
    override fun areItemsTheSame(oldItem: Dialog, newItem: Dialog): Boolean {
        return oldItem.text == newItem.text
    }

    override fun areContentsTheSame(oldItem: Dialog, newItem: Dialog): Boolean {
        return oldItem == newItem
    }
}