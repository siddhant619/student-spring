package com.siddhant.student;

import com.siddhant.student.entity.Course;
import com.siddhant.student.entity.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class StudentApplication {

	public static void main(String[] args) {

		SpringApplication.run(StudentApplication.class, args);
		Student s= new Student();
		s.setName("pam");
		if(s.getCourses()!=null)
		System.out.println(s.getCourses().size());
		fun(s);
		System.out.println("After");
		for(Course c: s.getCourses()){
			System.out.println(c.getName());
		}
	}

	public static void fun(Student s){
		s.setName("xxx");
		Course c= new Course();
		c.setName("physics");
		s.setCourses(List.of(c));
	}

}
