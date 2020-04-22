package com.ict.edu;

public class Ex01 {
	public static void main(String[] args) {
		// 현재 실행 중인 스레드이름 호출
		System.out.println(Thread.currentThread().getName());
		Ex02 t1 = new Ex02();
		Ex03 t2 = new Ex03();
		t1.play();
		t2.play();
		System.out.println("==============");
		// t1, t2는 모두 Thread를 상속 받았으므로  start(), run()를 가지고 있다.
		// start()를 호출하면 run()를 가서 스레드를 생성하고 작업을 실행한다. 
		// 스레드가 여러개 동시에 병행처리 하면 멀티스레드 라고 한다.
		t1.start();
		t2.start();
		System.out.println("수고하셨습니다.");
		
	}
}
