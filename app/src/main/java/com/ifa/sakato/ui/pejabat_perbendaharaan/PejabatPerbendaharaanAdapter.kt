package com.ifa.sakato.ui.pejabat_perbendaharaan

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ifa.sakato.R
import com.ifa.sakato.databinding.ItemRowPejabatPerbendaharaanBinding

class PejabatPerbendaharaanAdapter: RecyclerView.Adapter<PejabatPerbendaharaanAdapter.ViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PejabatPerbendaharaanAdapter.ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_row_pejabat_perbendaharaan, parent, false))
    }

    override fun onBindViewHolder(holder: PejabatPerbendaharaanAdapter.ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int = 3

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = ItemRowPejabatPerbendaharaanBinding.bind(itemView)
    }
}