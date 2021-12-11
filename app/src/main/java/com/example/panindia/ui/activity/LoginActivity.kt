package com.example.panindia.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.panindia.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun fnLogin(view: View) {
        Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()

    }
}