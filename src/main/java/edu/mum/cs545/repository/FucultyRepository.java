package edu.mum.cs545.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mum.edu.waa.Meditation_Attendance_System.model.Fuculty;
@Repository
public interface FucultyRepository extends CrudRepository<Fuculty, Long> {

}
