package com.siddhant.student.controller;

import com.siddhant.student.entity.Student;
import com.siddhant.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;
    @PostMapping("/")
    public String createStudent(@RequestBody Student student){
        Student student1= studentRepository.save(student);
        return student1.getStudentId().toString();

    }


}
