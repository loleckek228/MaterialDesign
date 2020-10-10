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
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        initNavigationDrawer()

        replaceFragment(EditTextFragment())
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
                replaceFragment(EditTextFragment())
            }

            R.id.nav_snackbar -> {
                replaceFragment(SnackbarFragment())
            }

            R.id.nav_bottom_sheet -> {
                replaceFragment(BottomSheetFragment())
            }

            R.id.nav_buttons -> {
                replaceFragment(ButtonsFragment())
            }

            R.id.nav_toolbar -> {
                replaceFragment(ToolbarFragment())
            }

            R.id.nav_collapsing -> {
                replaceFragment(CollapsingFragment())
            }

            R.id.nav_fab -> {
                replaceFragment(FabFragment())
            }

            R.id.nav_recycler_view -> {
                replaceFragment(RecyclerViewFragment())
            }

            R.id.nav_tab -> {
                replaceFragment(TabFragment())
            }

            R.id.nav_bottom_navigation_view -> {
                val intent = Intent(this@MainActivity, BottomNavigationActivity::class.java)
                startActivity(intent)
            }

            else -> onNavigationItemSelected(item)
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.nav_host_fragment, fragment)
            .commit()
    }
}