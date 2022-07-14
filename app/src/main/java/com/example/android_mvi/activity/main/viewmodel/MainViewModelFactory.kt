package com.example.android_mvi.activity.main.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.android_mvi.activity.main.helper.MainHelper
import com.example.android_mvi.repository.PostRepository

class MainViewModelFactory(private val mainHelper: MainHelper) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(PostRepository(mainHelper)) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }

}
