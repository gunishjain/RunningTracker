package com.example.runningapp.ui.viewmodels

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.runningapp.repositories.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class StatisticsViewModel @Inject constructor(
    val handle: SavedStateHandle,
    private val mainRepository: MainRepository
) :ViewModel(){


}