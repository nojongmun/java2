package com.ict.day02;

public class Ex07_main {
	public static void main(String[] args) {
		Ex05 t1 = new Ex05();  // Thread  : start(), run()
		Ex06 t2 = new Ex06();  // Runnable : run()
		
		t1.start();
		
		// Runnable�� ��ӹ��� t2�� start()�� �����Ƿ� 
		// Thread ���� �־�� �ȴ�.
		Thread thread = new Thread(t2);
		thread.start();
	} 
}
