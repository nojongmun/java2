package com.ict.edu2;

// 생산자
public class Producer implements Runnable{
	private Car car;
	// 생성자에서 받은 인자는 보통 전역변수로 만들어 준다.
	public Producer(Car car) {
		this.car = car ;
	}
	@Override
	public void run() {
		String carName = null ;
		for (int i = 0; i < 50; i++) {
			// car 생성
			carName = car.getCat();
			// 생성된 car를 리스트에 넣는 메소드
			car.push(carName);
			try {
				Thread.sleep((int)(Math.random()*300));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
