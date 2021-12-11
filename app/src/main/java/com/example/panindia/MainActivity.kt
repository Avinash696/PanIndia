package com.example.panindia

import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.panindia.ui.activity.LoginActivity
import com.example.panindia.ui.activity.RegisterActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {
    val TAG = "##"
    lateinit var dialog: Dialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    fun init() {
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.frgHostMain)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val menuInflater = getMenuInflater()
        menuInflater.inflate(R.menu.entry_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menuLogin -> startActivity(Intent(this, LoginActivity::class.java))
            R.id.menuRegister -> registerDialog()
        }
        return super.onOptionsItemSelected(item)
    }

    fun registerDialog() {
        dialog = Dialog(this)
//        val layoutInflater =getLayoutInflater().inflate(R.layout.dialog_register,null,false)
//        dialog.setContentView(layoutInflater)
        dialog.setContentView(R.layout.dialog_register)
        dialog.show()
    }

    fun toRegister(view: View) {
        startActivity(Intent(this, RegisterActivity::class.java))
        Log.d(TAG, "toRegister: " + dialog)
        val intent = Intent()
//        intent.putExtra("")
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.dialogAdmin -> Toast.makeText(this, "Admin", Toast.LENGTH_LONG).show()
            R.id.dialogDistrubuter -> Log.d(TAG, "onClick: dialogDistrubuter")
            R.id.dialogRetailer -> Log.d(TAG, "onClick: dialogRetailer")
            R.id.dialogSuperDistrubuter -> Log.d(TAG, "onClick: dialogSuperDistrubuter")
        }
    }

    fun FnFlight(view: View) {
        val fragment = Fragment(R.layout.fragment_flight)
        switchFragment(fragment)
    }

    fun FnBus(view: View) {
        val fragment = Fragment(R.layout.fragment_bus)
        switchFragment(fragment)
    }

    fun FnHotel(view: View) {
        val fragment = Fragment(R.layout.fragment_hotel)
        switchFragment(fragment)
    }

    fun switchFragment( fragment: Fragment) {
        val ft = supportFragmentManager.beginTransaction()
        ft.add(R.id.frgHostMain, fragment)
        ft.commit()
    }
}