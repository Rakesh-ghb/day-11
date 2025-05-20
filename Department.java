package com.Company.admin;

public class Department {
	private String deptName; 
	 private int deptId; 
	 public void setName(String deptName) { 
	  this.deptName=deptName; 
	 } 
	 public void setDept(int deptId) { 
	  this.deptId=deptId; 
	 } 
	 public String getName() { 
	  return deptName; 
	 } 
	 public int getId() { 
	  return deptId; 
	 } 
	 public void showDepartmentDetails() { 
	  System.out.println("Department ID:"+deptId); 
	  System.out.println("Departmebt Name:"+deptName); 
	 }
	 
}
