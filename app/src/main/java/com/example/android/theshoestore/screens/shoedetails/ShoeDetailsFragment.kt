package com.example.android.theshoestore.screens.shoedetails

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import com.example.android.theshoestore.R
import com.example.android.theshoestore.databinding.FragmentShoeDetailsBinding
import com.example.android.theshoestore.databinding.FragmentShoeListBinding
import com.example.android.theshoestore.models.ShoeListViewModel


class ShoeDetailsFragment : Fragment() {


    private val viewModel: ShoeListViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentShoeDetailsBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_shoe_details, container, false
        )

        binding.shoeDetails= this
        binding.lifecycleOwner = this

        return binding.root

    }
}