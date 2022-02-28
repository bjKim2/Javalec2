package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// API(Application Programming Interface)
		// 개발자들이 편리하게 사용할 수 있도록 정의한 클래스들의 집합
		
		String str1 = "abcdefg";
		String str2 = "HIJKLMN";
		String str3 = "opqrstu";
		String str4 = "    abc    def    ghi    ";
		String str5 = "  abcdefg   ";
	
		System.out.println(str1.concat(str2)); //문자열 합치기
		System.out.println(str1.substring(1)); //문자열 쪼개기 시작지점인덱
		System.out.println(str1.substring(3,5)); //문자열 쪼개기 시작지점 끝지점

		String abc = str1.substring(3,5);
		System.out.println(abc);
		
		System.out.println(str1.length());
		System.out.println(str1.toUpperCase()); // 대문자로 바꾸
		System.out.println(str2.toLowerCase()); // 소문자로 바꾸기 
		
		System.out.println(str1.equals(str5));
		System.out.println(str4.trim()); // 앞이랑 끝 띄어 쓰기 제거

		System.out.println(str1.equals(str5.trim()));
		System.out.println(str1.replace('a', 'Z')); // 특정 글자를 다른 글자로 치환
		System.out.println(str1.replaceAll("abc", "zzzz")); // 특정 문자열을 다른 문자열로 치환
		System.out.println(str1.replaceAll("a", "")); // 특정 문자열 지우기 개편하겠네 
		
	}
	

}
