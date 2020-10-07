package com.geekbrains.android.materialdesign

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_toolbar.*
import timber.log.Timber

class ToolbarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_toolbar)

        setSupportActionBar(toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return handleMenuItem(item)
    }

    private fun handleMenuItem(item: MenuItem): Boolean {
        var itemId = item.itemId

        return when (itemId) {
            android.R.id.home -> {
                Timber.d("onBackPressed")
                onBackPressed()
                return true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }
}