package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//사용자가 입력하는 숫자 5개를 받아서 합계를 구하기
		
		Scanner scanner = new Scanner(System.in);
		
		// 변
		int[] num1 = new int[5];
		int sum=0;
		
		//입력 받아오
		for (int i = 0; i < num1.length; i++) {
			
			System.out.print( i+1 + " 번쨰 숫자를 입력하세요." );
			num1[i] = scanner.nextInt();
			sum +=num1[i];
		}
		System.out.println("귀하가 입력하신 수의 합계는 " + sum + "입니다. ");
		
	}

}
