package edu.mum.cs545.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class TMChecking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDate chkDate;
    private String chkType;
    private Faculty instName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getChkDate() {
        return chkDate;
    }

    public void setChkDate(LocalDate chkDate) {
        this.chkDate = chkDate;
    }

    public String getChkType() {
        return chkType;
    }

    public void setChkType(String chkType) {
        this.chkType = chkType;
    }

    public Faculty getInstName() {
        return instName;
    }

    public void setInstName(Faculty instName) {
        this.instName = instName;
    }
}
