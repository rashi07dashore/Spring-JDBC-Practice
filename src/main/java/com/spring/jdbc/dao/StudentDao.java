package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.entity.Student;

public interface StudentDao {
	
	public int insert(Student student);
	public int change(Student student); //update jdbc
	public int delete(int studentId); //Takes id to delete data
	public Student getStudent(int studentId);
	public List<Student> allData();
}
