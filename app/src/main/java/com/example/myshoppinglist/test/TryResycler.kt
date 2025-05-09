package com.example.myshoppinglist.test

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myshoppinglist.R

class TryResycler : AppCompatActivity() {
    private lateinit var listAdapter: DialogAdapter

    val list = listOf(
        Dialog("Привет как дела?", true),
        Dialog("Всё хорошо?", false),
        Dialog("Отлично!", true)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_try_resycler)
        setupRecyclerView()
        listAdapter.submitList(list)
    }

    private fun setupRecyclerView() {
        val rvList = findViewById<RecyclerView>(R.id.rv_dialog)
        with(rvList) {
            // Добавляем LayoutManager - это ОБЯЗАТЕЛЬНО!
            layoutManager = LinearLayoutManager(this@TryResycler)
            listAdapter = DialogAdapter()
            adapter = listAdapter
            // Опционально: фиксированный размер, если все элементы одинаковой высоты
        }
    }
}