package com.cjc.studentRepo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.Student;
@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{

}
