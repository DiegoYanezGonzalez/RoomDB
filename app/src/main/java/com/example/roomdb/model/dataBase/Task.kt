package com.example.roomdb.model.dataBase

import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull


@Entity(tableName="task_table")
data class Task (@PrimaryKey(autoGenerate=true)
                 @NotNull val idTask:Int,
                 val taks:String,
                 val creationDate:String,
                 val finishDate:String


)