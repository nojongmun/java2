package com.ict.edu;

public class Ex04 {
	public static void main(String[] args) {
		System.out.println("1 : " + Thread.currentThread().getName());
		Ex05 testA = new Ex05();
		Ex06 testB = new Ex06();
		
		// testA, testB는 Runnable 가지고 구현 했으므로 start()는 가지고 있지 않다.
		// 만약에 run()에서  tsetA, testB의 run()으로  실행하면  스레드 처리가 아니다.
		// Thread에서 start()에서 start()를 호출하면 스레드처리가 아닌 것과 같다.
		// testA.run();
		// testB.run();
		
		// start()는 스레드가 가지고 있으므로 Thread를 이용해야 된다.
		// 방법1
		//  new Thread(Runnable target) ; Runnable를 가진 객체를 넣어 주세요
		   Thread  t1 = new Thread(testA);
		   t1.start();
		   
		   new Thread(testB).start();
		   
	     // 방법2
		 // 안드로이드식 : 익명 내부 클래스 활용한 스레드
		  new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("가가가가:"+Thread.currentThread().getName());
				}
			}
		}).start();
		System.out.println("수고하셨습니다.");
	}
}
