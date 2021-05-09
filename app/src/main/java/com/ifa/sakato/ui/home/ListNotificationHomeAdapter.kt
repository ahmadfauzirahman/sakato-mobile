package com.ifa.sakato.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ifa.sakato.R
import com.ifa.sakato.databinding.ItemRowNotificationHomeBinding

class ListNotificationHomeAdapter: RecyclerView.Adapter<ListNotificationHomeAdapter.ViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListNotificationHomeAdapter.ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_row_notification_home, parent, false))
    }

    override fun onBindViewHolder(holder: ListNotificationHomeAdapter.ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int = 3

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = ItemRowNotificationHomeBinding.bind(itemView)
    }
}