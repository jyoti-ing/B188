package com.cjc.addController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.addServiceI.AddServiceI;
import com.cjc.model.Student;


@RestController
public class AddController {
	
	@Autowired
	AddServiceI ai;

	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student s) {
		
		Student s1 = ai.addStudent(s);
		
		return s1;
		
	}
	
}
