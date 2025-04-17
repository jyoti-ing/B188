package com.cjc.updateServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Student;
import com.cjc.studentRepo.StudentRepository;
import com.cjc.updateServiceI.UpdateServiceI;
@Service
public class UpdateServiceImpl implements UpdateServiceI{
	
	@Autowired
	StudentRepository sr;

	@Override
	public void updateStudent(int rollno, Student s) {

		Student s1 = sr.findById(rollno).get();
		
		if(s.getName()!=null) {
			s1.setName(s.getName());
		}
		
		if(s.getAddress()!=null) {
			s1.setAddress(s.getAddress());
		}
		
		if(s.getMarks()!=0.0) {
			s1.setMarks(s.getMarks());
		}
		
		
		 sr.save(s1);
	}

}
