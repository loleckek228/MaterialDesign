package com.geekbrains.android.materialdesign.ui.tabFragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.geekbrains.android.materialdesign.R

class Fragment2 : Fragment() {
    fun newInstance(bundle: Bundle?): Fragment2 {
        val fragment = Fragment2()

        val args = Bundle()
        args.putBundle("gettedArgs", bundle)

        fragment.arguments = args
        return fragment
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment2, container, false)
    }
}