package com.ict.edu;

//5. 두개의 스레드를 생성하여 첫번째 스레드의 출력을 1부터 50까지 출력하고 , 
//   두번째 스레드의 출력값은  51부터 100까지 
//   다시 첫번째 스레드가 101부터 150까지 두번째 스레드가 151부터 200까지  출력하라
//   반드시 wait(), notify() 사용
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
