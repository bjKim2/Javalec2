package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str = new String[7];
		
		str[0] = "일요일";
		str[1] = "월요일";
		str[2] = "화요일";
		str[3] = "수요일";
		str[4] = "목요일";
		str[5] = "금요일";
		str[6] = "토요일";
				
		for(int i=1 ; i<str.length ; i+=2) {
			System.out.println(str[i]);
		}
		
	}

}
