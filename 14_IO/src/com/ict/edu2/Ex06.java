package com.ict.edu2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

// InputStreamReader : ����Ʈ �Է� ��ũ���� ���� �Է� ��Ʈ��
// InputStream => InputStreamReader => Reader => BufferedReader
// ���(Ű����)�� ���ؼ� �Էµ� ������ ����� ���ϰ� ����ϱ� ���� 
public class Ex06 {
	public static void main(String[] args) {
		// Scanner scan = new Scanner(System.in);
		
		System.out.print("���ϴ� ���� : ");
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			// Ű���带 ���� ���� ������ ����(System.in)
		  	isr = new InputStreamReader(System.in);
		  	br = new BufferedReader(isr);
		  	String msg = br.readLine();
		  	System.out.println("��ĳ�� ��� ����Ͽ� ���� ���� : " + msg);
		} catch (Exception e) {
		} finally {
			try {
				br.close();
				isr.close();
			} catch (Exception e2) {
			}
		}
		
	}
}
