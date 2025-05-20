package com.school.app;
import com.school.management.school; 
import  com.school.staff.principal;
public class SchoolApp {

	public static void main(String[] args) { 
		
		school obj=new school(); 
		principal p=new principal(); 
		obj.setName("TSs model School"); 
		obj.setLocation("hyderabad"); 
		p.setPrincipalName("rakesh"); 
		p.setExperienceYears(20); 
		obj.showSchoolInfo(); 
		p.showPrincipalInfo();

}
}