package com.example.mtwandroid200208t3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_contacto.*

class ContactoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacto)

        txtNombreContacto.text = "Rosa Pérez"
        txtOcupacion.text = "Ocupación: Secretaria"
        txtTrabaja.text = "Trabaja en: SHCP"
        txtDomicilio.text = "Domicilio: Ocampo No. 234"
        txtCiudad.text = "Ciudad: Celaya, Gto."
        txtCorreo.text = "Correo: rosa@gmail.com"
        txtTelefono.text = "Tel: 4611238907"
    }
}
