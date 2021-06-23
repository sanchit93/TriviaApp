package com.example.triviaapp.room

import androidx.room.*

@Dao
interface UserDao {
    @Query("SELECT * FROM user")
    suspend fun getAll(): List<User>

    @Query("SELECT * from user ORDER BY id DESC LIMIT 1")
    suspend fun getLatestUser(): User

    @Insert
    suspend fun insertAll(users: List<User>)

    @Insert
    suspend fun insert(user: User)

    @Delete
    suspend fun delete(user: User)

    @Update
    suspend fun update(user: User)

    @Query("SELECT EXISTS(SELECT * FROM user WHERE name = :name)")
    suspend fun doesPlayerExist(name: String): Boolean
}