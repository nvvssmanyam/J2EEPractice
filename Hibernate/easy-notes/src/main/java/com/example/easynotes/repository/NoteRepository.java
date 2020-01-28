package com.example.easynotes.repository;

import java.util.List;

import com.example.easynotes.model.Note;

public interface NoteRepository {

	public List<Note> getNotes();

	public Note saveNote(Note note);
	
	public Note getNoteById(long id);
	
	public void updateNote(Note note);
	
}