package com.ict.edu2;

// �߻� Ŭ���� : �߻�޼ҵ带 �ϳ��̻� ������ �ִ� Ŭ������ ���Ѵ�.
//           �Ϲ�Ŭ������ ������ �ִ� ��� ������� ������ �ִ�.(����,���,�޼ҵ�)
//           �ݵ�� abstract ����   �ٿ��� �Ѵ�.
public abstract class Ex01 {
	 int su1 = 10 ;
	 static int su2 = 20 ;
	 final int SU3 = 30;
	 static final int SU4 = 40 ;
	 
	 public void play() {
		 su1++;
		 su2++;
		 // SU3++;  // final�� ����� ���Ѵ�.
		 // SU4++;  // ����� �������� �� �� ����.
	 }
	 
	 public static void play2() {
		 int k1 = 100;
		 // ���������� static�� ��� �� �� ����.
		 // static int k2 = 200 ;
		 System.out.println(k1);
		 
		 // �������������� static�� �����ü��ִ�.
		 // System.out.println(su1);
		 System.out.println(su2);
		 // System.out.println(SU3);
		 System.out.println(SU4);
		 
	 }
	 
	// �߻�޼ҵ� : body�� ���� �޼ҵ�, {���೻��}�� ���� �޼ҵ� 
	//            �ݵ�� �޼ҵ�� Ŭ�������� abstract ���� �ٿ��� �Ѵ�.
	public abstract void play3();
	
	public abstract int play4();
	
}








