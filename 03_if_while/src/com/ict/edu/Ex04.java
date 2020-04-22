package com.ict.edu;

public class Ex04 {
	public static void main(String[] args) {
	    // switch ~ case : ���ǹ�, 
		// if���� ���ǽ��� boolean, ������, �񱳿���, ������ �־����� �� ����ϱ� ���ϴ�
		// switch���� ���ǰ��� byte, short, int, char, String�� �־������� ����ϱ� ���ϴ�
		/*
		  break; �� ���� ����� Ż���ϴ� �ǹ̸� ���´�.
		  switch (���ڰ�=���ǰ�) {
			case ���ǰ�1:  ���ڰ��� ���ǰ��� ������ ������ ���๮; break;
            case ���ǰ�2:  ���ڰ��� ���ǰ��� ������ ������ ���๮; break;
            case ���ǰ�3:  ���ڰ��� ���ǰ��� ������ ������ ���๮;
                                                   ���ڰ��� ���ǰ��� ������ ������ ���๮;
                                                   ���ڰ��� ���ǰ��� ������ ������ ���๮; break;
		  default: ���ǰ�1,2,3  �ƴ� �������� ������ ���๮; [break;(��������)]
		}
		*/
		// char k1�� A�̸� ������ī, B�̸� �����, C�̸� ĳ���� ������ ���ѹα�
		// break�� ������ ����� ���� : break�� ���������� �Ʒ����๮�� ��� �����Ѵ�.
		char k1 = 'B';
		switch (k1) {
			case 'A':  System.out.println("������ī");
			case 'B':  System.out.println("�����"); 
			case 'C':  System.out.println("ĳ����"); 
			default: System.out.println("���ѹα�");	
		}
		System.out.println("===================");
		
		String str ="";
		switch (k1) {
			case 'A':  str = "������ī";
			case 'B':  str = "�����"; 
			case 'C':  str = "ĳ����"; 
			default:   str = "���ѹα�";	
		}
		System.out.println(str);
		System.out.println("===================");
		
		str ="";
		switch (k1) {
			case 'A':  str = "������ī"; break;
			case 'B':  str = "�����"; break;
			case 'C':  str = "ĳ����"; break;
			default:   str = "���ѹα�";	break;
		}
		System.out.println(str);
		System.out.println("===================");
		
		// char k1�� A,a�̸� ������ī, B,b�̸� �����, C,c�̸� ĳ���� ������ ���ѹα�
		k1 = 'C';
		str = "";
		switch (k1) {
			case 'A': str = "������ī"; break;
			case 'a': str = "������ī"; break;
			case 'B': str = "�����"; break;
			case 'b': str = "�����"; break;
			case 'C': str = "ĳ����"; break;
			case 'c': str = "ĳ����"; break;
			default: str = "���ѹα�";break;
		}
		System.out.println(str);
		System.out.println("===================");
		
		k1 = 'C';
		str = "";
		switch (k1) {
			case 'A': 
			case 'a': str = "������ī"; break;
			case 'B': 
			case 'b': str = "�����"; break;
			case 'C': 
			case 'c': str = "ĳ����"; break;
			default: str = "���ѹα�";break;
		}
		System.out.println(str);
		System.out.println("===================");
		
	  // char k2�� 1�Ǵ� 3�̸� ����, 2�Ǵ� 4�� ����, ������ �ܱ���.
	    char k2 = 3;
	    switch (k2) {
			case 1:    
			case 3:  str = "����"; break;  
			case 2:    
			case 4:  str = "����"; break;  
			default: str = "�ܱ���";	break;
		}
	    System.out.println(str);
		System.out.println("===================");
		
	  // �����̸����� ���� ����ϱ� (�ѱ�=����, �߱�=�ϰ�, �Ϻ�=����, �̱�=������, ĳ����=��Ÿ��) 	
		String k3 = "�̱�";
		switch (k3) {
			case "�ѱ�":  str = "����" ; break;
			case "�߱�":  str = "�ϰ�" ; break;
			case "�Ϻ�":  str = "����" ; break;
			case "�̱�":  str = "������" ; break;
			case "ĳ����":  str = "��Ÿ��" ; break;
		}
		System.out.println(str);
		System.out.println("===================");
	}
}













