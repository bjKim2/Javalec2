package com.javalec.base;

public class EvenOdd {

	public String evenOdd(int num) {

		String result;
		if(num % 2 ==0) {
			result = "짝수";
		}else {
			result ="홀수";
			
		}
		
		return result;
	}
	
}
