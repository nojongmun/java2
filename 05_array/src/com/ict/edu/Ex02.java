package com.ict.edu;

public class Ex02 {
	public static void main(String[] args) {
		// �迭 :���� �ڷ����� �����͸� �� ���� ��Ƶ� ����
		// �ݵ�� ���� �ڷ����� ���� �� �� �ִ�.
		// �����Ҷ� ũ�⸦ �����ؾ� �ǰ�, ������ ũ��� ������� �ʴ´�.
		// �迭�� ����� �Ϲ������� for���� ����Ѵ�.

		// �迭 ���� ���� : ���� => ���� => ������ ����
		
		// ����� ������ �ѹ��� 
		char[] ch = new char[4];
		
		// ������ ����
		ch[0] = 'j';
		ch[1] = 'a';
		ch[2] = 'v';
		ch[3] =  97; // 0-65535 ���� ����;
		
		for (char c : ch) {
			System.out.println(c);
		}
		System.out.println("================");
		
		// ����� ������ ������ ���� �ѹ���
		String[] str = {"java", "jsp","spring","android"};
		for (String k : str) {
			System.out.println(k);
		}
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		
	}
}
