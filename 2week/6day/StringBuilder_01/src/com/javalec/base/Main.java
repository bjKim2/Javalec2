package com.javalec.base;

import com.javalec.function.Multiply;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder stringBuilder = new StringBuilder("abcdefg");
		StringBuffer stringBuffer = new StringBuffer("abcdefg");
		
		stringBuilder.append("hijklmn");
		System.out.println(stringBuilder);
		
		stringBuilder.insert(3, "ZZZ");
		System.out.println(stringBuilder);
		
		stringBuilder.delete(3, 6);
		System.out.println(stringBuilder);
		Multiply multiply = new Multiply();
		multiply.multiply();
	}

}
