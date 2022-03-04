package com.javalec.base;

public class Print {

	public Print() {
		// TODO Auto-generated constructor stub
	}
	
	public void print(int index) {
		
		System.out.printf("2. 귀하가 입력하신 ID는 %s이고 암호는 %s 입니다",DB.id[index],DB.pwd[index]);
	}
}
