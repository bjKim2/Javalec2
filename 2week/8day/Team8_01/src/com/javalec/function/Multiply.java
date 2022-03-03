package com.javalec.function;

import java.util.Scanner;

public class Multiply {
	
	// 스캔할 변수 2개 선언
	private int in_num1,in_num2;
	
	
	
	// 생성자는 디폴트값으로
//	public Multiply() {
//		
//	}
//
//	
//	public Multiply(int in_num1, int in_num2) {
//		super();
//		this.in_num1 = in_num1;
//		this.in_num2 = in_num2;
//	}

	
	// 범위 곱셈 및 출력 메소드
	public void multiply(){
		
		Scanner scanner = new Scanner(System.in);
		
		int result=1;
		
		System.out.print("- 시작할 수를 입력하세요:");
		in_num1 = scanner.nextInt();
		System.out.print("- 끝마칠 수를 입력하세요:");
		in_num2 = scanner.nextInt();
		
		for (int i = in_num1; i<=in_num2;i++) {
			result *= i;
			
		}
		
		System.out.println("(결과)\n"+ result);
		System.out.println("------------------------------------");
		
	}
	

}
