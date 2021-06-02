package br.com.recuperaodeid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val enterButton = findViewById<Button>(R.id.bt_enter)
        enterButton.setOnClickListener {
            Toast.makeText(this, "Aqui tem um Toast", Toast.LENGTH_SHORT).show()
        }
    }

}