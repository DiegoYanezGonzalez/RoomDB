package com.example.roomdb.model.dataBase

import androidx.room.*
import com.example.roomdb.model.dataBase.Task


//Metodos que interactuan con la base de dato
@Dao
interface TaskDao {

    //Insert , objeto que deberia ir a la base de datos task de la clase Task
    @Insert
    fun insertTask(task: Task)

    //Insert Masivo
    @Insert
    fun insertMultipleTask(list: List<Task>)

    @Update
    fun updateTask(task: Task)

    @Delete
    fun deleteOneTask(task: Task)

    //traeria toodo los task y los ordenaria por el id ascendentemente
    @Query("SELECT * FROM task_table ORDER BY idTask ASC")
    fun getAllTask():List<Task>
}

