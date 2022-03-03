package com.javalec.function;

public class Car {
	
	//Field
	public String company= "현대자동차";
	public String model;
	public String color;
	public int maxSpeed;
	
	//Constructor
	public Car() {
		// TODO Auto-generated constructor stub
		//company = "현대자동차";
		
	}

	public Car(String model) {
		super();

		this.model = model;
	
	}
	

	public Car(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}
	
	

	public Car(String model, String color, int maxSpeed) {
		super();
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

//	public Car(int maxSpeed) {
//		super();
//		this.maxSpeed = maxSpeed;
//	}
	
	//Method
	
	
	public int add(int num1, int num2) {
		return num1 + num2;
	}


	public int add(int num1, int num2, int num3) {
		return num1 + num2+ num3;
	}
}
