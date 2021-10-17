package com.example.mimi.user

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class UserProfileViewModel(
    savedStateHandle: SavedStateHandle
) : ViewModel() {
    val userId : String = savedStateHandle["uid"] ?:
    throw IllegalArgumentException("missing user id")
    val user : User = TODO()
}

// UserProfileFragment
private val viewModel: UserProfileViewModel by viewModels(
    factoryProducer = { SavedStateVMFactory(this) }
    ...
)