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
		
		// 폴더 생성 
		File outFile = new File(pathname2);
		if(! outFile.exists()) {
			outFile.mkdirs();
		}
		
		// 폴더 + 파일 이름
		File outFile2 = new File(outFile, "설치_1.png");
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			// 입력
			fis = new FileInputStream(inFile);
			bis = new BufferedInputStream(fis);
			
			// 출력
			fos = new FileOutputStream(outFile2);
			bos = new BufferedOutputStream(fos);
			
			
			// 그림, 사진, 모든 파일을 복사하는 방법
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
