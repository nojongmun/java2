package com.ict.edu;

public class Ex01 {
	public static void main(String[] args) {
		String[][] arr = new String[5][8];
		String[] p1 = {"ȫ�浿","90","90","90","270","90.0","A","1"};
		String[] p2 = {"��浿","70","70","70","210","70.0","C","1"};
		String[] p3 = {"�̱浿","95","95","95","285","95.0","A","1"};
		String[] p4 = {"�ڱ浿","80","80","80","240","80.0","B","1"};
		String[] p5 = {"��浿","85","85","85","255","85.0","B","1"};
		
		arr[0] = p1 ;
		arr[1] = p2 ;
		arr[2] = p3 ;
		arr[3] = p4 ;
		arr[4] = p5 ;
		
		// ���ڿ� => ����  : Integer.parseInt(),  Double.parseDouble()  
		// ���� => ���ڿ�  : String.valueOf(int), String.valueOf(double)
		
		// ���� ���ϱ� : // �������� ������.
		//  1) ��� ����� 1�� �̴�. 2) ��(i)���� ��(j)�� ũ�� �� ��� ���� ��Ų��. 
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(Integer.parseInt(arr[i][4]) < Integer.parseInt(arr[j][4])) {
					int k = Integer.parseInt(arr[i][7]);
					 arr[i][7] = String.valueOf(k+1);
				}
			}
		}
		// ���� (��������) :  < (��������)
		// �ӽ����� : 
		String[] tmp = new String[8];
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(Integer.parseInt(arr[i][4]) < Integer.parseInt(arr[j][4])) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		// ���
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
