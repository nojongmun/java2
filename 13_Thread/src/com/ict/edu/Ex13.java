package com.ict.edu;

//  5.두 개의 스레드를 생성하여 첫번째 스레드의 출력을 1부터 100까지 출력하고 , 
//    두번째 스레드의 출력값은 101부터 200까지 출력하라 (synchronized 사용)
public class Ex13 implements Runnable{
	int x; 
	@Override
	public synchronized void run() {
		for (int i = 0; i < 100; i++) {
			x++;
			System.out.println(Thread.currentThread().getName()+":"+x);
		}
	}
	public static void main(String[] args) {
		Ex13 test = new Ex13();
		new Thread(test, "dog").start();
		new Thread(test, "cat").start();
	}
}
