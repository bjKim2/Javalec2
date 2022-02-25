package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int intNum1;
		
		System.out.print("몇 개의 숫자를 더할까요? : ");
		intNum1 = scanner.nextInt();
		int sum = 0;
		
		for(int i = 0 ; i<intNum1 ; i++){
			sum += scanner.nextInt();
			
		}
		System.out.println("입력한 숫자의 합은 : " + sum);
		
	}

}
