package com.geekbrains.android.materialdesign.adapter

import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.geekbrains.android.materialdesign.R
import kotlinx.android.synthetic.main.list_item.view.*

class RVAdapter(private val imageList: List<Drawable?>) :
    RecyclerView.Adapter<RVAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.setImage(imageList.get(position))
    }

    override fun getItemCount(): Int = imageList.size


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun setImage(image: Drawable?) {
            with(itemView) {
                image_view.setImageDrawable(image);
            }
        }
    }
}
