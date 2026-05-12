package com.note.Springproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository; 

import com.note.Springproject.Entitymodel.Notes;

public interface NotesRepository extends JpaRepository<Notes, Integer> {

}
