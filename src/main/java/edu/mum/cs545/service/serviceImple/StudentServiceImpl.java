package edu.mum.cs545.service.serviceImple;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mum.edu.waa.Meditation_Attendance_System.model.ENTRY;
import mum.edu.waa.Meditation_Attendance_System.model.Student;
import mum.edu.waa.Meditation_Attendance_System.repository.StudentRepository;
import mum.edu.waa.Meditation_Attendance_System.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {

	 @Autowired
	 private StudentRepository studentRepository;
	 
	 
	@Override
	public void saveStudent() {
		
		studentRepository.saveAll(saveAllStudent());

	}

	@Override
	public Student getById(int id) {
		
		return studentRepository.findById(id).get();
	}

	@Override
	public Student getByBarCode(String barCode) {
		
		return studentRepository.findByBarCode(barCode);
	}

	@Override
	public List<Student> allStudents() {
		
		return (List<Student>)studentRepository.findAll();
	}
	
	
	
	
	
	
	
	
	
	
	private List<Student> saveAllStudent(){
		List<Student> retu=new ArrayList<>();
		
		retu.add(new Student("1111", "Abel", "Nedi", "abel@email.com", "test123", ENTRY.FEBRUARY));
		retu.add(new Student("2222", "Terik", "Ahmed", "tarik@email.com", "test234", ENTRY.AUGUST));
		retu.add(new Student("3333", "Devid", "Balack", "dev@email.com", "test543", ENTRY.MAY));
		retu.add(new Student("4444", "Ti", "Xavi", "ti@email.com", "test098", ENTRY.NOVEMBER));
		retu.add(new Student("5555", "John", "Fernado", "john@email.com", "test654", ENTRY.FEBRUARY));
		
		return retu;
	}

}
