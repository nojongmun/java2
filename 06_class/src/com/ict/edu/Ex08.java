package com.ict.edu;

public class Ex08 {
	int k1 = 10 ;
	int k2 = 20 ;
	int sum = 0 ;
	
	// �޼ҵ��̸�([����]) : �ܺ��� ������ �޾Ƽ� �޼ҵ带 ����ϱ� ���ؼ��� ���ڰ� �ʿ��ϴ�.
	//                  ������ ������ ������ �޼ҵ带 ����ϱ� ���ؼ��� ���ڰ� �ʿ����.
	public void add() {
		sum = k1 + k2 ;
		System.out.println(sum);
	}
	public void sub(int su) {
		sum = k1 + su ;
		System.out.println(sum);
	}
	public int mul() {
		return k1 + k2 ;
	}
	public double div(double d2) {
		return k1 + d2 ;
	}
	
	
}
