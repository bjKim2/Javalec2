package com.javalec.base;

public class StoreShop1 extends StoreHQ{
	
	public StoreShop1() {
		
	}
	
	@Override
	public void orderKim() {

		System.out.println("김치찌개 : 4,500원");
	}
	
	
	@Override
	public void orderBu() {
		System.out.println("부대찌개 : 5,000원");
	}
	
	@Override
	public void orderSoon() {
		System.out.println("순대국 : 판매하지 않습니다.");
	}

	@Override
	public void orderBi() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void orderKong() {
		// TODO Auto-generated method stub
		
	}
	
}
