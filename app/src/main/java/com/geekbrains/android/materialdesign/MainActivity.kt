package com.geekbrains.android.materialdesign

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.geekbrains.android.materialdesign.ui.*
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*
import kotlinx.android.synthetic.main.fragment_toolbar.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    private val fragmentManager: FragmentManager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)

        initNavigationDrawer()

        changeFragment(EditTextFragment())
    }

    private fun initNavigationDrawer() {
        val toogle = ActionBarDrawerToggle(
            this, drawer_layout, toolbar,
            R.string.navigation_drawer_open, R.string.navigation_drawer_close
        )

        drawer_layout.addDrawerListener(toogle)
        toogle.syncState()

        nav_view.setNavigationItemSelectedListener(this)
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        val itemId: Int = item.itemId

        when (itemId) {
            R.id.nav_editText -> {
                changeFragment(EditTextFragment())
            }

            R.id.nav_snackbar -> {
                changeFragment(SnackbarFragment())
            }

            R.id.nav_bottom_sheet -> {
                changeFragment(BottomSheetFragment())
            }

            R.id.nav_buttons -> {
                changeFragment(ButtonsFragment())
            }

            R.id.nav_toolbar -> {
                changeFragment(ToolbarFragment())
            }

            R.id.nav_collapsing -> {
                changeFragment(CollapsingFragment())
            }

            R.id.nav_fab -> {
                changeFragment(FabFragment())
            }

            else -> onNavigationItemSelected(item)
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }

    private fun changeFragment(fragment: Fragment) {
        val fragmentTransaction = fragmentManager.beginTransaction()

        fragmentTransaction.replace(R.id.nav_host_fragment, fragment)
        fragmentTransaction.commit()
    }
}