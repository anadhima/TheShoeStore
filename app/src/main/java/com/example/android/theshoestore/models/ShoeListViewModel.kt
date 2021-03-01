package com.example.android.theshoestore.models

import androidx.databinding.PropertyChangeRegistry
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel



class ShoeListViewModel : ViewModel() {

    private val _shoe = MutableLiveData<Shoe>()
    val shoe: LiveData<Shoe>
        get() = _shoe

    private val _shoes = MutableLiveData<MutableList<Shoe>>(mutableListOf())
         val shoes: LiveData<MutableList<Shoe>>
              get() = _shoes

    init {
        _shoes.postValue(mutableListOf())
    }

    fun saveDetail(shoe: Shoe?) {
        shoe?.let {
            _shoes.value?.add(it)
        }
    }
}
