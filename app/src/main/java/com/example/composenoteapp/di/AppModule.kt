package com.example.composenoteapp.di

import android.app.Application
import androidx.room.Room
import com.example.composenoteapp.feature_note.data.data_source.NoteDatabase
import com.example.composenoteapp.feature_note.data.repository.NoteRepositoryImpl
import com.example.composenoteapp.feature_note.domain.repository.NoteRepository
import com.example.composenoteapp.feature_note.domain.use_cases.AddNote
import com.example.composenoteapp.feature_note.domain.use_cases.DeleteNote
import com.example.composenoteapp.feature_note.domain.use_cases.GetNoteUseCases
import com.example.composenoteapp.feature_note.domain.use_cases.NoteUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideNoteDatabase (app : Application) : NoteDatabase {
        return Room.databaseBuilder(
            app,
            NoteDatabase::class.java,
            NoteDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(db : NoteDatabase) : NoteRepository {
        return NoteRepositoryImpl(db.noteDao)
    }

    @Provides
    @Singleton
    fun provideNoteUseCases(repository: NoteRepository) : NoteUseCases {
        return NoteUseCases(
            getNoteUseCases = GetNoteUseCases(repository),
            deleteNote = DeleteNote(repository),
            addNote = AddNote(repository)
        )
    }
}