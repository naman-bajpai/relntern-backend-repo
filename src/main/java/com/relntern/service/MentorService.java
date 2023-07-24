package com.relntern.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.relntern.model.Mentor;
import com.relntern.repository.MentorRepository;

@Service
public class MentorService {
	@Autowired
	private MentorRepository mentorRepository;
	
	public Mentor registerMentor(Mentor mentor) {
		return mentorRepository.save(mentor);
	}
	public List<Mentor> getMentor(){
		return (List<Mentor>)mentorRepository.findAll();
	}
	
	public void deleteMentor(Integer mentorid) {
		mentorRepository.deleteById(mentorid);
	}
	
}
