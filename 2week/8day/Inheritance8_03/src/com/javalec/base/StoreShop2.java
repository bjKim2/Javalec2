package com.javalec.base;

public class StoreShop2 extends StoreHQ {
	
	//Field
	
	// 부대찌개 : 5,000원
	// 비빔밥 : 5,000원
	// 순대국 : 4,000원
	// 공기밥 : 무료입니다.
	
	public StoreShop2() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void orderBu() {
		System.out.println("부대찌개 : 5,000원");
	}
	
	@Override
	public void orderBi() {
		System.out.println("비밤밥 : 5,000원");
	}
	
	@Override
	public void orderSoon() {
		System.out.println("순대국 : 4,000원");
	}
	
	@Override
	public void orderKong() {
		System.out.println("공기밥 : 무료 입니다.");
	}
}



