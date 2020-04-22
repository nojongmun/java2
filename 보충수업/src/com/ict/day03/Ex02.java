package com.ict.day03;

public class Ex02 implements Runnable{
	int x;
	@Override
	public synchronized void run() {
		for (int i = 0; i < 100; i++) {
			x++;
			System.out.println(Thread.currentThread().getName()+": x="+x);
			if(x==50 || x==100) {
				try {
					// ����������� �������� �����·� ����� �޼ҵ�
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
			}else {
				// �����¿� �ִ� �����带 �ٽ� ����� �� �ִ� �غ���·� �����.
				notify();
			}
		}
	}
	public static void main(String[] args) {
		Ex02 test = new Ex02();
		
		new Thread(test).start();
		new Thread(test).start();
	}
}
