package com.javalec.base;

public class SumEvenOdd {
	
	public int sumCalc(int ii, int jj) {
		int sum = 0;
		for(int i=ii; i<=jj ; i++) {
			sum+=i;
			
		}
		return sum;
	}
	
	public String evenodd(int kk) {
		int k =kk %2;
		String chk = null;
		if(k==0) {chk = "짝수";}
		else {chk = "홀수";}
		return chk;
		
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1, j = 10;
		SumEvenOdd seo = new SumEvenOdd();
		int sum = seo.sumCalc(i,j);
		String chk =seo.evenodd(sum);
		
		System.out.println(i + " ~ " + j + " 의 합은 " + sum + " 입니다.");
		System.out.println(chk + " 입니다.");
		
	}

}
