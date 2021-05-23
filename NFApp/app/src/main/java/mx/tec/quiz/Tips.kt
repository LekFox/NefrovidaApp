package mx.tec.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Tips : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tips)

        val button1 = findViewById<Button>(R.id.btn_hab)
        val button2 = findViewById<Button>(R.id.btn_fis)
        val button3 = findViewById<Button>(R.id.btn_nut)
        val button4 = findViewById<Button>(R.id.btn_men)
        val button5 = findViewById<Button>(R.id.btn_home01)

        button1.setOnClickListener{

            val intent = Intent(this@Tips, TipsHabitos:: class.java)
            startActivity(intent)
            finish()
        }

        button2.setOnClickListener{

            val intent = Intent(this@Tips, TipsEjercicio:: class.java)
            startActivity(intent)
            finish()
        }
        button3.setOnClickListener{

            val intent = Intent(this@Tips, TipsAlimenticios:: class.java)
            startActivity(intent)
            finish()
        }
        button4.setOnClickListener{

            val intent = Intent(this@Tips, TipsMentales:: class.java)
            startActivity(intent)
            finish()
        }

        button5.setOnClickListener{

            val intent = Intent(this@Tips, MainActivity:: class.java)
            startActivity(intent)
            finish()
        }

    }
}