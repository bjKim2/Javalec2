package com.javalec.base;

public class DB {
	

	protected static String[] id = new String[100];
	protected static String[] pwd = new String[100];
	String[] pair = new String[2];
	public DB() {
		// TODO Auto-generated constructor stub
	
	}


	public void db(int index) {
		pair[0] = id[index]; 
		pair[1] = pwd[index]; 
		
	}
	
	

}
