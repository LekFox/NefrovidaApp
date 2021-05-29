package mx.tec.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val button1 = findViewById<Button>(R.id.btn_encuesta)
        val button2 = findViewById<Button>(R.id.btn_tips)
        val button3 = findViewById<Button>(R.id.btn_rutina)

        button1.setOnClickListener{

            val intent = Intent(this@MainActivity, HomeActivity:: class.java)
            startActivity(intent)
            finish()
        }

        button2.setOnClickListener{

            val intent = Intent(this@MainActivity, Tips:: class.java)
            startActivity(intent)
            finish()
        }
        button3.setOnClickListener{

            val intent = Intent(this@MainActivity, Rutina:: class.java)
            startActivity(intent)
            finish()
        }
    }
}