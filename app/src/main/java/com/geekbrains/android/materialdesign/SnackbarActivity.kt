package com.geekbrains.android.materialdesign

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_snackbar.*

class SnackbarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snackbar)

        buttonSnackbarActivator.setOnClickListener {
            Snackbar.make(it, R.string.snackbar, Snackbar.LENGTH_LONG)
                .setAction(getString(R.string.show_message)) {
                    Toast.makeText(it.context, "This is message", Toast.LENGTH_LONG)
                        .show();
                }
                .setBackgroundTint(resources.getColor(R.color.colorPrimaryDark))
                .show()
        }
    }
}