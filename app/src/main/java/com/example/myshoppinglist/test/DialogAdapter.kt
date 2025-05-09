package com.example.myshoppinglist.test

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.myshoppinglist.R

class DialogAdapter : ListAdapter<Dialog, DialogViewHolder>(DialogDiffCallback()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DialogViewHolder {

        val layout = when (viewType) {
            VIEW_TYPE_LEFT -> R.layout.item_dialog_text_left
            VIEW_TYPE_PRAVO -> R.layout.item_dialog_text_pravo
            else -> throw RuntimeException("Unkwon type $viewType")
        }

        val view = LayoutInflater.from(parent.context).inflate(layout, parent, false)

        return DialogViewHolder(view)
    }

    override fun onBindViewHolder(holder: DialogViewHolder, position: Int) {
        val Dialog = getItem(position)
        holder.tvText.text = Dialog.text
    }

    override fun getItemViewType(position: Int): Int {
        val dialog = getItem(position)
        return if (dialog.position) {
            VIEW_TYPE_LEFT
        } else VIEW_TYPE_PRAVO
    }

    companion object {
        const val VIEW_TYPE_LEFT = 1
        const val VIEW_TYPE_PRAVO = 0
    }
}