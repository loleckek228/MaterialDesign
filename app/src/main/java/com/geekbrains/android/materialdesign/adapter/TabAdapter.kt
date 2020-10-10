package com.geekbrains.android.materialdesign.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class TabAdapter(fm: FragmentManager?) : FragmentPagerAdapter(fm!!) {
    private val fragments = mutableListOf<Fragment>()
    private val tabTitles = mutableListOf<String>()

    fun addFragment(fragment: Fragment, tabTitle: String) {
        fragments.add(fragment)
        tabTitles.add(tabTitle)
    }

    override fun getCount(): Int = fragments.size

    override fun getItem(position: Int): Fragment = fragments.get(position)

    override fun getPageTitle(position: Int): CharSequence? = tabTitles.get(position)
}