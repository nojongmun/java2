package com.ict.day01;

public class Ex04 {
	public static void main(String[] args) {
		// ���� : �ϳ��� �����͸� �����ϴ� ������
		//       �ٸ� �����͸� ������ �� �ִ�. (���� ���� ��������.)
		// �迭 : ���� �ڷ��� �������� ��� ����ϴ� ������
		// Ŭ���� : �������� �ڷ����� �������� �ϳ��� ��ü�� ���� ����� �� �ִ�.
		
		// �迭 ���� : ���� => ���� => ���� ,   ����� ���� ���
		// ���� :  �ڷ���[] �̸� ;
		// ���� :  �̸� = new �ڷ���[����=ũ��];
		// ���� :  �̸�[��ġ=index=���ȣ=0���ͽ���] = ������
		
		// ����
		String[] str ;
		// ����
		str = new String[4];
		// ����
		str[0] = "java";
		str[1] = "jsp";
		str[2] = "spring";
		str[3] = "android" ;
		
		// �迭�� ����� ������ for��
		for (String k : str) {
			System.out.println(k);
		}
		System.out.println();
		
		// ����� ������ �ѹ��� 
	    String[] str2 = new String[4];
	    // ����
	    str2[0] = "java";
		str2[1] = "jsp";
		str2[2] = "spring";
		str2[3] = "android" ;
		for (int i = 0; i < str2.length; i++) {
			System.out.println(str2[i]);
		}
		System.out.println();
		
		// ����, ����, ������ �ѹ���
		String[] str3 = {"java","jsp","spring","android"};
		for (String k : str3) {
			System.out.println(k);
		}
		
		
		
		
		
		
		
	}
}
