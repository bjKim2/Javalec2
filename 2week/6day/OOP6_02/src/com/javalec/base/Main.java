package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int startNum = 1,endNum = 10;
		
		Sum sumCalc = new Sum();
		
		int sum = sumCalc.sumCalc(startNum,endNum);
		System.out.println(sum);
		
	}

}
