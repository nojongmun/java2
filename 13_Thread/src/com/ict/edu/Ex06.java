package com.ict.edu;

// run()�� ������ �ִ�.
public class Ex06 implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("1111:"+Thread.currentThread().getName());
		}
	}

}
