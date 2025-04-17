package com.cjc.deleteServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.deleteServiceI.DeleteServiceI;
import com.cjc.studentRepo.StudentRepository;

@Service
public class DeleteServiceImpl implements DeleteServiceI{
	
	@Autowired
	StudentRepository sr;

	@Override
	public void deleteStudent(int rollno) {


		sr.deleteById(rollno);
		
	}

}
