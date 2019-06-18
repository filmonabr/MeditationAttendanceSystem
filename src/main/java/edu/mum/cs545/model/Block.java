package edu.mum.cs545.model;

import edu.mum.cs545.model.Enums.EnumCourseType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Block {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDate stDate;
    private LocalDate enDate;
    private Course course;
    private EnumCourseType enumWeek;
    private Attendance attendance;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getStDate() {
        return stDate;
    }

    public void setStDate(LocalDate stDate) {
        this.stDate = stDate;
    }

    public LocalDate getEnDate() {
        return enDate;
    }

    public void setEnDate(LocalDate enDate) {
        this.enDate = enDate;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public EnumCourseType getEnumWeek() {
        return enumWeek;
    }

    public void setEnumWeek(EnumCourseType enumWeek) {
        this.enumWeek = enumWeek;
    }

    public Attendance getAttendance() {
        return attendance;
    }

    public void setAttendance(Attendance attendance) {
        this.attendance = attendance;
    }

    public void sendMessage(){

        System.out.println("Email sent to ");
    }
}
