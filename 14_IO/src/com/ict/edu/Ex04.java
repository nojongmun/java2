package com.ict.edu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 1. ����Ʈ ��Ʈ�� (����߽�) : ��� ó���� 1byte �� ó��
//    ����Ʈ ��Ʈ�� ���  : byte�� �̷���� ��� ���� (����, �Ҹ�, ���� �� ��� ���� ����)
//    �ֻ��� Ŭ���� : InputStream(�Է½�Ʈ��), OutputStream(��½�Ʈ��)

//  FileOutputStream �ֿ� �޼ҵ�
//  write(int b) : int  =>  �ƽ�Ű �ڵ�(����)�ϳ�, => �ϳ��� ����
//                 int b ��� char�� �־ ��� �� �� �ִ�.
//                 �ƽ�Ű �ڵ�(0-9, a-z, A-Z, �Ϻ� Ư�����ڸ� ����, �������� ��¾ȵ�)
//                 => �ѱ�, ���� �� �񿵾�� ���ڴ� ǥ�� �ȵ�
//  write(byte[] b) : int  => 1byte�� �迭�� �����ϰ�, ���� �� ��ŭ ��ȯ�Ѵ�.
//  flush() : write() �� �ݵ�� ���ּ��� 
//  close() : open ��Ʈ���� �ݱ� (finally���� ó������)

public class Ex04 {
	public static void main(String[] args) {
		String pathname 
		   = "C:"+File.separator+"study"+File.separator+"util"+ File.separator+"test01.txt";
		File file = new File(pathname);
		FileOutputStream out = null;
		try {
			// ����� 
			out = new FileOutputStream(file);
			
			// �̾��
			// out = new FileOutputStream(file, true);
			
			// �� ���� ���� 
			out.write(65);  // A
			out.flush();
			
			// �ƽ�Ű �ڵ� (����) ��ſ� char ���
			out.write('J'); 
			out.write('A');
			out.write('V');
			out.write('A');
			out.flush();
			
			// ���� ���� ����
			byte[] b = {'j','a','v','a',13,10,'b','o','y'};
			out.write(b);
			out.flush();
			
			//// write(int b), write(byte[] b) =>  �񿵾�� ��� �Ұ� /////
			
			// String Ŭ���� �̿� : �񿵾�� ��� ����
			String msg ="\nHello\n�ȳ�\n123\n����";
			byte[] b2 = msg.getBytes();
			out.write(b2);
			out.flush();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
			   if(out != null) out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}








