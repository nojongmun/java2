package com.ict.edu;

// start(), run()를 가지고 있음
public class Ex02 extends Thread{
	public void play() {
		System.out.println(Thread.currentThread().getName());
	}
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("aaaa:"+Thread.currentThread().getName());
		}
	}
	//  run()보다는 우선순위가 있으므로 멀티 스레드가 안된다.
	public void start() {
		for (int i = 0; i < 100; i++) {
			System.out.println("aaaa:"+Thread.currentThread().getName());
		}
	}
}
