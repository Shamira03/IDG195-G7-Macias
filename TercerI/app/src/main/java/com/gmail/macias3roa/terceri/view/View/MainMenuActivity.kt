package com.gmail.macias3roa.terceri.view.View

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main_menu.*
import mx.cetys.arambula.angel.micampus.R.layout.activity_main_menu
import mx.cetys.arambula.angel.micampus.model.Perfil

class MainMenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main_menu)
        val perfil = intent.getParcelableExtra<Perfil>("perfil")
        txt_logged_user.text = perfil.carrera + " " + perfil.apellido + " " + perfil.nombre
    }
}
