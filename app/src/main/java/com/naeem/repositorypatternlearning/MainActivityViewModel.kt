package com.naeem.repositorypatternlearning

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

class MainActivityViewModel(repository: Repository):ViewModel() {
    private val _uiState = MutableStateFlow<>
    fun handleEvent(event: MainActivityEvent) {
        when(event) {
            MainActivityEvent.LoadButtonClicked -> TODO()
            MainActivityEvent.SaveButtonClicked -> TODO()
        }
    }

}