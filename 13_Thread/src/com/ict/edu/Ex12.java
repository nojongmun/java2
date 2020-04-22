package com.ict.edu;

 // 임계영역 : 멀티스레드에서 공통으로 사용되는 영역
 //          현재 실행 중인 스레드가 순식간에 다른 스레드에게 제어권을 빼앗긴다.
//           이러한 경우 실시간 처리에서는 문제가 발생할 수 있다.
//           이를 해결하기 위한 방법이 동기화 처리이다.

// 동기화 처리 : 임계영역에 synchronized 예약어을 사용하므로써
//            현재 실행 중인 스레드가 끝날때 까지 다른 스레드는 접근 불가 상태(락이 걸린 상태)가 된다.

// 동기화 처리일때  현재 실행중인 스레드를 강제로 대기상태로 변경시키는 메소드 : wait()
// 대기상태를 풀지않으면  해당 스레드 그대로 대기상태에서 끝난다.
// 그래서 대기상태인 스레드를 풀어주는 메소드 : notify(), notifyAll(); 
public class Ex12 implements Runnable {
	int x=0;
	
	// 임계영역
	@Override
	public synchronized void  run() {
	    for (int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread().getName()+":"+(x++));
			if(x == 10) {
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
		Ex12 t1 = new Ex12();
		new Thread(t1, "dog").start();
		new Thread(t1, "cat").start();
		new Thread(t1, "tiger").start();
		new Thread(t1, "lion").start();
	}
}





