package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		//변수 선언 
		int score = 0 ;
		String histo[] = new String[10];
		
		
		// null 값 리셋
		for (int i=0; i<10 ; i++) {
			histo[i] = "";
		}
		
		//데이터 받기(for문) score 앞자리수로 대상 히스토그램 배열에 '#'추가  
		System.out.println("Input score :");
		for(int i = 0; i < histo.length; i++) {
			
			System.out.print( (i+1) + "회 score :");
			histo[scanner.nextInt()/10] += "#" ;
		}
		scanner.close();
		
		
		
		// 출력 
		System.out.println("------------- Histogram -------------");
		for(int i = histo.length-1; i >= 0;i--) {
			System.out.print(String.format("%3d :", i*10));

			System.out.println(histo[i]); 
		}
		
	}//main

}//Main
