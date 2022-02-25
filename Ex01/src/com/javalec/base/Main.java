package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intNum1;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input your number : ");
		intNum1 = scanner.nextInt();
		
		for (int i =1 ; i<=9; i++) {
			for (int j = intNum1; j <= intNum1+3 ;j++ ) {
//			System.out.print(intNum1 + " X " + i + " = " + intNum1*i + "\t");
//			System.out.print((intNum1+1) + " X " + i + " = " + (intNum1+1)*i + "\t");
//			System.out.print((intNum1+2) + " X " + i + " = " + (intNum1+2)*i + "\t");
//			System.out.print((intNum1+3) + " X " + i + " = " + (intNum1+3)*i + "\t");
//			System.out.println();
				System.out.print(j + " X " + i + " = " + j*i + "\t");;
				
				
				
			}
			System.out.println();
		}
	
	}//main
	
}//Main
