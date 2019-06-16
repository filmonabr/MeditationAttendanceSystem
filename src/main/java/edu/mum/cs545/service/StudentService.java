package edu.mum.cs545.service;

import java.util.List;

import mum.edu.waa.Meditation_Attendance_System.model.Student;

public interface StudentService {
       public void saveStudent();
       public Student getById(int id);
       public Student getByBarCode(String barCode);
       public List<Student> allStudents();
      
}
