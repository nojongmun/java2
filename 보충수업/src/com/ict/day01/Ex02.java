package com.ict.day01;

public class Ex02 {
	public static void main(String[] args) {
	  // �ڹ��� �⺻ �ڷ��� : �ڹٿ��� ó���� �������� ����
	  //  - ���� : boolean => true, false �� �� �ϳ�  ��� ��ų �� �ִ�. 
	  //  - ������ : char => 0-65535�� ����, 'a', '��', �����ڵ�(�񿵾�ǻ�밡��)
	  //  - ������ : byte,short,int,long, 
	  //  	             ������ �⺻�� int �̴�.
	  //	       long�� ���� �ڿ� L �Ǵ� l�� ���δ�.(��������)
	  //  - �Ǽ��� : float, double
	  //           float�� �ݵ�� ���� �ڿ� F �Ǵ� f�� ���δ�.
	  //           �Ǽ��� �⺻�� double�̴�.
	  // ** ũ��� :  byte < short < char < int < long < float < double 	
	  // ** ���ڿ��� ����ϴ�  String��  �⺻�ڷ����� �ƴϴ�.
		
		boolean b1 = true ;
		System.out.println(b1);
		b1 = false;
		System.out.println(b1);
		System.out.println();
		
		char c1 = 69 ;
		System.out.println(c1); // 69�� �ƴ϶� 69�� �ش��ϴ� ���ڰ� ���
		c1 = 'A';
		System.out.println(c1);
		c1 = 'a';
		System.out.println(c1);
		c1 = '��';
		System.out.println(c1);
		System.out.println();
		
		int su = 47 ;    
		System.out.println(su);
		su = 1234567891;
		System.out.println(su);
		System.out.println();
		
		long su2 = 12345678912L;
		System.out.println(su2);
		su2 = 123456789 ;
		System.out.println(su2);
		System.out.println();
		
		float f1 = 3.14f;
		System.out.println(f1);
		
		double d1 = 123.4567;
		System.out.println(d1);
		
	}
}
