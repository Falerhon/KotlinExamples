package com.example.looppool

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Score::class], version = 1)
abstract class ScoreDatabase: RoomDatabase() {
    abstract fun dao():ScoreDao

    fun w() {
        println("hello")
    }
}