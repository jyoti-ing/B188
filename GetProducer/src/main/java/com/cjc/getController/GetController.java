package com.cjc.getController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.getServiceI.GetServiceI;
import com.cjc.model.Student;

@RestController
public class GetController {
	
	@Autowired
	GetServiceI gs;

	@GetMapping("/getStudents")
	public List<Student> getAllStudent(){
		
		return gs.getData();
		
		
	}
	
}
