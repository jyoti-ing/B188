package com.cjc.updateController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.Student;
import com.cjc.updateServiceI.UpdateServiceI;

@RestController
public class UpdateController {
	
	@Autowired
	UpdateServiceI us;

	@PutMapping("/updateStudent/{rollno}")
	public void updateStudent(@RequestBody Student s,@PathVariable int rollno) {
		
		 us.updateStudent(rollno,s);
		
	}
	
	
}
