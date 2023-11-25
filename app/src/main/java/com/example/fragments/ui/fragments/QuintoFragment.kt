package com.example.fragments.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.fragments.databinding.FragmentOctavoBinding
import com.example.fragments.databinding.FragmentQuintoBinding
import com.example.fragments.ui.fragments.fragmentsRoot.CuartoFragmentDirections
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class QuintoFragment : Fragment(){
    private var _binding: FragmentQuintoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentQuintoBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            irCuarto.setOnClickListener {
                val action = QuintoFragmentDirections.actionQuintoFragmentToCuartoFragment()
                findNavController().navigate(action)
            }
            irSexto.setOnClickListener{
                val action = QuintoFragmentDirections.actionQuintoFragmentToSextoFragment()
                findNavController().navigate(action)

            }

        }
    }
}