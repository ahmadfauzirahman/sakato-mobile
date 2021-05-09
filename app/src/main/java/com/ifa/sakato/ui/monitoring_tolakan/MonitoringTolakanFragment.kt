package com.ifa.sakato.ui.monitoring_tolakan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.StringRes
import com.ifa.sakato.R
import com.ifa.sakato.databinding.FragmentMonitoringTolakanBinding

class MonitoringTolakanFragment : Fragment() {

    private var _binding: FragmentMonitoringTolakanBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMonitoringTolakanBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val sectionPagerAdapter = MonitoringTolakanSectionPageAdapter(context, childFragmentManager)
        val viewPager = binding.vpMonitoringTolakan
        viewPager.adapter = sectionPagerAdapter

        val tabLayout = binding.tabLayoutMonitoringTolakan
        tabLayout.setupWithViewPager(viewPager)
    }

}