package edu.mum.cs545.service.serviceImple;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mum.edu.waa.Meditation_Attendance_System.model.Fuculty;
import mum.edu.waa.Meditation_Attendance_System.model.STUFF;
import mum.edu.waa.Meditation_Attendance_System.repository.FucultyRepository;
import mum.edu.waa.Meditation_Attendance_System.service.FucultyService;
@Service
public class FucultyServiceImpl implements FucultyService {

	@Autowired
	private FucultyRepository fucultyRepository;
	
	
	@Override
	public void save() {
		fucultyRepository.saveAll(allFuc());

	}

	@Override
	public Fuculty getById(Long id) {
		
		return fucultyRepository.findById(id).get();
	}

	@Override
	public List<Fuculty> allFuculty() {
		
		return (List<Fuculty>)fucultyRepository.findAll();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public List<Fuculty> allFuc(){
		List<Fuculty> retu=new ArrayList<>();
		retu.add(new Fuculty("John", "Brune", "john@email.com", "test657", STUFF.PROFESOR));
		retu.add(new Fuculty("Cris", "Jericho", "cris@email.com", "test640", STUFF.ADMIN));
		return retu;
	}

}
