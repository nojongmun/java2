package com.ict.edu;

public class Ex02 {
	public static void main(String[] args) {
		// String �Һ��� Ư¡ : String�� �� �� ����� ���� �� �� ����. 
		String s1 = "I �� YOU";
		s1 = s1 + " Korea";
		System.out.println(s1);
		System.out.println("====================");
		
		// ���Ĺ��� : 
		// %s : ���ڿ�, %d:����,  %f:�Ǽ�
		String s3 = "ICT ���� ���߿�";
		int su1 = 90 ;
		float su2 = 95.4444f ;
		float su3 = 1234595.4454f ;
		double su4 = 1234595.4454f ;
		System.out.printf("����� %s �Ҽ��Դϴ�.\n����� ����� %d �Դϴ�.", s3, su1);
		System.out.println();
		// %.2f => �Ҽ��� ��° �ڸ� ���� ����, ��°�ڸ����� �ݿø�
		System.out.printf("����� ��������� %f, %4f, %.2f", su2,su2,su2);
		System.out.println();
		System.out.printf("����� ��������� %f, %4f, %.2f", su3,su3,su3);
		System.out.println();
		System.out.printf("����� ��������� %f, %4f, %.2f", su4,su4,su4);
		System.out.println();
		System.out.printf("%s\n", s3);
		System.out.printf("%5s\n",s3);
		System.out.printf("%20s\n",s3);
		// String.format() : ������ �����ϰ� ���Ŀ� ���� ����
		System.out.println(String.format("%20s", s3));
		
	}
}
