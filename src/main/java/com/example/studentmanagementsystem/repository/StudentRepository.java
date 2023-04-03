package com.example.studentmanagementsystem.repository;

import com.example.studentmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

                                                    //<type of jpa entity, type of primary key>
public interface StudentRepository extends JpaRepository<Student,Long> {

}
