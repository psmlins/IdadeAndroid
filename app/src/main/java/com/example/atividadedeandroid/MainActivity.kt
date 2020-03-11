package com.example.atividadedeandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onSubmit(view:View){
        val anoAtual = Calendar.getInstance().get(Calendar.YEAR)
        idadeTxt.text = idadeTxt.text + (anoAtual - anoInput.text.toString().toInt())
    }
}
