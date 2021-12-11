package com.example.panindia.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.panindia.R

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

    }

    fun FnDOB(view: View) {
        Toast.makeText(this, "DOB Detail", Toast.LENGTH_SHORT).show()
    }
}