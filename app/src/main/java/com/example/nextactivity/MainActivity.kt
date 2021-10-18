package com.example.nextactivity

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun sendMessage(view: View) {

        val n1 = findViewById<EditText>(R.id.nota1)
        val n2 = findViewById<EditText>(R.id.nota2)
        val n3 = findViewById<EditText>(R.id.nota3)
        val total = findViewById<TextView>(R.id.result)
        val callButton = findViewById<Button>(R.id.buttom2)
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, callButton)

        }


        callButton.setOnClickListener {
            val valnota1 = n1.text.toString().toFloat()
            val valnota2 = n2.text.toString().toFloat()
            val valnota3 = n3.text.toString().toFloat()

            var result =((valnota1+valnota2+valnota3)/3)
            total.setText(result.toString())
                if (result>=6){
                    total.setText(("Sua nota é: $result. Você passou!"))
                    total.setTextColor(Color.BLACK)

                }
                else{
                    total.setText("Infelizmente você não passou. Sua nota foi: $result")
                    total.setTextColor(Color.RED)
                }



        }

        startActivity(intent)


    }

    private fun putExtra(extraMessage: String, callButton: Button?) {

    }


}


