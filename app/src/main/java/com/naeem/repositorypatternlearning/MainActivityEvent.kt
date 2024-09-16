package com.naeem.repositorypatternlearning

sealed class MainActivityEvent {
    object LoadButtonClicked : MainActivityEvent()
    object SaveButtonClicked : MainActivityEvent()
}
