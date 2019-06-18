package edu.mum.cs545.service;

import edu.mum.cs545.model.Student;

import java.util.List;


public interface StudentService {
       public void saveStudent();
       public Student getById(int id);
       public Student getByBarCode(String barCode);
       public List<Student> allStudents();
      
}
