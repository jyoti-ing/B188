package com.cjc.deleteController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.deleteServiceI.DeleteServiceI;

@RestController
public class DeleteController {
	
	@Autowired
	DeleteServiceI ds;

	@DeleteMapping("/deleteStudent/{rollno}")
	public void deleteStudent(@PathVariable int rollno) {
		
		ds.deleteStudent(rollno);
		
		
	}
	
}


