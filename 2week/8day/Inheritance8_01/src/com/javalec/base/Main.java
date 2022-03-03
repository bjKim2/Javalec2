package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		System.out.print("아버님 성함 : ");
		child.getFather();
		
		System.out.print("어머님 성함 : ");
		child.getModther();
		
		System.out.print("내 이름:");
		child.getMe();
	}

}
