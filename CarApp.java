package com.vechiles.app;
import  com.vechiles.parts.*; 
import com.vechile.*; 
public class CarApp {
	public static void main(String[] args) { 
		Car car=new Car(); 
		Engine eng=new Engine(); 
		car.setBrand("BMW"); 
		car.setModel("NEW BMW"); 
		car.setPrice(4500000); 
		eng.setEngineType("GOOD"); 
		eng.setHorsePower(200); 
		car.showCarDetails(); 
		eng.showEngineDetails(); 
		} 
		} 
		

