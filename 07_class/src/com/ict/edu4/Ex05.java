package com.ict.edu4;

// static : Ŭ���� ������ , ����ʵ�, ����޼ҵ� �����
public class Ex05 {
	// �ν��Ͻ� ������ ��ü�� ������� �� ���� 
	// �׻� �ʱⰪ�� ������ ���� �ȴ�.
	int su1 = 10 ;          // �ν��Ͻ� ����

	// static�� ��ü ������ ������� ���� ������ �����Ƿ�
	// ���� Ŭ������ �̿��� �ٸ� ��ü�� ȣ���Ͽ� ��� �� ��  �ִ�.
	static int su2 = 10 ;   // static ����, Ŭ�������� 
	
	public Ex05() {
		su1 ++ ;
		su2 ++ ;
	}
	
	public void sum(int k1, int k2) {
		// ���������δ� static�� ����� �� ����.
		// static double pi = 3.14 ;
		System.out.println("��� : " + (k1+k2));
	}
	
	// static �޼ҵ�
	public static void sub() {
		// �ν��Ͻ� ���� ��� �� �� ����.
		// System.out.println(su1);
		
		// ���������δ� static�� ����� �� ����.
		//  static  double pi = 3.14 ;
		
		// static ����, Ŭ��������  ��� ����
		System.out.println(su2);
	}
}
