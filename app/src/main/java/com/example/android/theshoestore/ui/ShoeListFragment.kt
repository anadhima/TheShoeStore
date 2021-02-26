package com.example.android.theshoestore.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.android.theshoestore.R
import com.example.android.theshoestore.databinding.FragmentShoeListBinding
import com.example.android.theshoestore.models.Shoe
import com.example.android.theshoestore.models.ShoeListViewModel
import timber.log.Timber


class ShoeListFragment : Fragment() {

    private lateinit var shoe: Shoe
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


        // val inflatedView = View.inflate(context, R.layout.fragment_shoe_list, list_liner_layout)


        viewModel.shoes.observe(viewLifecycleOwner, { shoesList ->
            for (shoes in shoesList) {
                val listItemBinding: FragmentShoeListBinding = DataBindingUtil.inflate(
                    inflater,
                    R.layout.fragment_shoe_list,
                    container,
                    false
                )
              
                //Add to  LinearLayout
                binding.listLinerLayout.addView(listItemBinding.root)
            }

        })

        //Navigate to DetailsFragment from floatingActionButton
        binding.floatingActionButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_shoeListFragment_to_shoeDetailsFragment)
        )


        return binding.root

    }

    /*//Navigate to DetailsFragment
    fun navToShoeDetails() {
        findNavController().navigate(R.id.action_shoeListFragment_to_shoeDetailsFragment)
        Timber.i("navToShoeDetails")
    }*/
}