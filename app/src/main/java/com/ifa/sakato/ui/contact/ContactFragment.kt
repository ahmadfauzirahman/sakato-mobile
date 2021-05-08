package com.ifa.sakato.ui.contact

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.ifa.sakato.databinding.FragmentContactBinding
import com.ifa.sakato.utils.DataContactDummy

class ContactFragment : Fragment() {

    private var _binding: FragmentContactBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentContactBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val listContact = DataContactDummy.getContact()
        val adapter = ListContactAdapter(listContact = listContact)

        //Recycle View
        binding.rvContact.layoutManager = LinearLayoutManager(context)
        binding.rvContact.setHasFixedSize(true)
        binding.rvContact.adapter = adapter
    }

}