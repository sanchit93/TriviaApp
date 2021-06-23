package com.example.triviaapp

import com.example.triviaapp.utils.Resource
import com.example.triviaapp.room.User

interface DatabaseRepository {
    suspend fun getAllUsers(): Resource<List<User>>
    suspend fun getCurrentUser(): Resource<User>
    suspend fun saveUser(user: User)
    suspend fun updateUser(user: User)
    suspend fun doesPlayerExist(name: String): Boolean
}