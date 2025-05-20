package com.bank.app;
import com.bank.accounts.Bankaccount; 
import com.bank.customers.Customers; 
public class BankApp {
	public static void main(String[] args) { 
		
		Bankaccount obj=new Bankaccount(); 
		obj.setAccountNumber("4587612555"); 
		obj.setBalance(100); 
		Customers cust=new Customers(); 
		cust.setCustomerID(7894); 
		cust.setCustomerName("Rakesh"); 
		obj.showAccountDetails(); 
		cust.showCustomerDetails();
}
}
