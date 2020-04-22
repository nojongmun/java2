package com.ict.day02;

public class Ex07_main {
	public static void main(String[] args) {
		Ex05 t1 = new Ex05();  // Thread  : start(), run()
		Ex06 t2 = new Ex06();  // Runnable : run()
		
		t1.start();
		
		// Runnable을 상속받은 t2는 start()가 없으므로 
		// Thread 만들어서 넣어야 된다.
		Thread thread = new Thread(t2);
		thread.start();
	} 
}
