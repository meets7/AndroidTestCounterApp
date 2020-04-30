package com.dhruvsangvikar.mytestapp

import androidx.lifecycle.MediatorLiveData

class Counter {

    val counterValueStream = MediatorLiveData<Int>()

    fun increment(){
        // your definition
    }

    fun setInitialValue(value: Int) {
        counterValueStream.value = value
    }
}
