package com.ict.edu;

public class Ex11_2 {
	int v_sum;
	double v_avg;
	String v_hak;

	// �հ豸�ϱ�
	public void sum(int k1, int k2, int k3) {
		v_sum = k1 + k2 + k3;
	}

	// ��� ���ϱ�
	public void avg() {
		v_avg = (int) (v_sum / 3.0 * 10) / 10.0;
	}

	// ���� ���ϱ�
	public void hak() {
		if (v_avg >= 90) {
			v_hak = "A";
		} else if (v_avg >= 80) {
			v_hak = "B";
		} else if (v_avg >= 80) {
			v_hak = "C";
		} else {
			v_hak = "F";
		}
	}

	// �̸��޾Ƽ� ���
	public void prn(String k1) {
		// ����ϱ�
		System.out.println("================");
		System.out.println("�̸� : " + k1);
		System.out.println("���� : " + v_sum);
		System.out.println("��� : " + v_avg);
		System.out.println("���� : " + v_hak);
		System.out.println("================");
	}
}
