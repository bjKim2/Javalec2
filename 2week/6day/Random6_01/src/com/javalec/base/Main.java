package com.javalec.base;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random(); // random 은 인스턴스
		int tmp = random.nextInt(3)+1;
		if(tmp == 1) {
			System.out.println("가위");
		}else if(tmp ==2 ) {
			System.out.println("바위");
		}else {
			System.out.println("보");
		}
		

	}

}
