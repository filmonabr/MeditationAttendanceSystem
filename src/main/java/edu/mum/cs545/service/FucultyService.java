package edu.mum.cs545.service;

import java.util.List;

import mum.edu.waa.Meditation_Attendance_System.model.Fuculty;

public interface FucultyService {
public void save();
public Fuculty getById(Long id);
public List<Fuculty> allFuculty();
}
