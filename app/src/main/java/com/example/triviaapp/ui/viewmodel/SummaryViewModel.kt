package com.example.triviaapp.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.testlocationapp.base.BaseViewModel
import com.example.triviaapp.repo.DatabaseRepositoryImpl
import com.example.triviaapp.room.User
import com.example.triviaapp.utils.Resource
import kotlinx.coroutines.launch
import javax.inject.Inject

class SummaryViewModel @Inject constructor(
    private val databaseRepository: DatabaseRepositoryImpl
) : BaseViewModel() {

    private val userObserver by lazy { MutableLiveData<Resource<List<User>>>() }
    private val currentObserver by lazy { MutableLiveData<Resource<User>>() }

    fun getAllUsersObserver(): LiveData<Resource<List<User>>> = userObserver
    fun getCurrentUserObserver(): LiveData<Resource<User>> = currentObserver

    fun getAllUser() {
        launch {
            val response = databaseRepository.getAllUsers()
            if (response.isSuccess()) {
                userObserver.value = response
            }
        }
    }

    fun getLatestUser() {
        launch {
            val response = databaseRepository.getCurrentUser()
            if (response.isSuccess()) {
                currentObserver.value = response
            }
        }
    }

    fun saveUser(user: User) {
        launch {
            databaseRepository.saveUser(user)
        }
    }
}