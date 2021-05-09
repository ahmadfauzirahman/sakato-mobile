package com.ifa.sakato.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.ifa.sakato.R
import com.ifa.sakato.databinding.FragmentHomeBinding
import com.ifa.sakato.ui.contact.ListContactAdapter
import com.ifa.sakato.utils.DataContactDummy

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = ListNotificationHomeAdapter()

        //Recycle View
        binding.rvNotificationHome.layoutManager = LinearLayoutManager(context)
        binding.rvNotificationHome.setHasFixedSize(true)
        binding.rvNotificationHome.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}