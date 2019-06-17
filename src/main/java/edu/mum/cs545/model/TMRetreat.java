package edu.mum.cs545.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class TMRetreat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDate rtDate;
    private String location;
    private Faculty instName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getRtDate() {
        return rtDate;
    }

    public void setRtDate(LocalDate rtDate) {
        this.rtDate = rtDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Faculty getInstName() {
        return instName;
    }

    public void setInstName(Faculty instName) {
        this.instName = instName;
    }
}
