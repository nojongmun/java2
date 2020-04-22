package com.ict.edu7;

// �͸���Ŭ���� : �̸� ���� Ŭ����, �ٽ� ȣ�� ����
//              ��κ� �������̽�, �߻� Ŭ�������� ���
interface Ex05 {
   int data = 100 ;
   void prnData();
}

// 1. �Ϲ����� ���
class Ex05_InnerClass implements Ex05{
	@Override
	public void prnData() {
		System.out.println(data);
	}
}

// 2. �޼ҵ� �ȿ� �������̽��� ������ Ŭ���� ����
class Ex05_InnerClass2{
	public void play() {
		// �͸� Local ����Ŭ���� 
		new Ex05() {
			@Override
			public void prnData() {
				System.out.println(data);
			}
		}.prnData();
	}
	
	// 3. �������̽��� �޼ҵ� ���ڷ� ���� �ܿ�
	public void play(Ex05 t) {
		System.out.println(t.data);
	}
}













