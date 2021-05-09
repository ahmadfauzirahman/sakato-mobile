package com.ifa.sakato.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.ifa.sakato.R
import com.ifa.sakato.databinding.FragmentHomeBinding
import com.synnapps.carouselview.ImageClickListener
import com.synnapps.carouselview.ImageListener





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

        setupCarousel()
    }

    private fun setupCarousel() {
        val listImages = intArrayOf(
            R.drawable.sakoto1,
            R.drawable.sakoto2
        )

        val listImageTitle = arrayOf(
            "Sakoto1", "Sakoto2"
        )

        val imageListener =
            ImageListener { position, imageView -> imageView.setImageResource(listImages[position]) }
        val carouselView = binding.carouselView
        carouselView.pageCount = listImages.size
        carouselView.setImageListener(imageListener)
        carouselView.setImageClickListener { position: Int ->
            Toast.makeText(context, listImageTitle[position], Toast.LENGTH_SHORT).show()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}