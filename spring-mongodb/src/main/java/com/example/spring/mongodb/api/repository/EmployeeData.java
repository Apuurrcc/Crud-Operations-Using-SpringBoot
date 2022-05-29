package com.example.spring.mongodb.api.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.spring.mongodb.api.model.Emp;
public interface EmployeeData extends MongoRepository<Emp, Integer>{
	
}
