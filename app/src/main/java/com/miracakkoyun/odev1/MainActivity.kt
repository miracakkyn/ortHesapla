package com.miracakkoyun.odev1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var sonucText: TextView;
    lateinit var finalNot: EditText
    lateinit var vizeNot: EditText
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        sonucText=findViewById(R.id.textView)
        vizeNot=findViewById(R.id.editTextText)
        finalNot=findViewById(R.id.editTextText2)
        button=findViewById(R.id.button)

    }
    fun hesapla(view:View){
        if(vizeNot.text.toString().isNotEmpty() && finalNot.text.toString().isNotEmpty()){
            var sayi1=vizeNot.text.toString().toDouble()
            var sayi2=finalNot.text.toString().toDouble()
            if(sayi1>=0 && sayi1<=100 && sayi2>=0 && sayi2<=100){
                sayi1=sayi1*0.4
                sayi2=sayi2*0.6
                var ortalama=sayi1+sayi2
                sonucText.setText(ortalama.toString())
            }else{
                Toast.makeText(this,"LÜTFEN 0 İLE 100 ARASINDA BİR NOT GİRİNİZ",Toast.LENGTH_LONG).show()

            }

        }else{
            Toast.makeText(this,"LÜTFEN SAYI GİRİNİZ",Toast.LENGTH_LONG).show()
        }

    }
}