package com.example.android.theshoestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.android.theshoestore.R
import com.example.android.theshoestore.databinding.FragmentInstructionBinding
import com.example.android.theshoestore.databinding.FragmentLoginBinding


class InstructionFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentInstructionBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_instruction, container, false)
        binding.instruction= this
        binding.lifecycleOwner=this


        return binding.root

    }

}