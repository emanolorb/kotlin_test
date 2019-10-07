package com.example.kotlintest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var tvCiudad:TextView? = null
    var tvGrados:TextView? = null
    var tvEstatus:TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvCiudad = findViewById(R.id.tvCity)
        tvEstatus = findViewById(R.id.tvClima)
        tvGrados = findViewById(R.id.tvGrados)
        val ciudad = intent.getStringExtra("com.example.kotlintest.ciudades.CIUDAD")

        Toast.makeText(this, ciudad, Toast.LENGTH_SHORT).show()
        val ciudaCdmx = Ciudad("Ciudad de Mexico", 23, "Despejado")
        val ciudaBerlin = Ciudad("Ciudad de Berlin", 12, "Nublado")
        if (ciudad == "Ciudad de mexico") {
            tvCiudad?.text = ciudaCdmx.nombre
            tvGrados?.text = ciudaCdmx.grados.toString() + "~"
            tvEstatus?.text = ciudaCdmx.estatus

        }else if(ciudad == "Ciudad de Berlin"){
            tvCiudad?.text = ciudaBerlin.nombre
            tvGrados?.text = ciudaBerlin.grados.toString() + "~"
            tvEstatus?.text = ciudaBerlin.estatus
        }else{
            Toast.makeText(this,  "$ciudad, No se de que hablas?", Toast.LENGTH_SHORT).show()
        }

    }
}
