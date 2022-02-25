package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intNum1 = {5,3,9};
		
		for(int i = 1 ; i<=9; i++) {
			System.out.print(intNum1[0] + " X " + i +" = " + i * intNum1[0] +	"\t");
			System.out.print(intNum1[1] + " X " + i +" = " + i * intNum1[1] +	"\t");
			System.out.print(intNum1[2] + " X " + i +" = " + i * intNum1[2] +	"\t");
			System.out.println();
		}

	}

}
