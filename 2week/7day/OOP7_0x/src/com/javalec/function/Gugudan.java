package com.javalec.function;

public class Gugudan {
	
	
	//field
	public int in_num1;
	public String[] dan = new String[9];
	
	
	
	//constructor
	public Gugudan() {
		
	}
	
	
	
	public Gugudan(int in_num1) {
		super();
		this.in_num1 = in_num1;
	}



	//function
	public String[] gugudan() {
		
		for(int i= 0; i<9 ;i++ ){
			if(i%2 ==1) {
			dan[i] = String.format("%1d X * = %2d",in_num1,(i+1),in_num1*(i+1));
			}else {
			dan[i] = String.format("%1d X %1d = %2d",in_num1,(i+1),in_num1*(i+1));		
			}
		}
		
		
	return dan;
	}
	
}
