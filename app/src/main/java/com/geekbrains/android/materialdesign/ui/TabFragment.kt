package com.geekbrains.android.materialdesign.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TableLayout
import androidx.fragment.app.Fragment
import com.geekbrains.android.materialdesign.R
import com.geekbrains.android.materialdesign.adapter.TabAdapter
import com.geekbrains.android.materialdesign.ui.tabFragments.Fragment1
import com.geekbrains.android.materialdesign.ui.tabFragments.Fragment2
import com.geekbrains.android.materialdesign.ui.tabFragments.Fragment3
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.fragment_tab.*

class TabFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_tab, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        activity?.setTitle(R.string.tab_title)

        val fragment1 = Fragment1().newInstance(null)
        val fragment2 = Fragment2().newInstance(null)
        val fragment3 = Fragment3().newInstance(null)

        val tabAdapter = TabAdapter(activity?.supportFragmentManager)
        tabAdapter.addFragment(fragment1, "tab1")
        tabAdapter.addFragment(fragment2, "tab2")
        tabAdapter.addFragment(fragment3, "tab3")

        view_pager.apply {
            adapter = tabAdapter
        }

        tabs_layout.apply {
            setupWithViewPager(view_pager)
        }
    }
}