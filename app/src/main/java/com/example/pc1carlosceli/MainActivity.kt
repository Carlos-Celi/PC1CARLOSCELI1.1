package com.example.pc1carlosceli

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalcular: Button = findViewById(R.id.BtnCalcular)
        btnCalcular.setOnClickListener{realizarCalculo()}



        }
        private fun realizarCalculo(){

            val txtEP:EditText = findViewById(R.id.TxtEP)
            val txtEF: EditText = findViewById(R.id.TxtEF)
            val txtPEP:EditText = findViewById(R.id.TxtPEP)

            val notaEP:Double=txtPEP.text.toString().toDouble()
            val notaEf:Double=txtEF.text.toString().toDouble()
            val notaPEP:Double=txtPEP.text.toString().toDouble()

            var prom:Double=(notaEP*0.2+notaEf*0.2+notaPEP*0.6)

            if(prom>=10.5){
                val intent = Intent(this, ResultActivity::class.java)

    }else{

            }


    }
}