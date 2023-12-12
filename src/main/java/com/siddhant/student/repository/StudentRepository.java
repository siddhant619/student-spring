package com.siddhant.student.repository;

import com.siddhant.student.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository< Student,Long> {

}
