package com.note.Springproject.controller;

import java.util.ArrayList; 
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.note.Springproject.Entitymodel.Notes;

@RestController
@RequestMapping("/Notes")
public class NotesController {

		List<Notes> notes=new ArrayList<>();
		
		int counter = 1;
		
		@PostMapping 
		public String addNote(@RequestBody List<Notes> newNotes) {

		    for (Notes note : newNotes) {
		        note.setId(counter++);   // ✅ auto increment id
		        notes.add(note);
		    }
		    return "notes are added";
		}

		
		@GetMapping
		public List<Notes> getNotes() {
			return notes;
		}
		
		@DeleteMapping("/{id}")
		public String deleteNote(@PathVariable int id) {
			notes.removeIf(n->n.getId()==id);
			return "note deleted";
		}
		
	}

