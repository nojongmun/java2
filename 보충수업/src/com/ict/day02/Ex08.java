package com.ict.day02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex08 {
	public static void main(String[] args) {
		File file  = new File("c:/study/util/k.txt");
		// ���Ͽ� ����
		FileOutputStream fos = null;
		// ���� �����б�
		FileInputStream fis = null;
		try {
			fos = new FileOutputStream(file);
			fos.write('c');  // char
			fos.write(97);   // ����
			fos.flush();
			
			fis = new FileInputStream(file);
			int b;
			while((b = fis.read()) != -1) {
				System.out.println(b+":"+(char)b);
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				fos.close();
				fis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
