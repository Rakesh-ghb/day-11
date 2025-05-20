package com.school.staff;

public class principal {
	private String principalName;
	private int experinceYears; 
	 public void showPrincipalInfo() { 
	  System.out.println("School Principal name is:"+principalName); 
	  System.out.println("Principal Experience years is:"+experinceYears); 
	 } 
	 public void setPrincipalName(String principalName) { 
	  this.principalName=principalName; 
	 } 
	 public void setExperienceYears(int experinceYears) { 
	  this.experinceYears=experinceYears; 
	 } 
	 public String getPrincipalName() { 
	  return principalName; 
	 } 
	 public int getExperinceYears() { 
	  return experinceYears; 
	 }
}
