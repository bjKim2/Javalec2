package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int[] kor = new int[4];
		int[] eng = new int[4];
		int[] math = new int[4];
		String[] subject = {"kor","eng","math"};
		
		for(int j=0; j< subject.length; j++) {
			System.out.println(subject[j] + "의 성적을 입력 :");
			for (int i = 0; i<kor.length ; i++) {
				System.out.print("no"+(i+1)+"의 성적을 입력하세요 : ");
				switch(subject[j]) {
				case "kor":
					kor[i] = scanner.nextInt();
					break;
				case "eng":
					eng[i] = scanner.nextInt();
					break;
				case "math":
					math[i] = scanner.nextInt();
					break;
				default:
					break;
						
				}
						
			}
		}
		
		//출력 
		System.out.println("\t     korean \t     english \t   mathematics \t      Total \t      Average");
		
		for (int i = 0; i<kor.length ; i++) {
			//i마다 합계 평균 구하기 
			int total = kor[i] + eng[i] + math[i];
			double avg =total/3.0; 
			
			System.out.println("No" + (i+1) + "\t\t" + kor[i] + "\t\t" + eng[i] + "\t\t" + math[i] + "\t\t" + total + "\t\t" + avg);
			
		}
	}//main

}
