package com.ict.edu;

public class Ex05 {
	// ����ʵ� : ���°�, �Ӽ�
	// - static X = instance ,
	// - static O = static,
	// - final X = ����
	// - final O = ���
	String name = "ȫ�浿";       // instance ����
	int kor = 80;               // instance ����
	static int eng = 90;        // static ����
	final int MATH = 100;       // instance ���
	static final int COM = 100; // static ���
	
    // �޼ҵ� ���� : [����������][�޼ҵ�����] ��ȯ��  �޼ҵ��̸�([����=�Ű�����]){ ���๮  }
	// �޼ҵ������� �⺻������ instance��?, static ��?
	// void �� ��ȯ���� ���ٴ� ��
	public void add() {
		kor = kor + 10;     // final X  => ����
		eng = eng + 10 ;    // final X  => ����
		// MATH = 90 ;         // final O  => ��� (�������� �ȵ�)
		// COM = COM + 10 ;    // final O  => ��� (�������� �ȵ�)
	}
}
