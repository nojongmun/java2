package com.ict.edu;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[][] str = new double[5][7];
		// 입력
		for (int i = 0; i < str.length; i++) {
			double[] p = new double[7];
			System.out.print("국어 : ");
			p[0] = scan.nextDouble();
			System.out.print("영어 : ");
			p[1] = scan.nextDouble();
			System.out.print("수학 : ");
			p[2] = scan.nextDouble();
			System.out.println("============");
			
			p[3] = p[0] + p[1] + p[2];
			p[4] = (int) (p[3] / 3.0 * 10) / 10.0;
			if (p[4] >= 90) {
				p[5] = 'A';
			} else if (p[4] >= 80) {
				p[5] = 'B';
			} else if (p[4] >= 70) {
				p[5] = 'C';
			} else {
				p[5] = 'F';
			}
			p[6] = 1;

			str[i] = p;
		}
		
		// 순위
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str.length; j++) {
				if(str[i][3] < str[j][3]) {
					str[i][6]++;
				}
			}
		}
		// 정렬
		// 임시
		double[] temp = new double[7]; 
		for (int i = 0; i < str.length-1; i++) {
			for (int j = i+1; j < str.length; j++) {
				if(str[i][4]  < str[j][4]) {
					temp = str[j];
					str[j] = str[i];
					str[i] = temp ;
				}
			}
		}
		// 출력
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length; j++) {
				if(j==4) {
				   System.out.print(str[i][j]+"\t");
				}else if(j==5){
				   System.out.print((char)(str[i][j])+"\t");
				}else {
				   System.out.print((int)(str[i][j])+"\t");
				}
			}
			System.out.println();
		}

	}
}
