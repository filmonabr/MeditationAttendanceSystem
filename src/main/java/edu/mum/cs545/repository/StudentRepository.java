package edu.mum.cs545.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mum.edu.waa.Meditation_Attendance_System.model.Student;
@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {
       public Student findByBarCode(String barCode);
}
