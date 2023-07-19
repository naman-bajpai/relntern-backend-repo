package com.relntern.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.relntern.model.InactiveIntern;
import com.relntern.model.Intern;
import com.relntern.service.InactiveInternService;

@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class InactiveInternController {
    @Autowired
    private InactiveInternService inactiveInternService;

    @GetMapping("/getInactiveInterns")
	public List<InactiveIntern> getInterns() {
		return inactiveInternService.getInactiveInterns();
	}
    
    @DeleteMapping("/deleteInactiveIntern")
	public void deleteInactiveIntern(@RequestParam Integer id) {
    	inactiveInternService.deleteInactiveIntern(id);
	}

}

