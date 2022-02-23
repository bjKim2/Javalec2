package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 선언문
		Scanner scanner = new Scanner(System.in);
		int inputNumber = 0; // 사용자 입력 숫
		String result = "";
		
		// 사용자 입
		System.out.print("숫자를 입력하세요 : ");
		inputNumber = scanner.nextInt();
	
		// 결과 출력 : if 문 사용
//		if(inputNumber % 2 == 0) {
//			result = "짝수";
//		}else {
//			result = "홀수";
//		}
		
		//짝홀수 판단 : switch문 사용
		
		switch(inputNumber % 2) {
		case 0:
			result = "짝수";
			break;
		case 1:
			result = "홀수";
			break;
		default:
				break;
					
		}
		
		System.out.println("입력하신 숫자 " + inputNumber + "은 " + result + "입니다.");
	}

}
