package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigation.databinding.FragmentInsideBinding


class InsideFragment : Fragment() {
    private lateinit var binding: FragmentInsideBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentInsideBinding.inflate(layoutInflater)

        val argumentoRecibido = arguments?.getString("argpasado")
        binding.textView2.setText(argumentoRecibido)
        return binding.root
    }

}