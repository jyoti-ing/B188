package com.cjc.getServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.getServiceI.GetServiceI;
import com.cjc.model.Student;
import com.cjc.studentRepo.StudentRepository;
@Service
public class GetServiceImpl implements GetServiceI{

	@Autowired
	StudentRepository sr;
	
	@Override
	public List<Student> getData() {
		
		return (List<Student>) sr.findAll();
	}

}
