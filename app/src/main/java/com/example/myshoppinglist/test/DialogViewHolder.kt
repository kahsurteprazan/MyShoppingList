package com.example.myshoppinglist.test

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myshoppinglist.R

class DialogViewHolder(view:View) : RecyclerView.ViewHolder(view) {
    val tvText = view.findViewById<TextView>(R.id.tv_text)
}