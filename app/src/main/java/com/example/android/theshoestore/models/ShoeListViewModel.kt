package com.example.android.theshoestore.models

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class ShoeListViewModel :ViewModel() {
    private val _shoe = MutableLiveData<MutableList<Shoe>>()
            val shoe: LiveData<MutableList<Shoe>>
                    get() = _shoe

init {
    val dummyShoe= Shoe("Trainers",4.5,"Nike","Athletic shoes")
    val dummyShoe2= Shoe("Boots",5.0,"Zara","Leather block heel ")
    _shoe.value?.add(dummyShoe)
    _shoe.value?.add(dummyShoe2)
}

    fun addDetails(shoe: Shoe?) {
        when {
            shoe != null -> {
                _shoe.value?.add(shoe)
            }
            else -> {
                error("Required")
            }
        }
    }



}