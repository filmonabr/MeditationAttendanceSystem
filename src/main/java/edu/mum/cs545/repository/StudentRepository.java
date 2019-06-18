package edu.mum.cs545.repository;

import edu.mum.cs545.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {
       public Student findByBarCode(String barCode);
}
