package com.ict.edu;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// DataInputStream과 DataOutputStream
// 기본 자료형의 데이터를 주고 받을 때 사용 
// ** 반드시 입력순서와 출력 순서를  맞춰야 한다.
// 기본 생성자가 없어서 BufferedInputSteram과 BufferedOutputSteram처럼
// FileInputStream과 FileOutputStream를 이용 한다.

public class Ex09 {
	public static void main(String[] args) {
		String pathname 
		 = "C:"+File.separator+"study"+File.separator+"util"+ File.separator+"test03.txt";
		File file = new File(pathname);
		
		DataOutputStream dos = null;
		DataInputStream dis = null;
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			// 출력 : 쓰기
			fos = new FileOutputStream(file);
			dos = new DataOutputStream(fos);
			
			// writeXXX() : XXX =>기본 자료형
			dos.writeInt(975);
			dos.writeLong(41L);
			dos.writeChar('C');
			dos.writeDouble(24.12);
			dos.writeFloat(21.369f);
			dos.writeBoolean(true);
			dos.flush();
			
			
			// 입력 : 읽기
			fis = new FileInputStream(file);
			dis = new DataInputStream(fis);
			
			// readXXX() : XXX => 기본 자료형
			System.out.println(dis.readInt());
			System.out.println(dis.readLong());
			System.out.println(dis.readChar());
			System.out.println(dis.readDouble());
			System.out.println(dis.readFloat());
			System.out.println(dis.readBoolean());
		} catch (Exception e) {
		} finally {
			try {
			  if(dos != null) dos.close();
			  if(fos != null) fos.close();
			} catch (Exception e2) {
			}
		}
	}
}
