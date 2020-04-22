package com.ict.edu;

public class Ex11_2 {
	int v_sum;
	double v_avg;
	String v_hak;

	// 합계구하기
	public void sum(int k1, int k2, int k3) {
		v_sum = k1 + k2 + k3;
	}

	// 평균 구하기
	public void avg() {
		v_avg = (int) (v_sum / 3.0 * 10) / 10.0;
	}

	// 학점 구하기
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

	// 이름받아서 출력
	public void prn(String k1) {
		// 출력하기
		System.out.println("================");
		System.out.println("이름 : " + k1);
		System.out.println("총점 : " + v_sum);
		System.out.println("평균 : " + v_avg);
		System.out.println("학점 : " + v_hak);
		System.out.println("================");
	}
}
