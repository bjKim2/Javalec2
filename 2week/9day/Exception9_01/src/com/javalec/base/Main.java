package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 10;
		int j = 0;
		
		System.out.println("Add :" + (i + j));
		System.out.println("Sub :" + (i - j));
		System.out.println("Mul :" + (i * j));
		try {
			System.out.println("Div :" + (i / j));
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("0으로 나누기는 불가 합니다.");
		}
		
	}

}
