package com.javalecc.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int in_count;
		
		// 입력할 갯수 받기
		System.out.print(" 입력할 숫자의 갯수? :");
		in_count = scanner.nextInt();
		int[] db = new int[in_count+1];
		
		
		// 입력 숫자 받기
		for(int i = 0; i < in_count ; i++) {
			System.out.print((i+1) +"의 숫자 :");
			db[i] = scanner.nextInt();
			
		}
		
		
		int in_Index;
		int in_Num;
		// 위치 및 숫자 받기
		System.out.print("숫자를 삽입하고자 하는 위치는 ?");
		in_Index = scanner.nextInt();
		System.out.print("삽입하고자하는 숫자는? ");
		in_Num = scanner.nextInt();
		
		// 배열 한칸씩 밀고 숫자 받
		for(int i = db.length -1; i >= in_Index; i--) {
			
				db[i] = db[i-1];
			
		}
		db[in_Index-1] = in_Num;
		
		
		//출력
		System.out.println("---------- 결과 ----------");
		for(int i = 0 ; i < db.length; i++) {
			System.out.println(db[i]);
		}
		
	}

}
