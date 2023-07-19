package com.relntern.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.relntern.model.InactiveIntern;
import com.relntern.model.Intern;
import com.relntern.repository.InactiveInternRepository;
import com.relntern.repository.InternRepository;

@Service
public class InternService {
	@Autowired
	private InternRepository internRepository;

	@Autowired
	private InactiveInternRepository inactiveInternRepository;

	public Intern registerIntern(Intern intern) {
		return internRepository.save(intern);
	}

	public List<Intern> getInterns() {
		return (List<Intern>) internRepository.findAll();
	}

	public void deleteIntern(Integer id) {
		internRepository.deleteById(id);
	}

	public Intern getInternById(int id) {
		return internRepository.findById(id).get();
	}

//	public Intern updateIntern(Intern updatedIntern) {
//		Integer Id = intern.getid();
//		Intern intern = internRepository.findById(id).orElse(null);
//		if (intern != null) {
//			intern.setFullname(updatedIntern.getFullname());
//			// Update other properties as needed
//			return internRepository.save(intern);
//		}
//		return null;
//	}

	public Intern updateIntern(Intern updatedIntern) {
		Integer id = updatedIntern.getId();
		java.util.Optional<Intern> optionalIntern = internRepository.findById(id);
		if (optionalIntern.isPresent()) {
			Intern intern = optionalIntern.get();
			intern.setFullname(updatedIntern.getFullname());
			intern.setEmail(updatedIntern.getEmail());
			intern.setMentor(updatedIntern.getMentor());
			intern.setMentoremail(updatedIntern.getMentoremail());
			intern.setProjectname(updatedIntern.getProjectname());
			intern.setProjectstatus(updatedIntern.getProjectstatus());
			intern.setStartDate(updatedIntern.getStartDate());
			intern.setEndDate(updatedIntern.getEndDate());
			intern.setRole(updatedIntern.getRole());
			intern.setAssociation(updatedIntern.getAssociation());
			intern.setGradyear(updatedIntern.getGradyear());
			intern.setUniname(updatedIntern.getUniname());
			intern.setCoursename(updatedIntern.getCoursename());
			intern.setSpecialization(updatedIntern.getSpecialization());
			intern.setLinkedlink(updatedIntern.getLinkedlink());
			intern.setQuarter(updatedIntern.getQuarter());
			intern.setReference(updatedIntern.getReference());

			return internRepository.save(intern);
		}
		return null;
	}

	public void moveActiveToIntactive(int internId) {
		// Step 1: Retrieve active intern using the InternRepository
		java.util.Optional<Intern> optionalActiveIntern = internRepository.findById(internId);

		if (optionalActiveIntern.isPresent()) {
			// Step 2: Create a new instance of InactiveIntern
			Intern activeIntern = optionalActiveIntern.get();
			InactiveIntern inactiveIntern = new InactiveIntern();
			// Step 3: Copy relevant data from active intern to inactive intern
			inactiveIntern.setFullname(activeIntern.getFullname());
			inactiveIntern.setEmail(activeIntern.getEmail());
			inactiveIntern.setMentor(activeIntern.getMentor());
			inactiveIntern.setMentoremail(activeIntern.getMentoremail());
			inactiveIntern.setMentoremail(activeIntern.getMentoremail());
			inactiveIntern.setProjectname(activeIntern.getProjectname());
			inactiveIntern.setProjectstatus(activeIntern.getProjectstatus());
			inactiveIntern.setStartDate(activeIntern.getStartDate());
			inactiveIntern.setEndDate(activeIntern.getEndDate());
			inactiveIntern.setRole(activeIntern.getRole());
			inactiveIntern.setAssociation(activeIntern.getAssociation());
			inactiveIntern.setGradyear(activeIntern.getGradyear());
			inactiveIntern.setUniname(activeIntern.getUniname());
			inactiveIntern.setCoursename(activeIntern.getCoursename());
			inactiveIntern.setSpecialization(activeIntern.getSpecialization());
			inactiveIntern.setLinkedlink(activeIntern.getLinkedlink());
			inactiveIntern.setQuarter(activeIntern.getQuarter());
			inactiveIntern.setReference(activeIntern.getReference());
			// Copy other relevant properties

			// Step 4: Save the new InactiveIntern instance
			inactiveInternRepository.save(inactiveIntern);

			// Step 5: Delete the active intern from the InternRepository
			internRepository.deleteById(internId);
		} else {
			// Handle the case where the active intern with the provided ID is not found.
			// You can throw an exception or log an error message, depending on your use
			// case.
		}
	}

}
