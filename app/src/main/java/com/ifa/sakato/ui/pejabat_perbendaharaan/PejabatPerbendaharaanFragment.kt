package com.ifa.sakato.ui.pejabat_perbendaharaan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.ifa.sakato.R
import com.ifa.sakato.databinding.FragmentPejabatPerbendaharaanBinding

class PejabatPerbendaharaanFragment : Fragment() {

    private var _binding: FragmentPejabatPerbendaharaanBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPejabatPerbendaharaanBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupUI()
    }

    private fun setupUI() {
        val adapter = PejabatPerbendaharaanAdapter()

        //Recycle View
        binding.rvPejabatPerbendaharaan.layoutManager = LinearLayoutManager(context)
        binding.rvPejabatPerbendaharaan.adapter = adapter
        binding.rvPejabatPerbendaharaan.setHasFixedSize(true)
    }

}