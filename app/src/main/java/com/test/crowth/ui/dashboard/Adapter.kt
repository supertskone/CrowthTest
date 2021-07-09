package com.test.crowth.ui.dashboard


import android.view.LayoutInflater
import android.view.View

import android.view.ViewGroup

import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView
import com.test.crowth.R


class Adapter(private val list: List<Crowth>) : RecyclerView.Adapter<Adapter.MyView>() {

    inner class MyView(view: View) : RecyclerView.ViewHolder(view) {
        var textViewPosition: TextView
        var compensationViewPosition: TextView

        init {
            textViewPosition = view.findViewById(R.id.item_position)
            compensationViewPosition = view.findViewById(R.id.item_salary)
        }
    }

    // Override onCreateViewHolder which deals
    // with the inflation of the card layout
    // as an item for the RecyclerView.
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyView {

        // Inflate item.xml using LayoutInflator
        val itemView: View = LayoutInflater
            .from(parent.context)
            .inflate(
                R.layout.item,
                parent,
                false
            )

        // return itemView
        return MyView(itemView)
    }

    // Override onBindViewHolder which deals
    // with the setting of different data
    // and methods related to clicks on
    // particular items of the RecyclerView.
    override fun onBindViewHolder(
        holder: MyView,
        position: Int
    ) {
        holder.textViewPosition.text = list[position].position.toString()
        holder.compensationViewPosition.text = list[position].compensation.toString()
    }

    override fun getItemCount(): Int {
        return list.size
    }
}