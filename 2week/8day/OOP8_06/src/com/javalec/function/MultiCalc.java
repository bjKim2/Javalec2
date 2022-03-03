package com.javalec.function;

public class MultiCalc {

	private int choiceNum;
	private int firstNum,secondNum;
	
//	public MultiCalc(){
//		
//	}
//
//	public MultiCalc(int choiceNum, int firstNum, int secondNum) {
//		super();
//		this.choiceNum = choiceNum;
//		this.firstNum = firstNum;
//		this.secondNum = secondNum;
//	}
//	
	public void Calc(int choiceNum, int firstNum, int secondNum) {
		this.choiceNum = choiceNum;
		this.firstNum = firstNum;
		this.secondNum = secondNum;
	
		
		switch(choiceNum) {
		case 1:
			System.out.printf("%d + %d = %d",firstNum,secondNum,sum());
			break;
		case 2:
			System.out.printf("%d - %d = %d",firstNum,secondNum,sub());
			break;
		case 3:
			System.out.printf("%d * %d = %d",firstNum,secondNum,multiply());
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			break;
		}
	}
	
	private int sum() {
		return firstNum + secondNum;
		
	}
	
	private int sub() {

		return  firstNum - secondNum;

	}
	
	private int multiply() {
		return firstNum * secondNum;
		

	}
	
	
	
	
}
