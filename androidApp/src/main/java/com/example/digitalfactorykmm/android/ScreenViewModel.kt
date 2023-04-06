package com.example.digitalfactorykmm.android

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.digitalfactorykmm.domain.UseCase
import kotlinx.coroutines.launch

class ScreenViewModel(private val useCase: UseCase = UseCase()) : ViewModel() {

    private val _liveDate = MutableLiveData<String>("Loading ..")
    val liveDate: LiveData<String> = _liveDate

    fun getData() {
        viewModelScope.launch {
            val result = useCase()
            _liveDate.postValue(result)
        }
    }
}