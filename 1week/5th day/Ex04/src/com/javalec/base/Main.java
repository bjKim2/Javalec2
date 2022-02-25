package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int inputNum1;
		
		System.out.print("입력할 숫자의 갯수 ?(100개 미만) : ");
		inputNum1 = scanner.nextInt();
		
		
		int max = 0, maxIndex = 0;
		int tmpNum;
		
		System.out.println(inputNum1 + "개의 숫자를 입력하세요!");
		for(int i = 0 ; i < inputNum1 ; i++) {
			tmpNum = scanner.nextInt();
			if(max <= tmpNum) {
				max = tmpNum;
				maxIndex = i +1;
			}
		}
		
		System.out.println("입력한 숫자 중 최대값은 "+ max + "이고 " + maxIndex +"번째 값 입니다. ");
		

	}

}
