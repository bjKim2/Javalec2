package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] name = {"James", "Cathy" , "Kenny" , "Martin" , "Crystal"};
		
		Scanner scanner = new Scanner(System.in);
		
		int[] hei = new int[name.length];
		int sum=0;
		int maxindex = 0 , minindex= 0;
		double avg = 0;
		for(int i =0; i<name.length; i++) {
			
			System.out.print(name[i] +"의 신장을 입력하세요 : ");
			hei[i] = scanner.nextInt();
			sum += hei[i];
			
			if (hei[maxindex] <= hei[i] ) {
				maxindex = i;
			}
			if (hei[minindex] >= hei[i] ) {
				minindex = i;
			}
		}
		
		avg = sum/name.length * 1.0;
		
		
		
		System.out.println("평균 신장은 : " + avg );
		System.out.println("가장 큰 학생은 : " + name[maxindex] + "이고 그 학생의 키는 " + hei[maxindex] + "입니다.");
		System.out.println("가장 작은 학생은 : " + name[minindex] + "이고 그 학생의 키는 " + hei[minindex] + "입니다.");
		
	}

}
