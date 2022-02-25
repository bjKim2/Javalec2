package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1부터 10까지의 수중 홀수만 출력하기
		int oddsum = 0;
		int evensum = 0;
		
		
		for(int i= 1; i<=100 ; i++ ) {
			switch(i%2) {
			case 0:
				evensum +=i;
				break;
			default:
				oddsum +=i;
				break;
			}
		}
		
		System.out.println("1부터 100까지 짝수의 합은 " + evensum + "이고 홀수의 합은 " + oddsum + "입니다.");
	}

}
