package com.javalec.base;

public class Sum {

	//Field (Property)
	
	//Constructor
	public Sum() {
		
	}
	
	//Method
	//합계를 구하는 Method
	public int sumCalc(int startNum, int endNum)
	{
		int sum = 0;
		for(int i = startNum; i<=endNum ; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	//홀짝 판단하는 Method

	public String evenOdd(int sum) {
		int checkNum = sum%2;
		String str = "";
		
		if(checkNum ==0) {
			str = "짝수";
		}else {
			str = "홀수";
		}
		
		return str;
		
	}
	


}
