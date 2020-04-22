package com.ict.edu;

import java.io.File;
import java.io.FileInputStream;

// ��Ʈ���� ���� : ����Ʈ ��Ʈ��, ���ڽ�Ʈ��, ����Ʈ��Ʈ��-���ڽ�Ʈ�� ����, ������Ʈ ��Ʈ��
// 1. ����Ʈ ��Ʈ�� (����߽�) : ��� ó���� 1byte �� ó��
//    ����Ʈ ��Ʈ�� ���  : byte�� �̷���� ��� ���� (����, �Ҹ�, ���� �� ��� ���� ����)
//    �ֻ��� Ŭ���� : InputStream(�Է½�Ʈ��), OutputStream(��½�Ʈ��)

//  FileInputStream �ֿ� �޼ҵ�
//  read() : int => �ƽ�Ű�ڵ�(����) �ϳ� ��ȯ(�� ���� �о���� �޼ҵ�)
//                  �� �̻� ���� �� ���� �� -1 
//                  �ƽ�Ű�ڵ� �̱� ������ ����, �ҹ���, �빮��, �Ϻ�Ư�����ڸ� �б� ����
//                  �ƽ�Ű�ڵ� �̱� ������ ���ڷ� ���� ���ؼ��� char ����ȯ �ؾ� �ȴ�.

//  read(byte[] b) : int => 1byte�� �迭�� �����ϰ�, �д� �� ��ŭ ��ȯ�Ѵ�.
//                  ** ũ������ �ؾ� �ȴ�.
//  close() : �Է� ��Ʈ�� �ݱ�


public class Ex06 {
	public static void main(String[] args) {
		String pathname 
		   = "C:"+File.separator+"study"+File.separator+"util"+ File.separator+"test01.txt";
		File file = new File(pathname);
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			
			/* �� ���� �о����  = > read()
			int k = fis.read();
			System.out.println(k+ ":" + (char)(k));
			*/
			
			// ��ü ���� �о� ���� : �񿵾�� ���ڴ� ǥ�� ����
			// �׸�, ����, ����  ����, �߶󳻱� , ���̱� � ���
			// 13 => CR(�ɸ�������) : �� �� ó������ �̵�
			// 10 => LF(�����ǵ�) : �����ٷ� ����
			int k = 0 ;
			/*
			while (true) {
				 k = fis.read();
				 if(k == -1) break;
				 System.out.println(k+ ":" + (char)(k));
			}
			*/
			/*
			while ((k=fis.read()) != -1) {
				 System.out.println(k+ ":" + (char)(k));
			}
			*/
			//  �迭�� ũ��� ������ ũ�� ��ŭ���� ����
			// 
			byte[] b = new byte[(byte)(file.length())] ;
			// ������ byte[] b �� ����ȴ�.
			fis.read(b);
			for (byte c : b) {
				System.out.println(c + ":" + (char)(c));
			}
			System.out.println("==================");
			
			// String Ŭ������ �̿��ϸ� �񿵾�� ���� ǥ�� �ȴ�.
			String msg = new String(b);
			System.out.println(msg);
		} catch (Exception e) {
		} finally {
			try {
				if(fis != null) fis.close();
			} catch (Exception e2) {
			}
		}
		
	}
}











