package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.Addition;
import com.javalec.function.Calculation_U0_0303;
import com.javalec.function.Multiply;
import com.javalec.function.RangeGugudan;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int in_num1,in_num2;
		int select;
		boolean on_off = true;
		
		Scanner scanner = new Scanner(System.in);
		
		Main main = new Main();
		Multiply multiply = new Multiply();
		Addition addition = new Addition();
		RangeGugudan gugudan = new RangeGugudan();
		Calculation_U0_0303 calc = new Calculation_U0_0303();
		
		
		
		
		
		while(on_off) {
			
			main.print();
			System.out.print("\n ==> 선택 :");
			select = scanner.nextInt();
			switch(select) {
			case 1:
				calc.ment();
				calc.addsub();
				break;
			case 2:
				calc.ment();
				calc.multidiv();
				break;
			case 3:
				addition.addAction();
				break;
			case 4:
				multiply.multiply();
				break;
			case 5:
				gugudan.viewGugudan();
				break;
			case 6:
				System.out.println(">>>>> 종료합니다. <<<<<");
				on_off = false;
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				System.out.println(">>>>> 종료합니다. <<<<<");
				on_off = false;
				break;
					
			}
			
			
		}
		
		
		
		

	}
	
	public void print(){
		System.out.println("원하는 기능을 선택하세요");
		System.out.println("\n1. 덧셈,뺄셈\n2. 곱셈,나눗셈\n3. 범위의 합계구하기");
		System.out.println("4. 범위의 곱셈 구하기\n5. 범위의 구구단 구하기\n6. 종료");
	}

}
