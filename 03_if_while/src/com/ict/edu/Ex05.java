package com.ict.edu;

public class Ex05 {
	public static void main(String[] args) {
        // for�� : ������ ��Ģ�� ���� ���๮���� �ݺ� ó���ϴ� ��
		// for(�ʱ�� ; ���ǽ� ; ������){
		//    ���ǽ��� ���϶� ������ ����;
		//    ���ǽ��� ���϶� ������ ����;
		//  }
		
		// for���� ������ ������ �ʱ�� ����,  ���ǽ����� �̵�
		// ���ǽ� => boolean, ������, �񱳿���
		// ���ǽ��� ���϶��� for�� ����, �����̸� for���� �������´�.
		// for���� ���� ������ ������ ���������� ����
		// �������� ���ǽ����� ����
		
		//**for���� ���� ������ for �ۿ����� ����� �� ����.
		
		// �ȳ��ϼ��� 10�� ����ϱ�
		for (int i = 1; i < 11; i++) {
			System.out.println(i+" : �ȳ��ϼ���");
		}
		
		//**for���� ���� ������ for �ۿ����� ����� �� ����.
		// System.out.println(i);
		
		int k1 ;
		for ( k1 =1 ; k1 < 11; k1++) {
			System.out.println(k1+" : �ȳ��ϼ���");
		}
		System.out.println(k1);
		
		// 0-10 ���� ����ϱ�
		for (int i = 0; i < 11; i++) {
			System.out.println(i);
		}
		// 0-10���� ¦���� ����ϱ�
		for (int i = 0; i < 11; i=i+2) {
			System.out.println(i);
		}
		for (int i = 0; i < 11; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		//0-10���� Ȧ���� ����ϱ�
		for (int i = 0; i < 11; i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
		//0-50���� 7�� ����� ����ϱ�
		for (int i = 0; i < 51; i++) {
			if(i%7==0) {
				System.out.println(i);
			}
		}
		// a-g���� ���
		for (char i = 'a'; i < 'h'; i++) {
			System.out.println(i);
		}
		// 5�����
		for (int i = 1; i < 10; i++) {
			System.out.println("5 * "+ i + " = " + (5*i));
		}
		
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		for (int i = 1; i < 5 ; i++) {
			System.out.println("0 0 0 0");
		}
		
		for (int i = 1; i < 17; i++) {
			System.out.print("0 ");
			// ���� �϶��� {  } �� �����ص� �ȴ�.
			if(i%4==0) System.out.println();
			
		}
		
		// 0-10���� ������ ���ϱ�
		int sum = 0 ; // ���� ������ ����Ű�� ����
		for (int i = 0; i < 11; i++) {
			sum = sum + i ;
		}
		System.out.println("��� : " + sum);
		
		// 7!(7 * 6 * 5 * 4 * 3 * 2 * 1 );
		sum = 1 ;
		for (int i = 7; i > 0; i--) {
			sum = sum * i ;
		}
		System.out.println("��� : "+ sum);
		
		// 0-10������ Ȧ���� ¦���� ���� ������
		int odd = 0 ;  // Ȧ���� ��
		int even = 0 ; // ¦���� ��
		for (int i = 0; i < 11; i++) {
			if(i%2==0) {
				even = even + i ;
			}else {
				odd = odd + i ;
			}
		}
		System.out.println("Ȧ���� �� : " + odd);
		System.out.println("¦���� �� : " + even);
		
	}
}








