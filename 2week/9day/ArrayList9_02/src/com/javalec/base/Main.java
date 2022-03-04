package com.javalec.base;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int in_num1;
		int del_ind;
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력할 숫자의 갯수? :");
		in_num1 = scanner.nextInt();
		System.out.printf("%d개의 숫자를 입력하세요!:\n",in_num1);
		
		for(int i = 1; i<= in_num1 ; i++) {
			System.out.printf("%d의 숫자:",i);
			arrayList.add(scanner.nextInt());
			
		}
		
		System.out.print("몇 번째 숫자를 삭제 시키겠습니까? :");
		del_ind = scanner.nextInt();
		arrayList.remove(del_ind-1);
		System.out.println("----- 결과 -----");
		for(int i= 0 ; i< arrayList.size() ; i++) {
			System.out.println(arrayList.get(i));
			
		}
		

	}

}
