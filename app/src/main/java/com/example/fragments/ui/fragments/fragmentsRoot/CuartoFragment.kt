package com.example.fragments.ui.fragments.fragmentsRoot

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.fragments.databinding.FragmentCuartoBinding
import com.example.fragments.databinding.FragmentPrimerBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CuartoFragment :Fragment(){
    private var _binding: FragmentCuartoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentCuartoBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            irQuinto.setOnClickListener {
                val action = CuartoFragmentDirections.actionCuartoFragmentToQuintoFragment()
                findNavController().navigate(action)
            }
            irSexto.setOnClickListener{
                val action = CuartoFragmentDirections.actionCuartoragmentToSextoFragment()
                findNavController().navigate(action)

            }

        }
    }
}