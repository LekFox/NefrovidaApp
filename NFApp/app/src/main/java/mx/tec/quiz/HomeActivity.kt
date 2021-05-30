package mx.tec.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val button = findViewById<Button>(R.id.btn_habitos)
        val button2 = findViewById<Button>(R.id.btn_fisica)
        val button3 = findViewById<Button>(R.id.btn_nutricion)
        val button4 = findViewById<Button>(R.id.btn_mental)

        button.setOnClickListener{

            val intent = Intent(this@HomeActivity, QuizQuestionsActivity:: class.java)
            startActivity(intent)
            finish()
        }

        button2.setOnClickListener{

            val intent = Intent(this@HomeActivity, QuizQuestionsActivity2:: class.java)
            startActivity(intent)
            finish()
        }

        button3.setOnClickListener{

            val intent = Intent(this@HomeActivity, QuizQuestionsActivity3:: class.java)
            startActivity(intent)
            finish()
        }

        button4.setOnClickListener{

            val intent = Intent(this@HomeActivity, QuizQuestionsActivity4:: class.java)
            startActivity(intent)
            finish()
        }
    }
}