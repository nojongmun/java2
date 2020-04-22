package com.ict.edu2;

import java.io.File;
import java.io.FileReader;

// FileInputStream : read():int(�ƽ�Ű�ڵ�)=> char����ȯ, read(byte[] b)
// FileReader : read():int(�����ڵ�)=>char����ȯ, read(char[] c)
public class Ex03 {
	public static void main(String[] args) {
		String pathname 
		 = "C:"+File.separator+"study"+File.separator+"util"+ File.separator+"test05.txt";
		File file = new File(pathname);
		FileReader fr = null;
		int k =0 ;
		try {
			fr = new FileReader(file);
			
			// �� ���� �б�
			// k = fr.read();
			// System.out.println(k + ":" + (char)(k));
			
			// ��ü �б�
			/*
			while(true) {
			    k = fr.read();
			    if(k == -1) break;
			    System.out.println(k + ":" + (char)(k));
			}
			*/
			/*
			while((k = fr.read()) != -1) {
				System.out.println(k + ":" + (char)(k));
			}
			*/
			
			// �迭ó��
			/*
			char[] c = new char[(int)(file.length())];
			fr.read(c);
			for (char d : c) {
				System.out.print(d);
			}
			System.out.println();
			*/
			
			// String Ŭ���� ���
			char[] c = new char[(int)(file.length())];
			fr.read(c);
			String msg  = new String(c);
			System.out.println(msg);
		} catch (Exception e) {
		} finally {
			try {
				fr.close();
			} catch (Exception e2) {
			}
		}
	}
}
