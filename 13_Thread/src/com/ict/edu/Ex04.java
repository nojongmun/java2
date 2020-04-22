package com.ict.edu;

public class Ex04 {
	public static void main(String[] args) {
		System.out.println("1 : " + Thread.currentThread().getName());
		Ex05 testA = new Ex05();
		Ex06 testB = new Ex06();
		
		// testA, testB�� Runnable ������ ���� �����Ƿ� start()�� ������ ���� �ʴ�.
		// ���࿡ run()����  tsetA, testB�� run()����  �����ϸ�  ������ ó���� �ƴϴ�.
		// Thread���� start()���� start()�� ȣ���ϸ� ������ó���� �ƴ� �Ͱ� ����.
		// testA.run();
		// testB.run();
		
		// start()�� �����尡 ������ �����Ƿ� Thread�� �̿��ؾ� �ȴ�.
		// ���1
		//  new Thread(Runnable target) ; Runnable�� ���� ��ü�� �־� �ּ���
		   Thread  t1 = new Thread(testA);
		   t1.start();
		   
		   new Thread(testB).start();
		   
	     // ���2
		 // �ȵ���̵�� : �͸� ���� Ŭ���� Ȱ���� ������
		  new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("��������:"+Thread.currentThread().getName());
				}
			}
		}).start();
		System.out.println("�����ϼ̽��ϴ�.");
	}
}
