package com.app.inote

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Vairiable de type nullable
        var name : String? = "Bob"

        val age = 4
        val height = 1.60F

        println("""Raw string trim :
        >Nom : $name
        >Age : $age
        """.trimMargin(">"))



    }
}