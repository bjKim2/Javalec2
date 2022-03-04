package com.javalec.base;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Customer> customers = new ArrayList<Customer>();
		Customer customer = new Customer(1,"James","010-1111-2222");
		Customer customer2 = new Customer();
		customer2.setNumber(2);
		customer2.setName("Cathy");
		customer2.setPhone("010-1234-1234");
		
		//데이터 넣기
		customers.add(customer);
		customers.add(customer2);
		
		//-------
		int[] number = {3,4,5};
		String[] name = {"유비","관우" , "장비"};
		String[] phone = {"010-1234-3333", "010-1234-4444", "010-1234-5555"};
		
		for(int i =0; i< number.length ; i++) {
//			Customer customer3 = new Customer(number[i], name[i],phone[i]);
			customers.add(new Customer(number[i], name[i],phone[i]));
		}
		
		
		customers.add(customer);
		
		System.out.println(customers.get(0).getNumber() + " ㅣ " + customers.get(0).getName() + " ㅣ " + customers.get(0).getPhone());
		System.out.println(customers.get(1).getNumber() + " ㅣ " + customers.get(1).getName() + " ㅣ " + customers.get(1).getPhone());
		System.out.println(customers.get(2).getNumber() + " ㅣ " + customers.get(2).getName() + " ㅣ " + customers.get(2).getPhone());
		System.out.println(customers.get(3).getNumber() + " ㅣ " + customers.get(3).getName() + " ㅣ " + customers.get(3).getPhone());
		
		System.out.println(customers.get(1).getClass());
	}

}
