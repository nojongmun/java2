package com.ict.edu;

public class Ex02 {
	public static void main(String[] args) {
		// if ~ else ~ : ���ǽ� ���϶��� �����϶� ���� ������ ó���Ѵ�.
		// if(���ǽ�){
		//   ���ǽ��� ���϶� ������ ����;
		//   ���ǽ��� ���϶� ������ ����;
		// }else{
		//   ���ǽ��� �����϶� ������ ����;
		//   ���ǽ��� �����϶� ������ ����;
		// }

		// int k1�� 60�̻� �̸� �հ�, �ƴϸ� ���հ�
		int k1 = 50;
		String str = "";
		if (k1 >= 60) {
			str = "�հ�";
		}else {
			str = "���հ�";
		}
		System.out.println("��� : " + str);

		// int k2�� Ȧ������ ¦�� ���� �Ǻ�����
		int k2 = 142;
		str = "";
		if (k2 % 2 == 0) {
			str = "¦��";
		}else {
			str = "Ȧ��";
		}
		System.out.println("��� : " + str);

		// char k3�� �빮������, �빮�ڰ� �ƴ��� �Ǻ�����
		char k3 = 'T';
		str = "";
		if (k3 >= 'A' && k3 <= 'Z') {
			str = "�빮��";
		}else {
			str = "�빮�� �ƴ�";
		}
		System.out.println("��� : " + str);

		// int k4�� 1 �Ǵ� 3 �̸� ����, �ƴϸ� ���� ���� �Ǻ�����
		int k4 = 2;
		str = "����";
		if (k4 == 1 || k4 == 3) {
			str = "����";
		}else {
			str = "����";
		}
		System.out.println("��� : " + str);

		// �μ� �� ū���� ����Ͻÿ�
		int k5 = 10 ;
		int k6 = 15 ;
		int max = 0 ;
		if (k5 > k6) {
			max = k5;
		} else {
			max = k6;
		}
		System.out.println("��� : " + max);
		
	}
}





