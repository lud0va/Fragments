package com.example.fragments.ui.fragments.fragmentsRoot

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

import com.example.fragments.databinding.FragmentSeptimoBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SeptimoFragment : Fragment(){
    private var _binding: FragmentSeptimoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentSeptimoBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            irOctavo.setOnClickListener {
                val action = SeptimoFragmentDirections.actionSeptimoFragmentToOctavoFragment()
                findNavController().navigate(action)
            }
            irNoveno.setOnClickListener{
                val action = SeptimoFragmentDirections.actionSeptimoFragmentToNovenoFragment()
                findNavController().navigate(action)

            }

        }
    }
}