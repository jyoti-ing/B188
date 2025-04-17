package com.cjc.addServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.addServiceI.AddServiceI;
import com.cjc.model.Student;
import com.cjc.studentRepo.StudentRepository;

@Service
public class AddServiceImpl implements AddServiceI{
	
	@Autowired
	StudentRepository sr;

	@Override
	public Student addStudent(Student s) {
		
		return sr.save(s);
	}

}
