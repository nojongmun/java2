package com.ict.edu;

public class Ex07 {
	public static void main(String[] args) {
		
		System.out.println("main1");
	 // static �޼ҵ� ��� ���� ; Ŭ�����̸�.�޼ҵ�
	 // �޼ҵ� ȣ��(����)
	 // �޼ҵ尡 ������ �ڱ⸦ ȣ�� ������ �ǵ��� �´�.
		// sub()�� void �̱� ������ ���� ������ �ʿ����.
		Ex06.sub();
		System.out.println("main2");
		// div()�� void�� �ƴϹǷ� ��ȯ�� ���� �����ؾ� �ȴ�.
		String k = Ex06.div();
		System.out.println(k);
		System.out.println("main3");
	}
}
