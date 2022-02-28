package com.javalec.base;

public class Sum {
	
	
	public int sumCalc(int startNum,int endNum) {
		int result = 0;
		
		for(int i = startNum;i<=endNum;i++) {
			result += i;
		}
		
		return result;
	}

}
