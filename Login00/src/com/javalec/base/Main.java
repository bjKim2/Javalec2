package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String id;
		String pw;
		
		
		System.out.println("******* log in check *******");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("User id : ");
		id = scanner.next();
		
		System.out.print("Password : ");
		pw = scanner.next();
		
		if ((id.equals("root")) && (pw.equals("1234"))) {
			System.out.println("** 환영 합니다. **");
		}else if(!(id.equals("root"))){
			System.out.println("** 등록된 사용자가 아닙니다. **");
		}else if((id.equals("root")) && !(pw.equals("1234"))){
			System.out.println("패스워드가 틀립니다.");
			
		}
	
	}

}
