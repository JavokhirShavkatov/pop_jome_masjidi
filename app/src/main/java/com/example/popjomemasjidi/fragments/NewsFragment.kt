package com.example.popjomemasjidi.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.popjomemasjidi.databinding.FragmentFeaturepadBinding

class NewsFragment : Fragment() {

    private var _binding: FragmentFeaturepadBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFeaturepadBinding.inflate(inflater,container,false)

        return binding.root
    }


}