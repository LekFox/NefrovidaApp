package mx.tec.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TipsEjercicio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tips_ejercicio)

        val button1 = findViewById<Button>(R.id.btn_home2)
        val button2 = findViewById<Button>(R.id.btn_habitos2)

        button1.setOnClickListener{

            val intent = Intent(this@TipsEjercicio, MainActivity:: class.java)
            startActivity(intent)
            finish()
        }

        button2.setOnClickListener{

            val intent = Intent(this@TipsEjercicio, Tips:: class.java)
            startActivity(intent)
            finish()
        }
    }
}