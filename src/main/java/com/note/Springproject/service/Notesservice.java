package com.note.Springproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.note.Springproject.Entitymodel.Notes;
import com.note.Springproject.Repository.NotesRepository;

@Service 
public class Notesservice {


	 @Autowired
	    private NotesRepository repository;

	    public Notes addNote(Notes note) {
	        return repository.save(note);
	    }

	    public List<Notes> getNotes() {
	        return repository.findAll();
	    }

	    public void deleteNote(int id) {
	        repository.deleteById(id);
	    }

}
