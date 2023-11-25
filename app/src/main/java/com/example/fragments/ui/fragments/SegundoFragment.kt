package com.example.fragments.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.fragments.databinding.FragmentSegundoBinding

import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SegundoFragment :Fragment(){

    private var _binding : FragmentSegundoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding =  FragmentSegundoBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding){

            irTercero.setOnClickListener {
                val action = SegundoFragmentDirections.actionPrimerFragmentToTercerFragment()
                findNavController().navigate(action)

            }
            primerFragment.setOnClickListener {
                val action = SegundoFragmentDirections.actionSegundoFragmentToPrimerFragment()
                findNavController().navigate(action)

            }
        }


    }
}