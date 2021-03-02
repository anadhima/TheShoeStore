package com.example.android.theshoestore.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.android.theshoestore.R
import com.example.android.theshoestore.databinding.FragmentShoeDetailsBinding
import com.example.android.theshoestore.models.Shoe
import com.example.android.theshoestore.models.ShoeListViewModel


class ShoeDetailsFragment : Fragment() {

    private lateinit var binding:FragmentShoeDetailsBinding

    private val viewModel: ShoeListViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentShoeDetailsBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_shoe_details, container, false
        )



        binding.details= viewModel
        binding.lifecycleOwner = this
        binding.newShoe = Shoe("",0.0,"","")

        //Navigate to ListFragment from cancel button
        binding.cancel.setOnClickListener (
            Navigation.createNavigateOnClickListener(R.id.action_shoeDetailsFragment_to_shoeListFragment)
        )

        //Navigate to ListFragment from save button
       viewModel.newShoeAdded.observe(viewLifecycleOwner, Observer { shoeAdded ->
            if (shoeAdded){
                findNavController().navigate(R.id.action_shoeDetailsFragment_to_shoeListFragment)
                viewModel.newShoeAddedFinish()
            }
        })

        return binding.root

    }


}