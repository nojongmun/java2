package com.ict.edu;

//5. �ΰ��� �����带 �����Ͽ� ù��° �������� ����� 1���� 50���� ����ϰ� , 
//   �ι�° �������� ��°���  51���� 100���� 
//   �ٽ� ù��° �����尡 101���� 150���� �ι�° �����尡 151���� 200����  ����϶�
//   �ݵ�� wait(), notify() ���
public class Ex14 implements Runnable{
	int x; 
	@Override
	public synchronized void run() {
		for (int i = 0; i < 100; i++) {
			x++;
			System.out.println(Thread.currentThread().getName()+":"+x);
			if(x==50 || x ==100) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else {
				notify();
			}
		}
	}
	public static void main(String[] args) {
		Ex14 test = new Ex14();
		new Thread(test, "dog").start();
		new Thread(test, "cat").start();
	}
}
