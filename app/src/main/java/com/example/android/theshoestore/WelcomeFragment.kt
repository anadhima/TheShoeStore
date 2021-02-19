package com.example.android.theshoestore

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.android.theshoestore.databinding.FragmentWelcomeBinding

class WelcomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val binding: FragmentWelcomeBinding= DataBindingUtil.inflate(
           inflater, R.layout.fragment_welcome, container,false)
        binding.welcome=this
        binding.lifecycleOwner=this

    return binding.root
}

    fun navToInstructionFragment(){
        findNavController().navigate(R.id.action_welcomeFragment_to_instructionFragment)

    }
}