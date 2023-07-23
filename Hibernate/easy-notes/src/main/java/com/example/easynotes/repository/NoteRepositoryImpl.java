package com.example.easynotes.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.easynotes.model.Note;

@Repository
@Transactional
public class NoteRepositoryImpl implements NoteRepository {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Note> getNotes() {
		return getSession().createQuery("from Note").list();
	}

	@Override
	public Note saveNote(Note note) {
		Long generatedId = (Long) getSession().save(note);
		return getNoteById(generatedId);
	}

	@Override
	public Note getNoteById(long id) {
		return getSession().get(Note.class, id);
	}

	@Override
	public void updateNote(Note note) {
		getSession().update(note);
	}
	
	

}
