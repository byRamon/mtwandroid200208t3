package com.example.mtwandroid200208t3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_contacto.*
import android.content.Intent
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.net.Uri
import android.view.View


class ContactoActivity : AppCompatActivity() {

    val TAG = "com.example.mtwandroid200208t3.contactos.contacto"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacto)

        val id:String = intent.getStringExtra(TAG)

        print(id)
        var contacto = Contacto("","","","",
            "","","")

        if(id == "Rosa"){
            contacto = Contacto("Rosa Pérez","Secretaria","SHCP","Ocampo No. 234",
                "Celaya, Gto.","rosa@gmail.com","4611238907")
        }
        else if(id == "Julian"){
            contacto = Contacto("Julián Arreguín","Programador","SHCP","allende No. 234",
            "Salamanca, Gto.","julian@gmail.com","4621535455")
        }
        else if(id == "Susy"){
            contacto = Contacto("Susy Ramírez","Diseñadora","SHCP","Guerrero No. 234",
                "Irapuato, Gto.","sussy@gmail.com","4615855157")
        }
        txtNombreContacto.text = contacto.nombre
        txtOcupacion.text = "Ocupación: " + contacto.ocupacion
        txtTrabaja.text = "Trabaja en: " + contacto.trabajo
        txtDomicilio.text = "Domicilio: " + contacto.domicilio
        txtCiudad.text = "Ciudad: " + contacto.ciudad
        txtCorreo.text = "Correo: " + contacto.correo
        txtTelefono.text = "Tel: " + contacto.telefono

        btnLlamada.setOnClickListener( View.OnClickListener {
            val url = Uri.parse("tel:" + contacto.telefono)
            val intent = Intent(Intent.ACTION_DIAL, url)
            if(intent.resolveActivity(packageManager) != null)
                startActivity(intent)
        })

        btnEmail.setOnClickListener( View.OnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:")
                putExtra(Intent.EXTRA_EMAIL, contacto.correo)
                putExtra(Intent.EXTRA_SUBJECT, "Email de prueba")
                putExtra(Intent.EXTRA_TEXT, "texto de prueba")
            }
            if(intent.resolveActivity(packageManager) != null)
                startActivity(intent)
        })

    }
}
