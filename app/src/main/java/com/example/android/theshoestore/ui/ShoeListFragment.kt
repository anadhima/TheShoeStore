package com.example.android.theshoestore.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.Navigation
import com.example.android.theshoestore.R
import com.example.android.theshoestore.databinding.FragmentShoeListBinding
import com.example.android.theshoestore.databinding.ShoeItemBinding
import com.example.android.theshoestore.models.ShoeListViewModel


class ShoeListFragment : Fragment() {

    private val viewModel: ShoeListViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentShoeListBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_shoe_list, container, false)


        binding.listViewModel = viewModel
        binding.lifecycleOwner = this



        viewModel.shoes.observe(viewLifecycleOwner, Observer { shoeList ->
            shoeList.forEach { shoe ->
                val shoeItemBinding = DataBindingUtil.inflate<ShoeItemBinding>(
                    inflater,
                    R.layout.shoe_item,
                    container,
                    false
                )
                shoeItemBinding.newShoe = shoe
                //Add to  LinearLayout
                binding.listLinerLayout.addView(shoeItemBinding.root)
            }

        })

        //Navigate to DetailsFragment from floatingActionButton
        binding.floatingActionButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_shoeListFragment_to_shoeDetailsFragment)
        )


        return binding.root

    }

}