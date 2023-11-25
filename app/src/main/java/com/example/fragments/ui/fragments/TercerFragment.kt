package com.example.fragments.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.fragments.databinding.FragmentTercerBinding



class TercerFragment : Fragment() {


    private var _binding: FragmentTercerBinding? = null
    private val binding get() = _binding!!



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        _binding = FragmentTercerBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {

            irPrimero.setOnClickListener {
                val action = TercerFragmentDirections.actionTercerFragmentToPrimerFragment()
                findNavController().navigate(action)
            }
            irSegundo.setOnClickListener{
                val action = TercerFragmentDirections.actionPrimerFragmentToSegundoFragment()
                findNavController().navigate(action)
            }

        }
    }


}