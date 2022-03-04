package com.javalec.base;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(">>>>> ArrayList <<<<<");

		//<> 는 generic 이고 타입을 쓰는 공간 객체만 들어갈수 있다.
		
		
		
		//구성
		ArrayList<String> arrayList = new ArrayList<String>();
//		ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
		String[] str1 = new String[2];
//		str1[0] = "abc";
//		str1[1] = "abc";
	
		//추가
		arrayList.add("str1");
		arrayList.add("str2");
		arrayList.add("str3");
		arrayList.add("str4");
		
		// 확인하기
//		
		System.out.println(str1);
		//toString 이 디폴트값
		

		//불러오기
		String no1 = arrayList.get(0);
		System.out.println(no1);
		
		ArrayList<String> subList2 = new ArrayList<String>();
		
		//배열에 배열 넣기
		subList2.add("str0");
		subList2.addAll(1,arrayList.subList(1, 3));
		System.out.println(subList2);
		System.out.println(arrayList.subList(1, 3));
		
		//변경하기
		arrayList.set(2, "str222");
		
		//삭제하기
		arrayList.remove(3);
		
		//크기 알기
		int size = arrayList.size();
		System.out.println(size);
		
		//삽입 하기
		System.out.println("");
		
		
		System.out.println(arrayList.toString());
		
		
//		for(int i=1 ; i<=100 ; i++) {
//			arrayList2.add(i);
//		}
//		
//		System.out.println(arrayList2.stream());
	}

}
