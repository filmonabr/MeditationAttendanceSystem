package edu.mum.cs545.service.serviceImple;

import java.util.ArrayList;
import java.util.List;

import edu.mum.cs545.model.Course;
import edu.mum.cs545.model.WEEK;
import edu.mum.cs545.repository.CourseRepository;
import edu.mum.cs545.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseRepository courseRepository;

	@Override
	public void saveAllCourse() {
	courseRepository.saveAll(listCourse());

	}

	@Override
	public Course getById(Long id) {
		
		return courseRepository.findById(id).get();
	}

	@Override
	public List<Course> allCourses() {
		
		return (List<Course>)courseRepository.findAll();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private List<Course> listCourse() {
		
		List<Course>  retu=new ArrayList<>();
		retu.add(new Course("STC 508", "Science and Technology of Consciousness", WEEK.Two_WEEK));
		retu.add(new Course("SCI 506", "Science OF Creative Inteligence", WEEK.Two_WEEK));
		retu.add(new Course("MVS 555", "Engaging Nature’s Government", WEEK.FOUR_WEEK));
		retu.add(new Course("MATH 281", "Calculus 1", WEEK.FOUR_WEEK));
		retu.add(new Course("PHYS 250", "Introduction to Modern Physics", WEEK.FOUR_WEEK));
		retu.add(new Course("CS 201", "Procedural Programming", WEEK.FOUR_WEEK));
		retu.add(new Course("CS 203", " Oriented Programming", WEEK.FOUR_WEEK));
		retu.add(new Course("CS 363", "Computer Organization and Architecture", WEEK.FOUR_WEEK));
		retu.add(new Course("CS 335", "Software Development", WEEK.FOUR_WEEK));
		retu.add(new Course("MATH 286", "Linear Algebra 1", WEEK.FOUR_WEEK));
		retu.add(new Course("CS 221", "Data Structures", WEEK.FOUR_WEEK));
		
		return retu;
	}
	
	
	
	
	
	

}
