package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.Gugudan;

public class Main {
	
		String[] dan = new String[9];
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int in_num1;
		String[] gugu=new String[9];
		
		System.out.print("구구단을 출력할 숫자를 입력하세요 :");
		in_num1 = scanner.nextInt();
		
		Gugudan gugudan = new Gugudan(in_num1);
		gugu = gugudan.gugudan();
		
		for(int i=0;i<9;i++) {
			System.out.println(gugu[i]);
		}
		
	}
	
//	public void gugudan(int in_num1) {
//		
//		for(int i = 1; i<=9 ; i++) {
//		System.out.println(String.format("%1d X %1d = %2d", in_num1, i, in_num1 * i));
//		}
//	
//	}
//	
//	public String[] gugudan(int in_num1) {
//		
//		for(int i= 0; i<9 ;i++ ){
//			dan[i] = String.format("%1d X %1d = %2d",in_num1,(i+1),in_num1*(i+1));
//			
//		}
//		
//		return dan;
//	}

}
