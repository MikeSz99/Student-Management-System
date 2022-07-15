package com.springproject1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproject1.entity.Student;
import com.springproject1.repositories.StudentRepository;
import com.springproject1.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository repo;
	
	
	public StudentServiceImpl(StudentRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public List<Student> getAllStudents() {
		return repo.findAll();
	}
	
	@Override
	public Student saveStudent(Student student) {
		return repo.save(student);	
	}
	
	@Override
	public Student getStudentById(Long id) {
		return repo.findById(id).get();
	}
	
	@Override
	public Student updateStudent(Student student) {
		return repo.save(student);
	}
	
	@Override
	public void deleteStudentById(Long id) {
		repo.deleteById(id);
	}
	
	
}
