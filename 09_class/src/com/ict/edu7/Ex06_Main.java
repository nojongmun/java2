package com.ict.edu7;

public class Ex06_Main {
	public static void main(String[] args) {
		Ex06_body cafe = new Ex06_body();
		
		cafe.cafe(new Ex06() {
			@Override
			public void setMenu(String[] menu) {
				cafe.setMenu(menu);
			}
			
			@Override
			public void sell(String choice) {
				for (int i = 0; i < cafe.getMenu().length; i++) {
					if(cafe.getMenu()[i].equals(choice)) {
						// sum = sum + i ; 
						// cafe.income = cafe.incom + cate.price ;
						cafe.setIncome(cafe.getIncome()+cafe.getPrice()[i]);
					}
				}
			}
			
			@Override
			public String[] getMenu() {
				return cafe.getMenu();
			}
		});
		
		System.out.println("īǪġ�� �ֹ� �ϼ�");
		System.out.println("���� ���� : " + cafe.getIncome());
	}
}
