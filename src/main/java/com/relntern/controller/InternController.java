package com.relntern.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.relntern.model.Intern;
import com.relntern.service.InternService;

@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class InternController {
	@Autowired
	private InternService internService;

	@PostMapping("/registerIntern")
	public Intern registerIntern(@RequestBody Intern intern) {
		return internService.registerIntern(intern);
	}

	@GetMapping("/getInterns")
	public List<Intern> getInterns() {
		return internService.getInterns();
	}
	
	@DeleteMapping("/deleteIntern")
	public void deleteIntern(@RequestParam Integer id) {
		internService.deleteIntern(id);
	}

	@PutMapping("/updateIntern")
	public Intern updateIntern(@RequestBody Intern intern) {
		return internService.updateIntern(intern);
	}

	@PostMapping("/{id}/moveToInactive")
	public ResponseEntity<String> moveActiveToIntactive(@PathVariable int id) {
		try {
			internService.moveActiveToIntactive(id);
			return ResponseEntity.ok("Intern moved to inactive interns successfully.");
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("Error moving intern to inactive interns: " + e.getMessage());
		}
	}

}
