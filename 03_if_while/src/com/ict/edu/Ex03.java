package com.ict.edu;

public class Ex03 {
	public static void main(String[] args) {
	    // ���� if�� (��ø if��)
		// if(���ǽ�1){
		//    ���ǽ�1�� ���϶� ������ �����;
		// }else if(���ǽ�2){
		//   ���ǽ�1�� false�̰�, ���ǽ�2�� ���϶� ������ �����;   
		// }else if(���ǽ�3){
		//   ���ǽ�1,2�� false�̰�, ���ǽ�3�� ���϶� ������ �����;   
		// }else{
		//   ���ǽ� 1,2,3 ��� false�϶�, �� ������
		// } 
		
		// int k1�� ������ 90�̻��̸� A, 80�̻��̸� B, 70�̻��̸� C, ������ F
		 int k1 = 95;
		 String str = "";
         if (k1 >= 90) {
			str = "A";
		}else if (k1 >= 80) {
			str = "B";
		}else if (k1 >= 70) {
			str = "C";
		}else {
			str = "F";
		}
		System.out.println("��� : " + str);

		// char k2�� �빮�� ���� , �ҹ�������, ��������, ��Ÿ�������� �Ǻ�
		char k2 = '&';
		if (k2>='A' && k2<='Z') {
			str = "�빮��";
		}else if (k2>='a' && k2<='z') {
			str = "�ҹ���";
		}else if (k2>='0' && k2<='9') {
			str = "����";
		}else {
			str = "��Ÿ����";
		}
		System.out.println("��� : " + str);
		
	    // char k3�� A,a�̸� ������ī, B,b�̸� �����, C,c�̸� ĳ����, �������� �ѱ�
		char k3 = 'K';
		if (k3=='A' || k3=='a') {
			str = "������ī";
		}else if (k3=='B' || k3=='b') {
			str = "�����";
		}else if (k3=='C' || k3=='c') {
			str = "ĳ����";
		}else {
			str = "�ѱ�";
		}
		System.out.println("��� : " + str);
		
		// menu�� 1�̸� ī���ī 3500, 2�̸� ī��� 4000, 3�̸� �Ƹ޸�ī�� 3000,
		// 4�̸� �����꽺 3500�̴�. ģ���� 2���� 10000���� �Ծ���.
		// �ܵ��� ���ΰ�? (�ΰ��� 10% ����)
		
		int menu = 3 ;
		if (menu == 1) {
			String coff = "ī���ī";
			int dan = 3500 ;
			int su = 2 ;
			int total = dan * su ;
			int vat = (int)(total *0.1);
			int input = 10000;
			int output = input - (total+vat);
			System.out.println("�ܵ� : "+ output);
		}else if (menu == 2) {
			String coff = "ī���";
			int dan = 4000 ;
			int su = 2 ;
			int total = dan * su ;
			int vat = (int)(total *0.1);
			int input = 10000;
			int output = input - (total+vat);
			System.out.println("�ܵ� : "+ output);
		}else if (menu == 3) {
			String coff = "�Ƹ޸�ī��";
			int dan = 3000 ;
			int su = 2 ;
			int total = dan * su ;
			int vat = (int)(total *0.1);
			int input = 10000;
			int output = input - (total+vat);
			System.out.println("�ܵ� : "+ output);
		}else if (menu == 4){
			String coff = "�����꽺";
			int dan = 3500 ;
			int su = 2 ;
			int total = dan * su ;
			int vat = (int)(total *0.1);
			int input = 10000;
			int output = input - (total+vat);
			System.out.println("�ܵ� : "+ output);
		}
		
		System.out.println("�����丵 == 1.�ߺ��ڵ� ����");
		menu = 3 ;
		String coff = "";
		int dan = 0 ;
		if (menu == 1) {
			coff = "ī���ī";
			dan = 3500 ;
		}else if (menu == 2) {
			coff = "ī���";
			dan = 4000 ;
		}else if (menu == 3) {
			coff = "�Ƹ޸�ī��";
			dan = 3000 ;
		}else if (menu == 4){
			coff = "�����꽺";
			dan = 3500 ;
		}
		int su = 2 ;
		int total = dan * su ;
		int vat = (int)(total *0.1);
		int input = 10000;
		int output = input - (total+vat);
		System.out.println("�ܵ� : "+ output);
	}
}






