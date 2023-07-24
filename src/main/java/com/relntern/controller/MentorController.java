package com.relntern.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.relntern.model.Mentor;
import com.relntern.service.MentorService;

@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class MentorController {

	@Autowired
	private MentorService mentorService;

	@PostMapping("/registerMentor")
	public Mentor registerMentor(@RequestBody Mentor mentor) {
		return mentorService.registerMentor(mentor);
	}
	
	@GetMapping("/getMentor")
	public List<Mentor> getMentor(){
		return mentorService.getMentor();
	}
	
	@DeleteMapping("/deleteMentor")
	public void deleteIntern(@RequestParam Integer mentorid) {
		mentorService.deleteMentor(mentorid);
	}
	
}