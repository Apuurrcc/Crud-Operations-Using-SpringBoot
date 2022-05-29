package com.example.spring.mongodb.api.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.mongodb.api.model.Emp;
import com.example.spring.mongodb.api.repository.EmployeeData;

@RestController

public class EmployeeController {
	@Autowired
	public EmployeeData data;
	
	@PostMapping("/Emp")
	public String saveEmp(@RequestBody Emp Emp) {
		data.save(Emp);
		return "Added Employee with id : "+Emp.getId();
	}
	@GetMapping("/Emp")
	public List<Emp> getEmployees(){
		return data.findAll();
	}
	@GetMapping("/Emp/{id}")
	public Optional<Emp> getEmp(@PathVariable int id){
		if(data.existsById(id)==false) {
			System.out.println("Employee id not found");
			return null;
		}
		return data.findById(id);
		data.find
}
	@DeleteMapping("/Emp/{id}")
	public String DeleteEmp(@PathVariable int id) {
		if(data.existsById(id)==false) {
			System.out.println("Employee id not found");
			return null;
		}
		data.deleteById(id);
		return "Employee Deleted with id : "+Integer.toString(id);
	}
	@PutMapping("/Emp/{id}")
	public String Update(@PathVariable int id ){
		Optional<Emp> emp=data.findById(id);
		emp.
		
		return "Employee Updated with id :"+Integer.toString(id);
		
	}
}
