package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double hei;
		double wei;
		double bmi;
		boolean error = false;

		Scanner scanner = new Scanner(System.in);

		System.out.print("신장(cm)을 입력하세요 : ");
		hei = scanner.nextDouble();
		System.out.print("몸무게를(kg)을 입력하세요 : ");
		wei = scanner.nextDouble();

		if (hei > 300) {
			System.out.println("키를 너무 크게 입력하셨습니다.");
			error = true;
		} else if (hei <= 0) {
			System.out.println("키를 잘 입력하셨습니다.");
			error = true;
		}

		if (wei > 600) {
			System.out.println("몸무게를 너무 크게 입력하셨습니다.");
			error = true;
		} else if (wei <= 0) {
			System.out.println("몸무게를 잘못 입력하셨습니다.");
			error = true;
		}

		if (error) {
			System.out.println("다시 실행하십시오.");

		} else {
			

			bmi = wei / Math.pow(hei / 100, 2);

			System.out.println(bmi);

			if (bmi >= 35) {
				System.out.println("당신은 초고도 비만 입니다.");
			} else if (bmi >= 30) {
				System.out.println("당신은 고도 비만 입니다.");
			} else if (bmi >= 25) {
				System.out.println("당신은 비만 입니다.");
			} else if (bmi >= 23) {
				System.out.println("당신은 과체중 입니다.");
			} else if (bmi >= 18.5) {
				System.out.println("당신은 정상 체중 입니다.");
			} else if (bmi >= 1) {
				System.out.println("당신은 저체중입니다.");
			} else {
				System.out.println("bmi가 0이하로 측정됩니다.");
			}
		}
	}

}
