package com.ict.edu;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// DataInputStream�� DataOutputStream
// �⺻ �ڷ����� �����͸� �ְ� ���� �� ��� 
// ** �ݵ�� �Է¼����� ��� ������  ����� �Ѵ�.
// �⺻ �����ڰ� ��� BufferedInputSteram�� BufferedOutputSteramó��
// FileInputStream�� FileOutputStream�� �̿� �Ѵ�.

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
			// ��� : ����
			fos = new FileOutputStream(file);
			dos = new DataOutputStream(fos);
			
			// writeXXX() : XXX =>�⺻ �ڷ���
			dos.writeInt(975);
			dos.writeLong(41L);
			dos.writeChar('C');
			dos.writeDouble(24.12);
			dos.writeFloat(21.369f);
			dos.writeBoolean(true);
			dos.flush();
			
			
			// �Է� : �б�
			fis = new FileInputStream(file);
			dis = new DataInputStream(fis);
			
			// readXXX() : XXX => �⺻ �ڷ���
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
