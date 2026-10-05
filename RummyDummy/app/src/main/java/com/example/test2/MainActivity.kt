package com.example.test2


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import com.example.test2.CreateAGameActivity
import com.example.test2.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val createGameButton: Button = findViewById(R.id.createGameButton)
        val gameHistoryButton: Button = findViewById(R.id.gameHistoryButton)
        val gameRulesButton: Button = findViewById(R.id.gameRulesButton)
        val exitButton: Button = findViewById(R.id.exitButton)



        createGameButton.setOnClickListener {
            val intent = Intent(this, CreateAGameActivity::class.java)
            startActivity(intent)
        }

        gameHistoryButton.setOnClickListener {
            val intent = Intent(this, GameHistory::class.java)
            startActivity(intent)
        }

        gameRulesButton.setOnClickListener {
            val intent = Intent(this, GameRules::class.java)
            startActivity(intent)
        }

        exitButton.setOnClickListener {
            finishAffinity()
        }
    }
}