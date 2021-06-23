package com.example.triviaapp

import com.example.triviaapp.utils.Resource
import com.example.triviaapp.error.AppError
import com.example.triviaapp.room.User
import com.example.triviaapp.room.UserDao
import javax.inject.Inject

class DatabaseRepositoryImpl @Inject constructor(
    private val userDao: UserDao
) : DatabaseRepository {
    override suspend fun getAllUsers(): Resource<List<User>> {
        return try {
            val response = userDao.getAll()
            Resource.success(response)

        } catch (throwable: Throwable) {
            Resource.error(AppError.UserDataNotFound)
        }
    }

    override suspend fun getCurrentUser(): Resource<User> {
        return try {
            val response = userDao.getLatestUser()
            Resource.success(response)

        } catch (throwable: Throwable) {
            Resource.error(AppError.UserDataNotFound)
        }
    }

    override suspend fun saveUser(user: User) {
        userDao.insert(user)
    }

    override suspend fun updateUser(user: User) {
        userDao.update(user)
    }

    override suspend fun doesPlayerExist(name: String): Boolean {
//        val a= 10
//        return false
        return userDao.doesPlayerExist(name)
    }

}