package com.ict.edu4;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// 1. ���� 2. ����
		// ��ǻ�ʹ� 1~13�� ���ڸ� ���� �� �ִ�.
		// 1~6������ ����, 7�� ���, 8~13������ ����
	    Scanner sc = new Scanner(System.in); 
	    int a_count = 0 ;
	    int v_count = 0 ;
	    String res = "";
		esc:
		while (true) {
			a_count ++;
			// ��ǻ�� ���� ����
			int com = (int)(Math.random()*13)+1 ;
			
			// ����� ����
			System.out.print("1.����  2.����  �� �ϳ��� �����ϼ��� : ");
			int user = sc.nextInt();
			if(user == 1) {
				if(com >=1 && com<=6) {
					res = "��" ;
				}else if(com>=8  && com<=13){
					v_count ++ ;
					res = "�̱�";
				}else if(com == 7) {
					res = "���";
				}
			}else if(user == 2){
				if(com >=1 && com<=6) {
					v_count ++ ;
					res = "�̱�";
				}else if(com>=8  && com<=13){
					res = "��";
				}else if(com == 7) {
					res = "���";
				}
			}
			System.out.println("com : " + com);
			System.out.println("��� : " + res);
			while(true) {
				System.out.print("����ұ��?(y/n)");
				String msg = sc.next();
				if(msg.equalsIgnoreCase("y")) {
					continue esc ;
				}else if(msg.equalsIgnoreCase("n")) {
					break esc ;
				}else {
					continue;
				}
			}
		}
	   System.out.println("�����ϼ̽��ϴ�.");
	   System.out.println("��ü ���� �� : " + a_count);
	   System.out.println("�̱� ���� �� : " + v_count);
	   System.out.println("�·� : " +((int)((v_count/(a_count*1.0)*100)*10)/10.0) +"%");
	    
	}
}
