package com.ict.edu;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex08 {
	public static void main(String[] args) {
		String pathname 
		= "C:"+File.separator+"study"+File.separator+"util"+ File.separator+"setting.png"; 
		String pathname2 
		 = "C:"+File.separator+"study"+File.separator+"util"+ File.separator+"test2";

		File inFile = new File(pathname);
		
		// ���� ���� 
		File outFile = new File(pathname2);
		if(! outFile.exists()) {
			outFile.mkdirs();
		}
		
		// ���� + ���� �̸�
		File outFile2 = new File(outFile, "��ġ_1.png");
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			// �Է�
			fis = new FileInputStream(inFile);
			bis = new BufferedInputStream(fis);
			
			// ���
			fos = new FileOutputStream(outFile2);
			bos = new BufferedOutputStream(fos);
			
			
			// �׸�, ����, ��� ������ �����ϴ� ���
			int k = 0 ;
			while ((k=bis.read()) != -1) {
				bos.write(k);
				bos.flush();
			}
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if(bos != null) bos.close();
				if(fos != null) fos.close();
				if(bis != null) bis.close();
				if(fis != null) fis.close();
			} catch (Exception e2) {
			}
		}
		
	}
}
