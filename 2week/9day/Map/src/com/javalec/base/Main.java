package com.javalec.base;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(0, "str0");
		hashMap.put(10, "str1");
		hashMap.put(20, "str2");
		hashMap.put(30, "str3");
		
		
		
		System.out.println(hashMap);
		System.out.println(hashMap.get(20));
		
		HashMap<String, String> hashMap1 = new HashMap<String, String>();
		hashMap1.put("apple", "사과");
		hashMap1.put("banana", "바나나");
		hashMap1.put("melon", "멜론");
		hashMap1.put("strawberry", "딸기");
		
		
		
		System.out.println(hashMap1);
		System.out.println(hashMap1.get("melon"));
		
	}

}
