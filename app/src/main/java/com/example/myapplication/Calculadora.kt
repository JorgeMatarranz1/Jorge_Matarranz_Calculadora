package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_calculadora.*

class Calculadora : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)
        var user:String? = intent.getStringExtra("usuario").toString()
        var textviewhola = findViewById<TextView>(R.id.textViewHola)
        textviewhola.text = "Hola " + user

    }
    var op : String = ""
    var numeroOld : String = ""

    fun onClick(view: View?) {
        var btnClick : String = editText.text.toString()
        var btnSeleccionado : Button = view as Button
        when(btnSeleccionado.id){
            n1.id -> {btnClick += "1"}
            n2.id -> {btnClick += "2"}
            n3.id -> {btnClick += "3"}
            n4.id -> {btnClick += "4"}
            n5.id -> {btnClick += "5"}
            n6.id -> {btnClick += "6"}
            n7.id -> {btnClick += "7"}
            n8.id -> {btnClick += "8"}
            n9.id -> {btnClick += "9"}
            n0.id -> {btnClick += "0"}
        }
        editText.setText(btnClick)
    }
    fun operar(view: View?){
        numeroOld = editText.text.toString()
        editText.setText("")
        var btnSelect : Button = view as Button
        when(btnSelect.id){
            sumar.id -> {op = "sumar"}
            restar.id -> {op = "restar"}
            multiplicar.id -> {op = "multiplicar"}
            dividir.id -> {op = "dividir"}
        }
    }
    fun equalBtn(view:View?){
        var numero = editText.text.toString()
        var resultado : Int = 0
        when(op){
            "sumar" -> {resultado = numeroOld.toInt() + numero.toInt()}
            "restar" -> {resultado = numeroOld.toInt() + numero.toInt()}
            "multiplicar" -> {resultado = numeroOld.toInt() + numero.toInt()}
            "dividir" -> {resultado = numeroOld.toInt() + numero.toInt()}
        }
        var message : String= numeroOld + " " + op + " " + numero
        var miToast = Toast.makeText(applicationContext, message, Toast.LENGTH_LONG)
        miToast.show()
        editText.setText(resultado.toString())
    }

    fun clean(view: View) {
        numeroOld=""
        op=""
        editText.setText("")
    }

}