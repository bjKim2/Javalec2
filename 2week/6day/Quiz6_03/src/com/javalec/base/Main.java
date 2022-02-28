package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int in_count;
		System.out.print(" 입력할 숫자의 갯수? :");
		in_count = scanner.nextInt();
		int[] db = new int[in_count];
		
		
		for(int i = 0; i < in_count ; i++) {
			System.out.print((i+1) +"의 숫자 :");
			db[i] = scanner.nextInt();
			
		}
		
		
		int searchNum;
		int index=0;
		boolean answer = false;
		
		System.out.print("검색할 숫자는? :");
		searchNum = scanner.nextInt();
		for(int i = 0;i < db.length ; i++) {
			if(db[i] == searchNum) {
				index = i+1;
				answer = true;
			}
		}
		if(answer) {
			System.out.println(searchNum + "의 위치는 " + index + "번째 입니다.");
		}else {
			System.out.println(searchNum +"은 존재하지 않습니다.");
		}
	}

}
