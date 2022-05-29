package com.example.spring.mongodb.api.model;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Document(collection="Emp")
public class Emp {
	@Id
	private int empId;
	private String EmpName;
	private String city;
	public Emp(int empId, String EmpName,String city) {
		this.empId=empId;
		this.EmpName=EmpName;
		this.city=city;
	}
	public void setId(int empId) {
		this.empId=empId;
	}
	public String getId() {
		return Integer.toString(this.empId);
	}	
	public void setEmpName(String EmpName) {
		this.EmpName=EmpName;
	}
	public void setCity(String city) {
		this.city=city;
	}
}
