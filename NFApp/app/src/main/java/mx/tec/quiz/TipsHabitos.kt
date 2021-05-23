package mx.tec.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TipsHabitos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tips_habitos)

        val button1 = findViewById<Button>(R.id.btn_home1)
        val button2 = findViewById<Button>(R.id.btn_habitos1)

        button1.setOnClickListener{

            val intent = Intent(this@TipsHabitos, MainActivity:: class.java)
            startActivity(intent)
            finish()
        }

        button2.setOnClickListener{

            val intent = Intent(this@TipsHabitos, Tips:: class.java)
            startActivity(intent)
            finish()
        }

    }
}