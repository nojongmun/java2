package com.ict.day02;

public class Ex06 implements Runnable{

	@Override
	public void run() {
		while(true) {
		  System.out.println("�߿˾߿� :"+Thread.currentThread().getName());
		}
	}
}
