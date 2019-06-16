package edu.mum.cs545.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {
        
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	     private Long id;
	     private String courseId;
	     private String courseName;
	     private WEEK courseWeek;
	     
	     public Course() {}
	     
	     
		public Course(String courseId, String courseName, WEEK courseWeek) {
			this.courseId = courseId;
			this.courseName = courseName;
			this.courseWeek = courseWeek;
		}


		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getCourseId() {
			return courseId;
		}
		public void setCourseId(String courseId) {
			this.courseId = courseId;
		}
		public String getCourseName() {
			return courseName;
		}
		public void setCourseName(String courseName) {
			this.courseName = courseName;
		}
		public WEEK getCourseWeek() {
			return courseWeek;
		}
		public void setCourseWeek(WEEK courseWeek) {
			this.courseWeek = courseWeek;
		}
	     
	     
	     
}
