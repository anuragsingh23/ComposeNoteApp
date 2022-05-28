package com.example.composenoteapp.feature_note.data.data_source

import androidx.room.Dao
import androidx.room.Query
import com.example.composenoteapp.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {

    @Query("SELECT * FROM note")
    fun getNotes() : Flow<List<Note>>

    fun getNoteByID(id:Int) : Note?
}