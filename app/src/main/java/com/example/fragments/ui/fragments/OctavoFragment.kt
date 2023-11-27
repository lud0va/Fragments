package com.example.fragments.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.fragments.databinding.FragmentNovenoBinding
import com.example.fragments.databinding.FragmentOctavoBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class OctavoFragment : Fragment(){
    private var _binding: FragmentOctavoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentOctavoBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            irNoveno.setOnClickListener {
                val action = OctavoFragmentDirections.actionOctavoFragmentToNovenoFragment()
                findNavController().navigate(action)
            }
            irSeptimo.setOnClickListener{
                val action = OctavoFragmentDirections.actionOctavoFragmentToSeptimoFragment()
                findNavController().navigate(action)

            }

        }
    }
}