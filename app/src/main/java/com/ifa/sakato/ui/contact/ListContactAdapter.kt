package com.ifa.sakato.ui.contact

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.ifa.sakato.R
import com.ifa.sakato.databinding.ItemRowContactBinding
import com.ifa.sakato.model.Contact

class ListContactAdapter(private val listContact: ArrayList<Contact>) : RecyclerView.Adapter<ListContactAdapter.ViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListContactAdapter.ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_row_contact, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindDetail(listContact[position])
    }

    override fun getItemCount(): Int = listContact.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = ItemRowContactBinding.bind(itemView)

        fun bindDetail(contactDetail: Contact){
            with(itemView){
                binding.tvTitleContact.text = contactDetail.titleContact
                binding.tvInfoContact.text = contactDetail.infoContact
                Glide.with(itemView.context).load(contactDetail.icon).apply(RequestOptions()).into(binding.imageViewContacts)
            }
        }
    }
}