package com.geekbrains.android.materialdesign.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.geekbrains.android.materialdesign.R

class ThemeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setTheme(R.style.MyTheme)
        setContentView(R.layout.activity_theme)
        setTitle(R.string.theme_title)
    }
}