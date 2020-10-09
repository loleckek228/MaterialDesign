package com.geekbrains.android.materialdesign.ui

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.geekbrains.android.materialdesign.R
import com.geekbrains.android.materialdesign.adapter.RVAdapter
import kotlinx.android.synthetic.main.fragment_recycler_view.*

class RecyclerViewFragment : Fragment() {
    private lateinit var adapterRV: RVAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_recycler_view, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        activity?.setTitle(R.string.recycler_view_title)

        initRecyclerView()
    }

    private fun initRecyclerView() {
        val imageList = getDrawableList()

        adapterRV = RVAdapter(imageList)

        recycler_view.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = adapterRV
        }
    }

    private fun getDrawableList(): List<Drawable?> {
        var image: Drawable? = null
        context?.let {
            image = it.getDrawable(R.drawable.ic_launcher_foreground)
        }

        val imageList = listOf(image, image, image, image, image, image, image, image)

        return imageList
    }
}