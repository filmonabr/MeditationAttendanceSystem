package edu.mum.cs545.controller;

import edu.mum.cs545.service.CourseService;
import edu.mum.cs545.service.FucultyService;
import edu.mum.cs545.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@Autowired
	private CourseService courseService;
	@Autowired
	private StudentService studentService;
	@Autowired
	private FucultyService fucultyService;
	  @GetMapping("/")
	  public String page() {
		  courseService.saveAllCourse();
		  studentService.saveStudent();
		  fucultyService.save();
		  return "home";
	  }
}
