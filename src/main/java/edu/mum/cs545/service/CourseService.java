package edu.mum.cs545.service;

import java.util.List;

import edu.mum.cs545.model.Course;


public interface CourseService {

	public void saveAllCourse();
	public Course getById(Long id);
	public List<Course> allCourses();
}
