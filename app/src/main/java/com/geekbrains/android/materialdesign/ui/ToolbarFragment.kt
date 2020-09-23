package com.geekbrains.android.materialdesign.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import androidx.fragment.app.Fragment
import com.geekbrains.android.materialdesign.R
import kotlinx.android.synthetic.main.fragment_toolbar.*

class ToolbarFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_toolbar, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        activity?.setTitle(R.string.toolbar_title)

        onShowButtonClick()
        onHideButtonClick()
    }

    private fun onShowButtonClick() {
        show_button.setOnClickListener {
            showProgressbars()
        }
    }

    private fun onHideButtonClick() {
        hide_button.setOnClickListener {
            hideProgressbars()
        }
    }

    private fun showProgressbars() {
        progressbar.visibility = ProgressBar.VISIBLE
        progressbar_horizontal.visibility = ProgressBar.VISIBLE
    }

    private fun hideProgressbars() {
        progressbar.visibility = ProgressBar.INVISIBLE
        progressbar_horizontal.visibility = ProgressBar.INVISIBLE
    }
}