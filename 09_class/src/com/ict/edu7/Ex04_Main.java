package com.ict.edu7;

public class Ex04_Main {
	public static void main(String[] args) {
		// Local ����Ŭ���� �ܵ��� ��ü ���� �ȵ�
		// In_Ex04 test = new In_Ex04();
		
		// Member ����Ŭ���� ó�� ���� �ȵ�
		// Ex04.InEx04 test1 = new Ex04().new In_Ex04() ;
		
		// Local �ܺ�Ŭ���� �޼ҵ�ȿ� �����ϹǷ� 
		// �ܺ�Ŭ���� �޼ҵ带 �����ؾ� ���� ������ �ȴ�.
		Ex04 test = new Ex04();
		test.play();
		System.out.println("�����ϼ˽��ϴ�.");
	}
}
