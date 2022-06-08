package com.example.composenoteapp.feature_note.domain.use_cases

import com.example.composenoteapp.feature_note.domain.model.InvalidNoteException
import com.example.composenoteapp.feature_note.domain.model.Note
import com.example.composenoteapp.feature_note.domain.repository.NoteRepository

class AddNote(
    private val repository: NoteRepository
) {

    @Throws(InvalidNoteException::class)
   suspend operator fun invoke ( note: Note) {
       if (note.title.isBlank()){
          throw InvalidNoteException("The Title of the notes can't be blanked")
       }
      if (note.content.isBlank()){
          throw InvalidNoteException("The Content os the notes can't be blanked")
       }
        repository.insertNote(note)
    }
}