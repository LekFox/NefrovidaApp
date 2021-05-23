package mx.tec.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TipsMentales : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tips_mentales)

        val button1 = findViewById<Button>(R.id.btn_home4)
        val button2 = findViewById<Button>(R.id.btn_habitos4)

        button1.setOnClickListener{

            val intent = Intent(this@TipsMentales, MainActivity:: class.java)
            startActivity(intent)
            finish()
        }

        button2.setOnClickListener{

            val intent = Intent(this@TipsMentales, Tips:: class.java)
            startActivity(intent)
            finish()
        }

    }
}