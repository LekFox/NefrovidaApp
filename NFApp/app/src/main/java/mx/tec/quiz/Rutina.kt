package mx.tec.quiz

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import mx.tec.quiz.R.layout.activity_rutina


class Rutina : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_rutina)



        val button1 = findViewById<Button>(R.id.btn_habRut)
        val button5 = findViewById<Button>(R.id.btn_home01Rut)

        button1.setOnClickListener{

            val intent = Intent(this@Rutina, NumPasos:: class.java)
            startActivity(intent)
            finish()
        }

        button5.setOnClickListener{

            val intent = Intent(this@Rutina, MainActivity:: class.java)
            startActivity(intent)
            finish()
        }

    }




}