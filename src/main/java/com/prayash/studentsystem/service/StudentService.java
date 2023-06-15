package com.prayash.studentsystem.service;

import com.prayash.studentsystem.StudentsystemApplication;
import com.prayash.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
