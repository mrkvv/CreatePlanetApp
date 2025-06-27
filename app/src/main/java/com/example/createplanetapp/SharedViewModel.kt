package com.example.createplanetapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel: ViewModel() {
    private val _catalogLastClickedButton = MutableLiveData<Int>(1)
    val catalogLastClickedButton: LiveData<Int> = _catalogLastClickedButton

    private val _catalogLastSpinnerOption1 = MutableLiveData(0)
    private val _catalogLastSpinnerOption2 = MutableLiveData(0)
    private val _catalogLastSpinnerOption3 = MutableLiveData(0)
    private val _catalogLastSpinnerOption4 = MutableLiveData(0)

    val catalogLastSpinnerOption1: LiveData<Int> = _catalogLastSpinnerOption1
    val catalogLastSpinnerOption2: LiveData<Int> = _catalogLastSpinnerOption2
    val catalogLastSpinnerOption3: LiveData<Int> = _catalogLastSpinnerOption3
    val catalogLastSpinnerOption4: LiveData<Int> = _catalogLastSpinnerOption4

    fun updateCatalogLastClickedButton(buttonId: Int) {
        _catalogLastClickedButton.value = buttonId
    }

    fun updateCatalogLastSpinnerOption(spinnerId: Int, position: Int) {
        when (spinnerId) {
            1 -> _catalogLastSpinnerOption1.value = position
            2 -> _catalogLastSpinnerOption2.value = position
            3 -> _catalogLastSpinnerOption3.value = position
            4 -> _catalogLastSpinnerOption4.value = position
        }
    }
}