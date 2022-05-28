package com.example.composenoteapp.feature_note.presentation.notes

import androidx.lifecycle.ViewModel
import com.example.composenoteapp.feature_note.domain.use_cases.GetNoteUseCases
import com.example.composenoteapp.feature_note.domain.use_cases.NoteUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NotesViewModel @Inject constructor(
    private val noteUseCases: NoteUseCases
    ) : ViewModel ( ) {


    }