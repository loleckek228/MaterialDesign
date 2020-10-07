package com.geekbrains.android.materialdesign.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.geekbrains.android.materialdesign.R
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_snackbar.*

class SnackbarFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_snackbar, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initSnackbar()

        activity?.setTitle(R.string.snackbar_title)
    }

    private fun initSnackbar() {
        buttonSnackbarActivator.setOnClickListener {
            Snackbar.make(it, R.string.snackbar_title, Snackbar.LENGTH_LONG)
                .setAction(getString(R.string.show_message)) {
                    Toast.makeText(it.context, "This is message", Toast.LENGTH_LONG)
                        .show();
                }
                .setBackgroundTint(resources.getColor(R.color.colorPrimaryDark))
                .show()
        }
    }
}