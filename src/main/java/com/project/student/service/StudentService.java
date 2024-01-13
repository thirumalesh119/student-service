package com.project.student.service;

import com.project.student.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    public List<Student> getAllStudents();

    public Optional<Student> getStudentById(Long id);

    public String addStudent(Student Student);

    public String updateStudentDetails(Student student);

    public String deleteStudentById(Long id);

}
