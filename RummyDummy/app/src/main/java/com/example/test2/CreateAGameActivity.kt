package com.example.test2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class CreateAGameActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: TextAdapter
    private val textList = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_agame)

        val backButton: Button = findViewById(R.id.backButton)
        val startGameButton: Button = findViewById(R.id.startGameButton)
        val editText: EditText = findViewById(R.id.editText)
        val addButton: Button = findViewById(R.id.addButton) // New button to add text

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = TextAdapter(textList)
        recyclerView.adapter = adapter

        backButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        startGameButton.setOnClickListener {
            // Implement functionality for starting the game here
            val intent = Intent(this, MainActivity::class.java) // Replace NextActivity with the actual activity
            startActivity(intent)
        }

        addButton.setOnClickListener {
            val text = editText.text.toString()
            if (text.isNotEmpty()) {
                textList.add(text)
                adapter.notifyItemInserted(textList.size - 1)
                editText.text.clear()
            }
        }
    }
}
