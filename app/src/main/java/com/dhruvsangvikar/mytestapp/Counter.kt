package com.dhruvsangvikar.mytestapp

import androidx.lifecycle.MutableLiveData

class Counter {

    val counterValueStream = MutableLiveData<Int>()

    fun increment(){
        // your code
    }

    fun setInitialValue(value: Int) {
        counterValueStream.postValue(value)
    }
}
