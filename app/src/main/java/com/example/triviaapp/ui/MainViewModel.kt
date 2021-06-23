package com.example.triviaapp.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.triviaapp.utils.Resource
import com.example.testlocationapp.base.BaseViewModel
import com.example.triviaapp.DatabaseRepositoryImpl
import com.example.triviaapp.room.User
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val databaseRepository: DatabaseRepositoryImpl
) : BaseViewModel() {
    private val currentObserver by lazy { MutableLiveData<Resource<User>>() }

    private var newUser = true
    private var user: User? = null

    fun isNewUser(): Boolean = newUser
    fun getUser() = user

    fun getCurrentUserObserver(): LiveData<Resource<User>> = currentObserver

    fun saveUser(user: User) {
        launch {
            databaseRepository.saveUser(user)
        }
        updateCommonUser()
    }

    fun updateUser(user: User) {
        newUser = false
        launch {
            databaseRepository.updateUser(user)
        }
        updateCommonUser()
    }

    fun getLatestUser() {
        launch {
            val response = databaseRepository.getCurrentUser()
            if (response.isSuccess()) {
                currentObserver.value = response
            }
        }
        updateCommonUser()
    }

    private fun updateCommonUser() {
        launch {
            val response = databaseRepository.getCurrentUser()
            if (response.isSuccess()) {
                response.data?.let { this@MainViewModel.user = it }
            }
        }
    }

    fun doesPlayerExist(name: String): Boolean {
        var exist = false
        launch {
            exist = databaseRepository.doesPlayerExist(name)
        }
        newUser = !exist
        return exist
    }
}