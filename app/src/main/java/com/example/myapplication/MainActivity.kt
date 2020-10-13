package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun salir(view : View){
        System.exit(-1)
    }
    fun acceder(view : View){
        var editTextUsr = findViewById<EditText>(R.id.txtNombre)
        var editTextPwd = findViewById<EditText>(R.id.txtApellido)

        var user: String = editTextUsr.text.toString()
        var apellido: String = editTextPwd.text.toString()


        var miIntent = Intent(this, Calculadora::class.java)
        miIntent.putExtra("usuario", user +" "+ apellido)
        startActivity(miIntent)
        finish()
    }
}