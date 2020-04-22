package com.ict.day02;

public class Ex05 extends Thread{
	@Override
	public void run() {
	  while(true) {
		 System.out.println("¸Û¸Û¸Û : " + Thread.currentThread().getName());
	  }
	}
}
