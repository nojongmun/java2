package com.ict.edu;

// start(), run()�� ������ ����
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
	//  run()���ٴ� �켱������ �����Ƿ� ��Ƽ �����尡 �ȵȴ�.
	public void start() {
		for (int i = 0; i < 100; i++) {
			System.out.println("aaaa:"+Thread.currentThread().getName());
		}
	}
}
