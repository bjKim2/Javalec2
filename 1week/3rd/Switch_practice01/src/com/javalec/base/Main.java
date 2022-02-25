package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int score;
		char result;
		System.out.print("점수를 입력하세요 : ");
		
		score = scanner.nextInt();
		if (score >100) {
			System.out.println("점수가 100점을 초과했습니다.");
		}else if(score >=0){
			switch (score/10) {
			case 10:
			case 8:
				result = 'A';
				break;
			case 9:
				result = 'B';
				break;
			case 7:
				result = 'C';
				break;
			case 6:
				result = 'D';
				break;
			default:
				result = 'F';
				break;
			}
			System.out.println("귀하의 학점은 " + result + "입니다.");	
		}else {
			System.out.println("점수가 음수입니다.");
		}
		
		
	}

}
