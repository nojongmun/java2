package com.ict.edu2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

// FileInputStream : read():int(�ƽ�Ű�ڵ�)=> char����ȯ, read(byte[] b)
// FileReader : read():int(�����ڵ�)=>char����ȯ, read(char[] c)
// BufferedReader �߰� :  readLine() => �� �پ� �б�, �� �̻� ���� �� ���� �� null;

public class Ex04 {
	public static void main(String[] args) {
		String pathname 
		 = "C:"+File.separator+"study"+File.separator+"util"+ File.separator+"test06.txt";
		File file = new File(pathname);
		FileReader fr = null;
		BufferedReader br = null;
		int k =0 ;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			// ���� �б�
			// System.out.println(br.readLine());
			
			// ��ü �б�
			/*
			while(true) {
				String msg = br.readLine();
				if(msg==null) break;
				System.out.println(msg);
			}
			*/
			String msg = "";
			String res = "";
			StringBuilder sb = new StringBuilder();
			while((msg = br.readLine()) != null) {
				// System.out.println(msg);
				// res = res.concat(msg) ;
				sb.append(msg+"\n");
			}
			// System.out.println(res);
			System.out.println(sb.toString());
		} catch (Exception e) {
		} finally {
			try {
				br.close();
				fr.close();
			} catch (Exception e2) {
			}
		}
	}
}
