package com.ict.edu;

public class Ex10 {
	public static void main(String[] args) {
	// break label�� continue label
	// break label : ���̺��� ������ �ݺ���(���)�� Ż��
	// continue label : ���̺��� ������ �ݺ���(���)���๮�� �����ϰ� ����ȸ���� ����
		
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.println("i="+i+",  j="+j);
			}
		}
		System.out.println("===================");
		
		// j=4�� �� break�� ���
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(j==4) break;
				System.out.println("i="+i+",  j="+j);
			}
		}
		System.out.println("===================");
		
		// i=2�� �� break�� ���
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(i==2) break;
				System.out.println("i="+i+",  j="+j);
			}
		}
		System.out.println("===================");
		
		// label ǥ�� , label ǥ�� �������� �ݵ�� for�̳� while���� ����
		// j�� 4�϶� break label�� ����
		esc :
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(j==4) break esc;
				System.out.println("i="+i+",  j="+j);
			}
		}
		System.out.println("===================");
		
		// i=2�� �� break lable�� ���
		esc:
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(i==2) break esc;
				System.out.println("i="+i+",  j="+j);
			}
		}
		System.out.println("===================");
		
		esc:
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(j==4) continue ;
				System.out.println("i="+i+",  j="+j);
			}
		}
       System.out.println("===================");
		esc:
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(j==4) continue esc;
				System.out.println("i="+i+",  j="+j);
			}
		}
       System.out.println("===================");
	}
}
