package com.example.composenoteapp.feature_note.presentation.notes

import com.example.composenoteapp.feature_note.domain.model.Note
import com.example.composenoteapp.feature_note.domain.utils.NoteOrder
import com.example.composenoteapp.feature_note.domain.utils.OrderType

data class NoteState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Ascending),
    val isOrderSectionVisible: Boolean = false,
)
