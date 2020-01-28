package com.example.easynotes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.easynotes.model.Note;
import com.example.easynotes.repository.NoteRepository;

@RestController
@RequestMapping("/api")
public class NoteController {

	@Autowired
	private NoteRepository noteRepository;
	
	@GetMapping("/notes")
	public List<Note> getNotes() {
		return noteRepository.getNotes();
	}
	
	@PostMapping("/notes")
	public Note saveNote(@RequestBody Note note) {
		return noteRepository.saveNote(note);
	}
	
	@PutMapping("/notes/{id}")
	public void updateNote(@PathVariable(value="id") Long noteId, @RequestBody Note note) {
		Note existingNote = noteRepository.getNoteById(noteId);
		if(null == existingNote) {
			throw new NullPointerException("Note not found with id :: "+noteId);
		}
		
		existingNote.setTitle(note.getTitle());
		existingNote.setContent(note.getContent());
		
		noteRepository.updateNote(existingNote);
	}
	
}
