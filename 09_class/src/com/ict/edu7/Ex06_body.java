package com.ict.edu7;

public class Ex06_body {
	private String[] menu = {"�Ƹ޸�ī��","����Ƽ","īǪġ��"};
	private int[] price = {5000,8000,9000};
	private int income ;
	
	String choice = "īǪġ��";

	// �͸�  Ŭ���� ���� �����
	public void cafe(Ex06 c) {
		c.setMenu(menu);
		System.out.println("ī�� ��� �Ϸ�");
		System.out.println("===== MENU =====");
		// �޴�ǥ��
		for (int i = 0; i < c.getMenu().length; i++) {
			System.out.println(i+1+ "." + c.getMenu()[i]);
		}
		c.sell(choice);
	}
	
	public String[] getMenu() {
		return menu;
	}

	public void setMenu(String[] menu) {
		this.menu = menu;
	}

	public int[] getPrice() {
		return price;
	}

	public void setPrice(int[] price) {
		this.price = price;
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	public String getChoice() {
		return choice;
	}

	public void setChoice(String choice) {
		this.choice = choice;
	}
}
