package com.example.roomdb.model.dataBase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities=arrayOf(Task::class),version=0,exportSchema=false)
abstract class TaskDataBase :RoomDatabase() {

    abstract fun getTaskDao(): TaskDao

    companion object {

        @Volatile
        private var INSTANCE: TaskDataBase? = null


        fun getDatabase(context: Context): TaskDataBase {
            val tempInstance =
                INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance =
                    Room.databaseBuilder(context.applicationContext,
                        TaskDataBase::class.java,
                        "word database").build()
                INSTANCE = instance
                return instance
            }
        }

    }
}
