package com.rodolfo.saludaap

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.rodolfo.saludaap.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:  ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)




        binding.btnChangeActivity.setOnClickListener { checkValue() }
    }
    fun checkValue(){
        if(binding.etName.text.toString().isNotEmpty()){
            val intent = Intent(this,ResultActivity::class.java)
            //intent.putExtra("INTENT_NAME")
            intent.putExtra("INTENT_NAME", binding.etName.text.toString())
            startActivity(intent)
        }else{
       Toast.makeText(this,"El nombre del usuario no puede ser vacío",Toast.LENGTH_SHORT).show()
          }
       }
    }


