package com.ict.edu5;

// ���� ��Ӱ���
public class Character implements Action, Move, Fight {
	static int en = 100 ;
	private String name;
	// ������
	public Character(String name) {
		this.name = name;
	}
	@Override
	public void attack() { 
		System.out.println(name + ">>" + "����");
	}

	@Override
	public void shield() {
		System.out.println(name + ">>" + "���");
	}

	@Override
	public void walk() {
		System.out.println(name + ">>" + "�ȴ�");
	}

	@Override
	public void run() {
		System.out.println(name + ">>" + "�ٴ�");
	}

	@Override
	public void jump() {
		System.out.println(name + ">>" + "����");
	}

	@Override
	public void pickUp() {
		System.out.println(name + ">>" + "�������� �ݴ�.");
	}

}
