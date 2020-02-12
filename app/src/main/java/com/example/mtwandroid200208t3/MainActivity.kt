package com.example.mtwandroid200208t3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val TAG = "com.example.mtwandroid200208t3.contactos.contacto"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnRosa.setOnClickListener(View.OnClickListener {
            val intent = Intent( this, ContactoActivity::class.java)
            intent.putExtra(TAG, "Rosa")
            startActivity(intent)
        })
        btnJulian.setOnClickListener(View.OnClickListener {
            val intent = Intent( this, ContactoActivity::class.java)
            intent.putExtra(TAG, "Julian")
            startActivity(intent)
        })
        btnSusy.setOnClickListener(View.OnClickListener {
            val intent = Intent( this, ContactoActivity::class.java)
            intent.putExtra(TAG, "Susy")
            startActivity(intent)
        })
    }
}
