package com.ict.edu3;

public class Ex02 {
	public static void main(String[] args) {
     // ��ü ���� ��� : 		
	 // Ŭ����  �������� = new ������	
	 	Ex01  test = new Ex01();
		
		System.out.println(test.getName());
		System.out.println(test.getAge());
		System.out.println(test.getAdd());
		
		// ������� �����͸� ������ �� �ִ�.: setter()
		test.setName("�±Ǻ���");
		test.setAge(35);
		test.setAdd("�Ѱ� ���� ��");
		System.out.println("=================");
		
		System.out.println(test.getName());
		System.out.println(test.getAge());
		System.out.println(test.getAdd());
		System.out.println("=================");
		
		Ex01 test2 = new Ex01("�����", 28, "����");
		System.out.println(test2.getName());
		System.out.println(test2.getAge());
		System.out.println(test2.getAdd());
		System.out.println("=================");
	}
}
