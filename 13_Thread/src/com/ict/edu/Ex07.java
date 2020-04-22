package com.ict.edu;

public class Ex07 {
	public static void main(String[] args) {
		System.out.println("���� : " + Thread.currentThread().getName());
		
		Ex08 testA = new Ex08();
		Ex09 testB = new Ex09();
   	   
		Thread t1 = new Thread(testA);
		Thread t2 = new Thread(testB);
		
		t1.start();
		t2.start();
		 // join() : ���� ������� join()�� ȣ���� �����尡 ���������� ������ �����¿� ������.
		 //          ��, join()�� ȣ���� �����尡 ������ �ٽ� ������ �� �ִ�.
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("���� : " + Thread.currentThread().getName());
	}
}
