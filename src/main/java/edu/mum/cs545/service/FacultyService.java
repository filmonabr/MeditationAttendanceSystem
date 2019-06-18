package edu.mum.cs545.service;

import java.util.List;

import edu.mum.cs545.model.Faculty;


public interface FacultyService {
public void save();
public Faculty getById(Long id);
public List<Faculty> allFuculty();
}
