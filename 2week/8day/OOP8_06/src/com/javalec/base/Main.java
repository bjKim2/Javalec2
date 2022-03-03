package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.MultiCalc;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner =new Scanner(System.in);
		int choiceNumber;
		int firstNum, secondNum;
		
		
		System.out.println("1. 덧셈");
		System.out.println("2. 뺄셈");
		System.out.println("3. 곱셈");
		System.out.print("\n번호를 선택 하세요 :");
		
		choiceNumber = scanner.nextInt();
		System.out.println("첫번쨰 숫자를 입력하세요.");
		firstNum = scanner.nextInt();
		System.out.println("두번쨰 숫자를 입력하세요.");
		secondNum = scanner.nextInt();
		
		
		MultiCalc multi = new MultiCalc();
		multi.Calc(choiceNumber, firstNum, secondNum);
		
		
	}

}
