package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intNum1 = {5,3,9};
		
		for(int j = 0 ; j <=2 ; j++) {
			
			for(int i = 1 ; i<=9; i++) {
				System.out.print(intNum1[j] + " X " + i +" = " + i * intNum1[j] +	"\t");
				
			}
			System.out.println();
		}
	}

}
