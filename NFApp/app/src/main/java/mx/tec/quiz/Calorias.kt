package mx.tec.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import androidx.appcompat.app.AlertDialog
import org.w3c.dom.Text


class Calorias : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cal)

        val button1 = findViewById<Button>(R.id.btn_home_cal)

        val checkbox1 = findViewById<CheckBox>(R.id.checkbox_1)

        val builder = AlertDialog.Builder(this)
        builder.setTitle("Felicidades!!!")
        builder.setMessage("Bebiste tus 2 litros de agua al día!")





        button1.setOnClickListener{

            val intent = Intent(this@Calorias, MainActivity:: class.java)
            startActivity(intent)
            finish()
        }



    }

    fun onCheckboxClicked(view: View) {

        val builder = AlertDialog.Builder(this)
        builder.setTitle("Felicidades!!")
        builder.setMessage("Tomar 2 litros de agua al día ayuda a tener riñones sanos!!")

        if(view is CheckBox){
            val checked: Boolean = view.isChecked
            if(checked){
                builder.show()

            }
        }



    }

    fun onCheckboxClicked2(view: View) {

        val builder = AlertDialog.Builder(this)
        builder.setTitle("Felicidades!!")
        builder.setMessage("Hacer ejercicio regularmente ayuda a disminuir enfermedades renales!!")

        if(view is CheckBox){
            val checked: Boolean = view.isChecked
            if(checked){
                builder.show()

            }
        }



    }

    fun onCheckboxClicked3(view: View) {

        val builder = AlertDialog.Builder(this)
        builder.setTitle("Felicidades!!")
        builder.setMessage("Dormir de 7 a 8 horas diarias es vital para llevar una vida sana!!")

        if(view is CheckBox){
            val checked: Boolean = view.isChecked
            if(checked){
                builder.show()

            }
        }



    }

    fun onCheckboxClicked4(view: View) {

        val builder = AlertDialog.Builder(this)
        builder.setTitle("Felicidades!!")
        builder.setMessage("Una dieta balanceada es esencial para mantener la salud de tus riñones!!")

        if(view is CheckBox){
            val checked: Boolean = view.isChecked
            if(checked){
                builder.show()

            }
        }



    }


}

