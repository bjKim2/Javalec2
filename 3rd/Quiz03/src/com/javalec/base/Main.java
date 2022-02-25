package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		int score = scanner.nextInt();
		
		if (score > 100) {
			System.out.println("입력한 점수가 100보다 큽니다.");			
		}else if(score >= 90) {
			System.out.println("귀하는 A학점 입니다.");
		}else if(score >= 80) {
			System.out.println("귀하는 B학점 입니다.");
		}else if(score >= 70) {
			System.out.println("귀하는 C학점 입니다.");
		}else if(score >= 60) {
			System.out.println("귀하는 D학점 입니다.");
		}else if(score >= 0) {
			System.out.println("귀하는 F학점 입니다.");
		}else {
			System.out.println("입력한 점수가 0보다 작습니다.");
		}
		
		
		
		
		
	}

}
