package com.app.inote

import com.app.inote.common.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Vairiable de type nullable
        var name : String? = "Bob"

        // Un array
        val tableau = arrayOf(7, 15, 7)
        // Récupérer valeur d'un array
        tableau.get(0)

        val age = 4
        val height = 1.60F

        println("""Raw string trim :
        >Nom : $name
        >Age : $age
        """.trimMargin(">"))

        describePerson()

    }
}