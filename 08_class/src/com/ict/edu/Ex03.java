package com.ict.edu;

public class Ex03 {
	public static void main(String[] args) {
		// ���� ���� �ٽ� ����
		String s1 = "���ѹα�";
		s1 = s1 + " KOREA";
		System.out.println(s1);
		
		// �ش� ���ڿ����� �ٸ� ���ڿ����� �߰� �Ҷ� ����ϴ� Ŭ����
		// ���� ���뿡 ��� �߰� �� �� ����
		// StringBuffer, StringBuilder
		StringBuffer sb = new StringBuffer("���ѹα�");
		StringBuilder sb2 = new StringBuilder("���ѹα�");
		
		// append(�߰�����);
		sb.append(" ������  ");
		sb2.append(" �ڸ��� ������ ");
		
		System.out.println(sb);
		System.out.println(sb2);
		
		// insert(int index, String str) : ����
		sb.insert(5, "�� ");
		sb2.insert(5, "�� ");
		
		System.out.println(sb);
		System.out.println(sb2);
		
		// replace(������ġ, ����ġ, ġȯ����)
		sb.replace(0, 4, "KOREA");
		sb2.replace(0, 4, "KOREA");
		System.out.println(sb);
		System.out.println(sb2);
		
		// delete(������ġ, ����ġ-1)
		sb.delete(6, 7);
		sb2.delete(6, 7);
		System.out.println(sb);
		System.out.println(sb2);
		
		// toString() : StringBuffer,StringBuilder�� String���� ��ȯ ������
		// ���������δ� String Ŭ���� �����ϱ� ���ؼ� �ݵ�� ���� �� �ִ� ���� ����.
		System.out.println(sb.toString());
		System.out.println(sb2.toString());
	}
}
