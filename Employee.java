package com.Company.hr;

public class Employee {
	private int id; 
	private String name; 
	private double salary; 
	public void setName(String name) { 
	this.name=name; 
	} 
	public void setID(int id) { 
	this.id=id; 
	} 
	public void setSalary(double salary) { 
	this.salary=salary; 
	} 
	public String getName() { 
	return name; 
	} 
	public int getID() { 
	return id;
	}
	public double getSalary() { 
		  return salary; 
		 } 
		 public void showEmployeeDetails() { 
		  System.out.println("Employee Name:"+name); 
		  System.out.println("Employee ID:"+id); 
		  System.out.println("Employee Salary:"+salary); 
		 }
}
