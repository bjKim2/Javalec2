package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i =1, j=10;
		
		Sum sum = new Sum();
		EvenOdd a = new EvenOdd();
		
		int sum2 = sum.sumCalc(i, j);
		String result2 = a.evenOdd(sum2);
		
		
		System.out.println(i + " ~ " + j + " 의 합은  " + sum2 + "입니" );
		System.out.println(result2 + " 입니다.");
	}

}
