package com.spring.jdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entity.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("My Program Started..");
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
//        JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
//        
//        //insert query into database
//        String query = "insert into student(id, name, city) values(?, ?, ?)";
//        
//        //fire query
//        int result = template.update(query, 3, "Ninu", "Delhi");
//        System.out.println("Number of results inserted: "+result);

		// <-----------New method of inserting data--------->

		StudentDao studentDao =  context.getBean("studentDao", StudentDao.class);
//        Student student = new Student();
//        student.setId(77);
//        student.setName("Chinuu");
//        student.setCity("Bombay");

//        int result = studentDao.insert(student);

		// <---------------Updating in database-------------->

//        Student student = new Student();
//        student.setId(77);
//        student.setName("China");
//        student.setCity("New York");
//        int result = studentDao.change(student);

		// <-----------delete query----------------------------->
//     Scanner sc = new Scanner(System.in);
//      System.out.println("Enter id to delete data: " );
//      int i = sc.nextInt();
//     int result = studentDao.delete(i);
//  	System.out.println("Number of results deleted: " + result);
		
		//<------------selecting one row---------->
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id to select that data: ");
		int i = sc.nextInt();
		Student result = studentDao.getStudent(i);
		System.out.println("Selected data is: " + result);
		
		//<-------Selecting complete table------>
		List<Student> data = studentDao.allData();
		System.out.println("Data of all Students:- ");
		for(Student d: data)
		{
			System.out.println(d);
		}
	}
}
