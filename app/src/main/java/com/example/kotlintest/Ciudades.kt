package com.example.kotlintest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class Ciudades : AppCompatActivity() {

    val TAG = "com.example.kotlintest.ciudades.CIUDAD"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ciudades)
        val bMexico = findViewById<Button>(R.id.btnMexico)
        val bBerlin = findViewById<Button>(R.id.btnBerlin)

        bMexico.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra(TAG, "Ciudad de mexico")
            startActivity(intent)
        })
        bBerlin.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra(TAG, "Ciudad de Berlin")
            startActivity(intent)
        })
    }
}
