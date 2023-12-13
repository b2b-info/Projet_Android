package ca.qc.bdeb.a17.cours_02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextClock
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bouton = findViewById<Button>(R.id.monBouton)

        //Testafafafa


        bouton.text ="toto"

        bouton.setOnClickListener{ cliquerBouton()}
    }

    private fun cliquerBouton() {
        findViewById<TextView>(R.id.textView).text = "toto"
    }
}