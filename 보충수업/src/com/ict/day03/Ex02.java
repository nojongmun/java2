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
					// 현재실행중인 스레드을 대기상태로 만드는 메소드
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
			}else {
				// 대기상태에 있는 스레드를 다시 사용할 수 있는 준비상태로 만든다.
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
