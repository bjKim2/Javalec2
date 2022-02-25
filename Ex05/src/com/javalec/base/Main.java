package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int inputNum1, sum = 0;
		
		System.out.print("Enter an integer(0~9) : ");
		inputNum1 = scanner.nextInt();
		
		while(true){
			sum += inputNum1 % 10;
			inputNum1 /= 10;
			if (inputNum1 == 0) {
				break;
			}
			
		}
		System.out.println("Sum of digits = " + sum );
		
		
				
	}

}
