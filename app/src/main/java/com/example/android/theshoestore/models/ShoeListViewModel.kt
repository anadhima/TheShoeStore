package com.example.android.theshoestore.models

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel



class ShoeListViewModel : ViewModel() {

    private val _shoes = MutableLiveData<MutableList<Shoe>>(mutableListOf())
    val shoes: LiveData<MutableList<Shoe>>
        get() = _shoes



    fun saveDetail(detail: Shoe?) {
        detail?.let {
            _shoes.value?.add(it)
        }
    }
}
