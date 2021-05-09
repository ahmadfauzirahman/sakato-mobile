package com.ifa.sakato.ui.about

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ifa.sakato.databinding.FragmentAboutBinding

class AboutFragment : Fragment() {

    private var _binding: FragmentAboutBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAboutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupUI()
    }

    @SuppressLint("SetTextI18n")
    private fun setupUI() {
        binding.tvAboutInfo.text = "Welcome to CIRCLE NODE, your number one " +
                "source for all things SAKATO. We're dedicated " +
                "to giving you the best of Sakator, with a focus " +
                "on Development Aplikasi, App Easy For User.\n\n" +
                "Founded in 2017 by AHMAD FAUZI RAHMAN, " +
                "ST.MTA, CIRCLE NODE has come a long way " +
                "from its beginnings in Pekanbaru. When " +
                "Ahmad Fauzi Rahman first started out, his " +
                "passion for eco-friendly cleaning products " +
                "drove them to quit day job so that CIRCLE " +
                "NODE can offer you competitive differentiator " +
                "\"the world's most advanced toothbrush\"" +
                ". We now serve customers all over place - town, " +
                "country, the world, and are thrilled that we're " +
                "able to turn our passion into My own website.\n\n" +
                "I hope you enjoy My products as much as I " +
                "enjoy offering them to you. If you have any " +
                "questions or comments, please don't hesitate to " +
                "contact Me.\n\n" +
                "Sincerely,\n" +
                "AHMAD FAUZI RAHMAN, ST, MTA"
    }
}