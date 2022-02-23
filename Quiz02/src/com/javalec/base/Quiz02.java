package com.javalec.base;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int korean;
		int english;
		int math;
		int error = 0;
		
		System.out.print("국어 점수를 입력하세요:");
		korean = scanner.nextInt();
		if (korean > 100) { // 점수가 100점 이상일떄 오류 발생 
			System.out.println("국어 점수가 100점을 넘었습니다 다시 실행하세요");
			error =1;
			
		}else if(korean< 0) { // 점수가 0점 이하일 때 음수 오류 발생 
			System.out.println("국어 점수가 음수 입니다. 다시 실행하세요");
			error = 1;
		}
		
		System.out.print("영어 점수를 입력하세요:");
		english = scanner.nextInt();
		if (english > 100) {
			System.out.println("영어 점수가 100점을 넘었습니다 다시 실행하세요");
			error =1;
		}else if(english< 0) {
			System.out.println("영어 점수가 음수 입니다. 다시 실행하세요");
			error =1;
		}
		
			
		System.out.print("수학 점수를 입력하세요:");
		math = scanner.nextInt();
		if (math > 100) {
			System.out.println("수학 점수가 100점을 넘었습니다 다시 실행하세요");
			error =1;
		}else if(math< 0) {
			System.out.println("수학 점수가 음수 입니다. 다시 실행하세요");
			error =1;
		}
		
		
		if(error != 1) { // 오류가 발생 안했을 때만 출력
			double avg = (korean + english + math)/3.0;
			
			
			System.out.println("평균 점수 : " + avg);
			
			if(korean > avg) {
				System.out.println("국어 점수는 평균보다 높습니다");
			}else if(korean == avg){
				System.out.println("국어 점수는 평균 점수입니다");
			}else {
				System.out.println("국어 점수는 평균보다 낮습니다.");
			}
			
			if(english > avg) {
				System.out.println("영어 점수는 평균보다 높습니다.");
			}else if(english == avg){
				System.out.println("영어 점수는 평균 점수입니다.");
			}else {
				System.out.println("영어 점수는 평균보다 낮습니다.");
			}
			
			if(math > avg) {
				System.out.println("수학 점수는 평균보다 높습니다.");
			}else if(math == avg){
				System.out.println("수학 점수는 평균 점수입니다.");
			}else {
				System.out.println("수학 점수는 평균보다 낮습니다.");
			}
		}else if (error ==1) { // 오류 발생시 종료 
			System.out.println("점수 입력 오류로 종료합니다 ");
		}

	}

}
