package com.dzakdzaks.simpletimelineview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_timeline.view.*

class TimelineAdapter(private val data: List<Timeline>, private val context: Context) :
    RecyclerView.Adapter<TimelineAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_timeline, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val status = data[position]

        if (position == 0) holder.viewLineTop.visibility = View.GONE
        if (position == itemCount - 1) holder.viewLineBottom.visibility = View.GONE

        if (status.currentStatus) {
            holder.dot.background = ContextCompat.getDrawable(context, R.drawable.circle_active)
            holder.time.setTextColor(ContextCompat.getColor(context, R.color.colorPrimary))
            holder.title.setTextColor(ContextCompat.getColor(context, R.color.colorPrimary))
        }

        holder.time.text = status.time
        holder.title.text = status.title

    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val dot: View = view.dot
        val viewLineTop: View = view.viewLineTop
        val viewLineBottom: View = view.viewLineBottom
        val time: TextView = view.time
        val title: TextView = view.title
    }
}