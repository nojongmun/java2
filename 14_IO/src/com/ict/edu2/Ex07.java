package com.ict.edu2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

// InputStreamReader : ����Ʈ �Է� ��ũ���� ���� �Է� ��Ʈ��
// InputStream => InputStreamReader => Reader => BufferedReader
// ���(Ű����)�� ���ؼ� �Էµ� ������ ����� ���ϰ� ����ϱ� ����

// OutputStreamWriter : ����Ʈ ��½�Ʈ���� ���� ��� ��Ʈ��
// OutputStream => OutputStreamWriter => Writer => BufferedWriter

public class Ex07 {
	public static void main(String[] args) {
		InputStreamReader isr = null;
		BufferedReader br = null;
 
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		try {
			// System.out.print("���ϴ� ���� : ");
			// ���ϴ� ������ ����Ϳ� ����϶�(System.out)
			osw = new OutputStreamWriter(System.out);
			bw = new BufferedWriter(osw);
			bw.write("���ϴ� ���� : ");
			bw.flush();
			
			// Ű���带 ���� ���� ������ ����(System.in)
		  	isr = new InputStreamReader(System.in);
		  	br = new BufferedReader(isr);
		  	String msg = br.readLine();
		  	
		  	// System.out.println("��ĳ�� ��� ����Ͽ� ���� ���� : " + msg);
		  	bw.write("��ĳ�� ��� ����Ͽ� ���� ���� : " + msg);
		  	bw.flush();
		} catch (Exception e) {
		} finally {
			try {
				bw.close();
				osw.close();
				br.close();
				isr.close();
			} catch (Exception e2) {
			}
		}
		
	}
}
