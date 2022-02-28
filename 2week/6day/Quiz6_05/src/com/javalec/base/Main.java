package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int in_count;
		
		// 입력할 갯수 받기
		System.out.print(" 입력할 숫자의 갯수? :");
		in_count = scanner.nextInt();
		int[] db = new int[in_count];
		
		
		// 입력 숫자 받기
		for(int i = 0; i < in_count ; i++) {
			System.out.print((i+1) +"의 숫자 :");
			db[i] = scanner.nextInt();
		}
		
		int del_Index;
		System.out.print("몇 번째 숫자를 삭제 하시겠습니까? :");		
		del_Index = scanner.nextInt();
		
		for (int i= del_Index;i < db.length;i++) {
			db[i-1] =db[i];
		}
		
		System.out.println("---------- 결과 -----------");
		for(int i =0 ; i<db.length -1 ; i++) {
			System.out.println(db[i]);
		}
		

	}

}
