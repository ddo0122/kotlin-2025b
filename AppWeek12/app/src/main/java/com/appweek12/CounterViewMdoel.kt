package com.appweek12

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class CounterViewMdoel: ViewModel() {
    private val _count = MutableStateFlow(0)
    val count: StateFlow<Int> = _count.asStateFlow()

    fun increment() {
        _count.value = (_count.value ?: 0) + 1
    }
    fun decrement() {
        _count.value = (_count.value ?: 0) - 1
    }
    fun reset() {
        _count.value = 10
    }
    fun incrementBy10() {
        _count.value = (_count.value ?: 0) + 10
    }
}