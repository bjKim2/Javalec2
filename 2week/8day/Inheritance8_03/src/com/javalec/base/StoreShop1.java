package com.javalec.base;

public class StoreShop1 extends StoreHQ {

	//Field
	
	//Constructor
	public StoreShop1() {
		// TODO Auto-generated constructor stub
	}
	
	//Method
	
	//김치찌개 4,500원
	@Override
	public void orderKim() {
		// TODO Auto-generated method stub
		System.out.println("김치찌개 : 5,000원");
	//	super.orderKim();
	}
	
	// 부대찌개 5,000원
	@Override
	public void orderBu() {
	
		// TODO Auto-generated method stub
		System.out.println("부대찌개 : 5,000원");
	//	super.orderBu();
	}
	
	
	//순대국 : 판매하지않습니다.
	
	@Override
	public void orderSoon() {
		// TODO Auto-generated method stub
		System.out.println("판매 하지 않습니다.");
	//	super.orderSoon();
	}
	
}
