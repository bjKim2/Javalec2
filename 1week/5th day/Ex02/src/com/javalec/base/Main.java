package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int intNum1;
		int factorial = 1;
		System.out.print("Input your decimal no. : ");
		intNum1 = scanner.nextInt();
		for(int i = 2 ; i <= intNum1 ; i++) {
			factorial = factorial * i;
			//System.out.println(factorial);
		}
		System.out.println(intNum1 + "'s factorial value = " + factorial);
	}

}

