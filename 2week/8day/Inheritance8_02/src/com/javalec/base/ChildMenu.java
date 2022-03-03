package com.javalec.base;

public class ChildMenu extends ParentsMenu{
	
	//Field
	
	//Constructor
	public ChildMenu() {
		// TODO Auto-generated constructor stub
	}
	
	
	//Method
	public void makeBeefChung() {
		System.out.println("소고기 청국장");
	}
	
	public void makeHotDoen() {
		System.out.println("얼큰 된장국");
	}
	
	public void makeKong() {
		System.out.println("콩나물 국");
	}
	
	//@override
	public void makeChung() {
		System.out.println("냄새 없는 청국장");
	}

}
