package com.geekbrains.android.materialdesign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater

        inflater.inflate(R.menu.main_menu, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return handleMenuItem(item)
    }

    private fun handleMenuItem(item: MenuItem): Boolean {
        val itemId: Int = item.itemId

        return when (itemId) {
            R.id.editTextActivity -> {
                val intent = Intent(this@MainActivity, EditTextActivity::class.java)
                startActivity(intent)
                true
            }

            R.id.snackbarActivity -> {
                val intent = Intent(this@MainActivity, SnackbarActivity::class.java)
                startActivity(intent)
                true
            }

            R.id.bottomSheetActivity -> {
                val intent = Intent(this@MainActivity, BottomSheetActivity::class.java)
                startActivity(intent)
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }
}