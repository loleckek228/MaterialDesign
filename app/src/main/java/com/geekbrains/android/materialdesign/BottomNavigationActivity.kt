package com.geekbrains.android.materialdesign

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.geekbrains.android.materialdesign.ui.tabFragments.Fragment1
import com.geekbrains.android.materialdesign.ui.tabFragments.Fragment2
import com.geekbrains.android.materialdesign.ui.tabFragments.Fragment3
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_bottom_navigation.*
import kotlinx.android.synthetic.main.activity_main.*

class BottomNavigationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_bottom_navigation)
        replaceFragment(Fragment1())
        bottom_navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }

    private val mOnNavigationItemSelectedListener =
        BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.page_fragment1 -> {
                    replaceFragment(Fragment1())
                    true
                }
                R.id.page_fragment2 -> {
                    replaceFragment(Fragment2())
                    true
                }
                R.id.page_fragment3 -> {
                    replaceFragment(Fragment3())
                    true
                }
                else -> false
            }
        }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frame_layout, fragment)
            .commit()
    }
}