package mx.tec.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TipsAlimenticios : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tips_alimenticios)

        val button1 = findViewById<Button>(R.id.btn_home3)
        val button2 = findViewById<Button>(R.id.btn_habitos3)

        button1.setOnClickListener{

            val intent = Intent(this@TipsAlimenticios, MainActivity:: class.java)
            startActivity(intent)
            finish()
        }

        button2.setOnClickListener{

            val intent = Intent(this@TipsAlimenticios, Tips:: class.java)
            startActivity(intent)
            finish()
        }
    }
}