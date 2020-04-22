package com.ict.edu2;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;

// PrintWriter�� OutputStream, Writer �� Ŭ���� ��� �� ���ڷ� ��� �����ϴ�.
// print(�����ڷ���, String, Object), println(�����ڷ���, String, Object)�� ����ؼ� ����Ѵ�.
//  ��, ����Ʈ ��� ��Ʈ��,  ������ �½�Ʈ���� ��δ� ��� �� �� �ִ�.
public class Ex05 {
	public static void main(String[] args) {
		String pathname 
		 = "C:"+File.separator+"study"+File.separator+"util"+ File.separator+"test08.txt";
		File file = new File(pathname);
		/*
		FileOutputStream out = null;
		BufferedOutputStream bos = null;
		PrintWriter pw = null;
		*/
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		try {
			/*
			out = new FileOutputStream(file);
			bos = new BufferedOutputStream(out);
			pw = new PrintWriter(bos);
			*/
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);
			
			pw.println("PrintWriter�� ������ ���� �Ѵ�.");
			pw.println(123456);
			pw.println(true);
			pw.println(3.147);
			pw.flush();
		} catch (Exception e) {
		} finally {
			try {
				pw.close();
				// bos.close();
				// out.close();
				bw.close();
				fw.close();
			} catch (Exception e2) {
			}
		}
	}
}
