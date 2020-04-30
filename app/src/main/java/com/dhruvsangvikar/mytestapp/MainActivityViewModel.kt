package com.dhruvsangvikar.mytestapp

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MediatorLiveData

class MainActivityViewModel(application: Application) : AndroidViewModel(application) {
    data class ViewState(
        val count: Int
    )

    lateinit var counter: Counter

    val viewState = MediatorLiveData<ViewState>()

    init {
        viewState.value = ViewState(0)

        viewState.addSource(counter.counterValueStream) { value ->
            viewState.value = viewState.value?.copy(count = value)
        }
        setInitialCountValue()
    }

    private fun setInitialCountValue() {
        counter.setInitialValue(0)
    }

    fun incrementCounter() {
        counter.increment()
    }
}