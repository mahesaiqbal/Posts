package com.mahesaiqbal.posts.model.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.mahesaiqbal.posts.model.Post
import com.mahesaiqbal.posts.model.PostDao

@Database(entities = arrayOf(Post::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun postDao(): PostDao
}