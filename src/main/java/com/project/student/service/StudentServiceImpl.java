package com.project.student.service;

import com.project.student.entity.Student;
import com.project.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{


    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public String addStudent(Student student) {
         studentRepository.save(student);
         return "Studentdetails have been saved successfully";
    }

    @Override
    public String updateStudentDetails(Student student) {
        studentRepository.save(student);
        return "Details have been updated successfully";
    }

    @Override
    public String deleteStudentById(Long id) {
        studentRepository.deleteById(id);
        return "student details have been successfully deleted from the data base..";
    }
}
