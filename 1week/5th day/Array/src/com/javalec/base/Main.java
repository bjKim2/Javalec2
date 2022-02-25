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
		
		String[] str1 = {"sun", "mon", "tue", "wed", "thr", "fri", "sat"};
		int[] intNum = {1, 2, 3};
		double[] doubleNum = {1.1 , 1.2};
		boolean[] boolNum = {true, false, true};
		
		int[] intNum2 = {1,5,8,12,200,1002};
		int sum=0;
		double avg=0;
		for(int i = 0; i < intNum2.length ; i++) {
			sum += intNum2[i];
			avg = (sum / intNum2.length) * 1.0;
		
		}
		System.out.println(avg);
	}

}
