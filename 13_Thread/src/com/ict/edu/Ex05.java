package com.ict.edu;

// run()�� ������ �ִ�.
public class Ex05 implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("aaaa:"+Thread.currentThread().getName());
		}
	}

}
