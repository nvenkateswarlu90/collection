package com.a4tech.collections;

import com.a4tech.pojo.Employee;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Employee empBean = new Employee();
	empBean.setEmpName("Raju");
	empBean.setEmpSal("25000");
    empBean.setEmpLocation("mumbai"); 
    
    System.out.println("Employee Data>>>"+ empBean);
	}

}
