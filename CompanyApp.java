package com.Company.app;
import com.Company.admin.Department; 
import com.Company.hr.Employee;
public class CompanyApp {
	public static void main(String[] args) { 
		  Employee emp=new Employee(); 
		  Department dept=new Department(); 
		  emp.setName("RAKESH"); 
		  emp.setID(7520258); 
		  emp.setSalary(50000); 
		  dept.setDept(5); 
		  dept.setName("DEVELOPER"); 
		  emp.showEmployeeDetails(); 
		  dept.showDepartmentDetails(); 
		}
}
