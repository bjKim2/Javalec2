package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		StringBuilder result = new StringBuilder();
		
		for(int i=1 ; i<=10 ; i++) {
			sum +=i;
		}
		
		if(sum % 2 ==0) {
			result.append("짝수");
			
		}else {
			result.append("홀수");
		}
		System.out.println(result);
	}

}
