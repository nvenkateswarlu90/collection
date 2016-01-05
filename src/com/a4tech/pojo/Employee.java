package com.a4tech.pojo;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Employee {
	String EmpName;
	String EmpSal;
	String EmpLocation;
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getEmpSal() {
		return EmpSal;
	}
	public void setEmpSal(String empSal) {
		EmpSal = empSal;
	}
	public String getEmpLocation() {
		return EmpLocation;
	}
	public void setEmpLocation(String empLocation) {
		EmpLocation = empLocation;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return  EqualsBuilder.reflectionEquals(this,obj);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ReflectionToStringBuilder.toString(this);
	}

}
