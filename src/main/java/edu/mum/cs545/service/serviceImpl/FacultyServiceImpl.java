package edu.mum.cs545.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import edu.mum.cs545.model.Faculty;
import edu.mum.cs545.repository.FacultyRepository;
import edu.mum.cs545.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;

public class FacultyServiceImpl implements FacultyService {

	@Autowired
	private FacultyRepository facultyRepository;
	
	
	@Override
	public void save() {
	//	facultyRepository.saveAll(allFuc());

	}

	@Override
	public Faculty getById(Long id) {

		return facultyRepository.findById(id).get();
	}

	@Override
	public List<Faculty> allFuculty() {
		
		return (List<Faculty>)facultyRepository.findAll();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public List<Faculty> allFuc(){
		List<Faculty> retu=new ArrayList<>();
		retu.add(new Faculty("John", "Brune", "john@email.com", "test657", EnumStaff.PROFESOR));
		retu.add(new Faculty("Cris", "Jericho", "cris@email.com", "test640", EnumStaff.ADMIN));
		return retu;
	}

}
