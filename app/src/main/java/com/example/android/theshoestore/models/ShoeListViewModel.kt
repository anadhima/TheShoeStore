package com.example.android.theshoestore.models

import androidx.databinding.InverseMethod
import androidx.databinding.PropertyChangeRegistry
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel



class ShoeListViewModel : ViewModel() {

    private val _shoes = MutableLiveData<MutableList<Shoe>>(mutableListOf())
         val shoes: LiveData<MutableList<Shoe>>
              get() = _shoes

    private val _newShoeAdded = MutableLiveData<Boolean>()
    val newShoeAdded: LiveData<Boolean>
        get() = _newShoeAdded




    init {
        _shoes.postValue(mutableListOf())
    }

    fun saveDetail(shoe: Shoe?) {
        shoe?.let {
            _shoes.value?.add(it)
            _newShoeAdded.value= true
        }
    }
    fun newShoeAddedFinish(){
        _newShoeAdded.value = false
    }


    object Converter {
        @InverseMethod("stringToDouble")
        @JvmStatic
        fun doubleToString(value: Double?): String {
            return value?.toString() ?: ""
        }
        @JvmStatic
        fun stringToDouble(value: String): Double? {
            return if (value.isNotEmpty()) {
                value.toDouble()
            } else {
                0.0
            }
        }
    }

}
