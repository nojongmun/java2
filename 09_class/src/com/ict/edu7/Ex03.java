package com.ict.edu7;

// 1. Member ����Ŭ����  // 3. static ����Ŭ����  
public class Ex03 {
	// ����ʵ�
	int s1 = 10;
	final int s2 = 20;
	static int s3 = 30;
	static final int s4 = 40;
	private int s5 = 50;

	// ������
	public Ex03() {
		System.out.println("�ܺ� Ŭ���� ������ : " + this);
	}

	// ��� �޼ҵ�
	public void play() {
		int n1 = 100;
		final int n2 = 20;
		/*
		 * ���������� static ��� �ȵ�, ���������� ��� ���� static int s3 = 30 ; static final int s4 = 40
		 * ; ���������� int s5 = 50 ;
		 */
		System.out.println("�ܺ� Ŭ���� �޼ҵ�");
	}

	// Member ���� Ŭ����
	class In_Ex03 {
		// �Ϲ� Ŭ���� ó�� ����ʵ�,������,����޼ҵ尡 ���� �� �� �ִ�.
		int k1 = 100;
		final int k2 = 200;
		// Member ����Ŭ���������� static ������ ��� �� �� ����.
		// static int k3 = 30;
		static final int k4 = 400;
		private int k5 = 500;
		 
		public In_Ex03() {
			System.out.println("����Ŭ���� ������ : " + this);
		}
		
		// ���� Ŭ���������� �ܺ�Ŭ������ ������� ������� ��� �Ҽ��ִ�.
		public void prn() {
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
			System.out.println(s4);
			// private �� �����Դ�.
			System.out.println(s5);
			System.out.println("---------");
			play();
			System.out.println("---------");
			System.out.println(k1);
			System.out.println(k2);
			System.out.println(k4);
			System.out.println(k5);
		}
	}

	// static ���� Ŭ���� : Member ����Ŭ���� ��� ���� ���ϴ� static ������ ����ϸ� Ŭ������ static�� ���δ�.
	static class In_Ex04 {
		// �Ϲ� Ŭ���� ó�� ����ʵ�,������,����޼ҵ尡 ���� �� �� �ִ�.
		int a1 = 1000;
		final int a2 = 2000;
		static int a3 = 3000;
		static final int a4 = 4000;
		private int a5 = 5000;
		
		// �ܺ�Ŭ�������� static�� �ƴ� ��� ��� �� ��
		// ����Ŭ������ static �ƴϾ ��� ����		
		public void go() {
			//System.out.println(s1);
			//System.out.println(s2);
			System.out.println(s3);
			System.out.println(s4);
			// private �� �����Դ�.
			//System.out.println(s5);
			System.out.println("--------------");
			System.out.println(a1);
			System.out.println(a2);
			System.out.println(a3);
			System.out.println(a4);
			System.out.println(a5);
		}
		
		// �ܺθ޼ҵ�,���θ޼ҵ� ���  static �̾�߸� ��� ����
		public static void go2(){
			// System.out.println(s1);
			// System.out.println(s2);
			System.out.println(s3);
			System.out.println(s4);
			// private �� �����Դ�.
			// System.out.println(s5);
			System.out.println("--------------");
			// System.out.println(a1);
			// System.out.println(a2);
			System.out.println(a3);
			System.out.println(a4);
			// System.out.println(a5);
		}
	}
}
