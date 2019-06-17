package edu.mum.cs545.model;

import edu.mum.cs545.model.Enums.EnumLocation;
import edu.mum.cs545.model.Enums.EnumTMTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int noOfDays;
    private EnumTMTime enumTMTime;
    private EnumLocation enumLocation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNoOfDays() {
        return noOfDays;
    }

    public void setNoOfDays(int noOfDays) {
        this.noOfDays = noOfDays;
    }

    public EnumTMTime getEnumTMTime() {
        return enumTMTime;
    }

    public void setEnumTMTime(EnumTMTime enumTMTime) {
        this.enumTMTime = enumTMTime;
    }

    public EnumLocation getEnumLocation() {
        return enumLocation;
    }

    public void setEnumLocation(EnumLocation enumLocation) {
        this.enumLocation = enumLocation;
    }
}
