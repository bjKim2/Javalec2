package com.javalec.base;

import java.util.Scanner;

public class Registration {
	
	private String id;
	private String pwd;
	
	public Registration() {
		// TODO Auto-generated constructor stub
	}
	
	public void idpwd(int index) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.");
		System.out.print("ID를 입력하세요 :");
		id = scanner.next();
		System.out.print("암호를 입력하세요 :");
		pwd = scanner.next();
		
		DB.id[index] = id;
		DB.pwd[index] = pwd;
	}
}
