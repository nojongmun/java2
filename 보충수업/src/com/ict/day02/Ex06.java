package com.ict.day02;

public class Ex06 implements Runnable{

	@Override
	public void run() {
		while(true) {
		  System.out.println("具克具克 :"+Thread.currentThread().getName());
		}
	}
}
