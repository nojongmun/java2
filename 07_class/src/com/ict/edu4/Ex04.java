package com.ict.edu4;

public class Ex04 {
	public static void main(String[] args) {
		Ex03 test1 = new Ex03();
		System.out.println("�̸� : " +test1.name);
		System.out.println("���� : " +test1.age);
		System.out.println("===============");
		
		Ex03 test2 = new Ex03("�Ѹ�");
		System.out.println("�̸� : " +test2.name);
		System.out.println("���� : " +test2.age);
		System.out.println("===============");
		
		Ex03 test3 = new Ex03(27);
		System.out.println("�̸� : " +test3.name);
		System.out.println("���� : " +test3.age);
		System.out.println("===============");
		
		Ex03 test4 = new Ex03("����",3);
		System.out.println("�̸� : " +test4.name);
		System.out.println("���� : " +test4.age);
		System.out.println("===============");
		
		
	}
}
