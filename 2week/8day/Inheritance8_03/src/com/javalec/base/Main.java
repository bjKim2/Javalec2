package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		StoreHQ hq = new StoreHQ();
//		StoreShop1 shop1 = new StoreShop1();
//		StoreShop2 shop2 = new StoreShop2();
//		StoreShop3 shop3 = new StoreShop3();

		StoreHQ[] store = {new StoreHQ(), new StoreShop1(), new StoreShop2() , new StoreShop3()};

		
		for (int i = 0 ; i<=3  ; i++) {
			store[i].orderKim();
			store[i].orderBu();
			store[i].orderSoon();
			System.out.println("=========================");
		}
		
//		shop1.orderKim();
//		shop1.orderBu();
//		shop1.orderSoon();
//
//		System.out.println("=========================");
//		
//		shop2.orderKim();
//		shop2.orderBu();
//		shop2.orderSoon();
//		
//		System.out.println("=========================");
//		
//		shop3.orderKim();
//		shop3.orderBu();
//		shop3.orderSoon();
		
	}

}
