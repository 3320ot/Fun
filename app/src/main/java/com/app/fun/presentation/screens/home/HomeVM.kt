package com.app.`fun`.presentation.screens.home

import androidx.lifecycle.ViewModel
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.ktx.storage
import dagger.hilt.android.lifecycle.HiltViewModel
import java.io.File
import javax.inject.Inject

@HiltViewModel
class HomeVM @Inject constructor() : ViewModel() {
    private val storage = Firebase.storage.reference

    fun s(){
        storage.getFile(File(""))
    }
}