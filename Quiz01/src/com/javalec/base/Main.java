package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int price;

		System.out.print("금액을 입력하세요 : ");
		price = scanner.nextInt();

		if (price > 8000) {
			System.out.println("금액이 너무 비쌉니다");
		} else if (price > 5000) {
			System.out.println("금액이 조금 비쌉니다");
		} else if (price > 3000) {
			System.out.println("금액이 조금 비쌉니다");
		} else {
			System.out.println("싼편 입니");
		}
	}

}
