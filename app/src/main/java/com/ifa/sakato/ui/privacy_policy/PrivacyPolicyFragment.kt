package com.ifa.sakato.ui.privacy_policy

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ifa.sakato.databinding.FragmentPrivacyPolicyBinding

class PrivacyPolicyFragment: Fragment() {
    private var _binding: FragmentPrivacyPolicyBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPrivacyPolicyBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupUI()
    }

    @SuppressLint("SetTextI18n")
    private fun setupUI() {
        binding.tvPrivacyPolicyInfo.text = "" +
                "CIRCLE NODE operates the " +
                "https://sikaping.deadline.id/ website, which " +
                "provides the SERVICE.\n\n" +
                "This page is used to inform website visitors " +
                "regarding our policies with the collection, use, " +
                "and disclosure of Personal Information if " +
                "anyone decided to use our Service, the CIRCLE " +
                "NODE website.\n\n" +
                "If you choose to use our Service, then you agree " +
                "to the collection and use of information in " +
                "relation with this policy. The Personal " +
                "Information that we collect are used for " +
                "providing and improving the Service. We will " +
                "not use or share your information with anyone " +
                "except as described in this Privacy Policy. Our " +
                "Privacy Policy was created with the help of the " +
                "Privacy Policy Template and the Privacy Policy " +
                "Generator. " +
                "The terms used in this Privacy Policy have the " +
                "same meanings as in our Terms and Conditions, " +
                "which is accessible at sakato-kppn010.com/, " +
                "unless otherwise defined in this Privacy Policy."
    }
}