package com.example.android.theshoestore.screens.shoelist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.example.android.theshoestore.R
import com.example.android.theshoestore.databinding.FragmentShoeListBinding
import com.example.android.theshoestore.models.Shoe
import com.example.android.theshoestore.models.ShoeListViewModel
import timber.log.Timber


class ShoeListFragment : Fragment() {


    private val viewModel: ShoeListViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentShoeListBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_shoe_list, container, false)


        binding.shoeList = viewModel
        binding.lifecycleOwner = this
        binding.shoeListF= this

        viewModel.shoe.observe(viewLifecycleOwner, Observer { shoesList ->


        })



        return binding.root

    }

    //Navigate to DetailsFragment
    fun navToShoeDetails() {
        findNavController().navigate(R.id.action_shoeListFragment_to_shoeDetailsFragment)
        Timber.i("navToShoeDetails")
    }
}