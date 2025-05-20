package com.vechiles.parts;

public class Engine {
	private int horsePower; 
	private String engineType; 
	public void setEngineType(String engineType) { 
	this.engineType=engineType; 
	} 
	public void setHorsePower(int horsePower) { 
	this.horsePower=horsePower; 
	} 
	public String getEngineType() { 
	return engineType; 
	} 
	public int getHorsePower() { 
	return horsePower; 
	} 
	public void showEngineDetails() { 
	System.out.println("Engine Type:"+engineType); 
	System.out.println("Horse Power:"+horsePower); 
	} 
}
