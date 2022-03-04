package com.javalec.base;

public class FirstSon {
	
	public FirstSon() {
		// TODO Auto-generated constructor stub
	}
	
	public void takechoco(){
		
//		MamaBag bag = new MamaBag();
//		bag.choco = bag.choco - 1;
//		
//		if (bag.choco < 0 ) {
//			System.out.println("첫쨰는 초코파이 먹고 싶아요!");
//		}else {
//			System.out.println("첫쨰는 맛있게 먹었어요.");
//		}
		
		
		MamaBag.choco = MamaBag.choco -1;
		
		if(MamaBag.choco <0) {
			System.out.println("첫쨰는 초코파이 먹고 싶아요!");
		}else {
		System.out.println("첫쨰는 맛있게 먹었어요.");
		}
		
		
	}

}
