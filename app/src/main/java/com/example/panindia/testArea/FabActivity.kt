package com.example.panindia.testArea

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.panindia.R
import com.example.panindia.databinding.ActivityFabBinding

class FabActivity : AppCompatActivity() {
    lateinit var bindingFabActivity : ActivityFabBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingFabActivity =DataBindingUtil.setContentView(this,R.layout.activity_fab)

        inti()
    }
    fun inti(){
          bindingFabActivity.fbOneWay.setOnClickListener(View.OnClickListener {
              Toast.makeText(applicationContext ,"Fb Clicked", Toast.LENGTH_SHORT).show()
          })
    }
}