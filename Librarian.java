package com.library.staff;

public class Librarian {
	private String librarianName; 
	 private int yearsOfExperince; 
	 public void setLibrarianName(String librarianName) { 
	  this.librarianName=librarianName; 
	 } 
	 public void setYearsOfExperince(int yearsOfExperience) { 
	  this.yearsOfExperince=yearsOfExperience; 
	 } 
	 public String getName() { 
	  return librarianName; 
	 } 
	 public int getExperience() { 
	  return yearsOfExperince; 
	 } 
	 public void showLibrarianInfo() { 
	  System.out.println("Librarian Namw:"+librarianName); 
	  System.out.println("Years of Experince:"+yearsOfExperince);
}
}
