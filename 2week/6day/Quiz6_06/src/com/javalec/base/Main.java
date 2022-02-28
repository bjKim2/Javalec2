package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int select;
		int[] user_Bal = new int[5];
		int user_Num;
		boolean on_off= true;
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		while(on_off) {
			System.out.print("1. 입금 \n2. 출금\n3. 현황\n4. 종료\n 번호를 선택하세요! :");
			
			select = scanner.nextInt();
			
			switch(select) {
			case 1:
				System.out.print("고객 번호 :");
				user_Num = scanner.nextInt();
				System.out.print("금액 : ");
				user_Bal[user_Num-1] += scanner.nextInt();
				System.out.println(String.format("입금 결과 : 고객 번호 : %1d 잔액 : %6d",user_Num,user_Bal[user_Num-1]));
				System.out.println("------------------------------------------------------------------------------------");
				break;
				
			case 2:
				System.out.print("고객 번호 :");
				user_Num = scanner.nextInt();
				System.out.print("금액 : ");
				int price = scanner.nextInt();
				if(user_Bal[user_Num-1] >= price) {
					user_Bal[user_Num-1] -= price;
				}else {
					System.out.println("잔액이 부족합니다!");
				}
				System.out.println(String.format("입금 결과 : 고객 번호 : %1d 잔액 : %6d",user_Num,user_Bal[user_Num-1]));
				System.out.println("------------------------------------------------------------------------------------");
				break;
				
			case 3:
				System.out.println("\t\t 고객명\t 잔액");
				System.out.println("\t\t ----\t ----");
				for(int i = 0; i <5 ; i++) {
					System.out.println("\t\t " + (i+1) + "\t" +user_Bal[i]);
					
				}
				System.out.println("------------------------------------------------------------------------------------");
				break;
			
			case 4:
				System.out.println(">>>> thanks you <<<<");
				on_off = false;
				break;
				
				
			default:
				break;
			
			}
			
		
		}
		
		
		
	}

}
