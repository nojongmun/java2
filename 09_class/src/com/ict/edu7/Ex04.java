package com.ict.edu7;

// 2. Local ���� Ŭ����
public class Ex04 {
	 int su1 = 10 ;
	 
	 public Ex04() {
		System.out.println("�ܺ�Ŭ���� ������ : " + this);
	}
	 
	 public void sound() {
		 System.out.println("�ܺ�Ŭ���� �Ϲ� �޼ҵ�");
	 }
	 
	 public void play() {
		int number = 2019;
		System.out.println("�ܺ�Ŭ�����޼ҵ�1");
		class In_Ex04{
			int k1 = 100 ;
			
			public In_Ex04() {
				System.out.println("����Ŭ���� ������ : " +this);
			}
			
			public void prn() {
				System.out.println(su1);
				System.out.println(number);
				System.out.println(k1);
			}
			
		} // class end
		In_Ex04 ex = new In_Ex04();
		ex.prn();
		System.out.println("�ܺ�Ŭ�����޼ҵ�2");
	 } // play() end
}



