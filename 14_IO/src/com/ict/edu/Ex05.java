package com.ict.edu;

import java.io.BufferedOutputStream;
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

//  �߰�) BufferedOutputStream : ��� ��Ʈ�� ������ �����ϱ� ���ؼ� �⺻�� ����ϴ� Ŭ����
//       BufferedOutputStream�� ȥ�ڼ��� ����� �� ����. (OutputStream���� �Բ� ���)
public class Ex05 {
	public static void main(String[] args) {
		String pathname 
		   = "C:"+File.separator+"study"+File.separator+"util"+ File.separator+"test02.txt";
		File file = new File(pathname);
		FileOutputStream out = null;
		BufferedOutputStream bos = null;
		try {
			// ��Ʈ���� ��Ʈ�� ������ ��Ʈ�� ü�ι���̶�� �մϴ�. 
			out = new FileOutputStream(file);
			bos = new BufferedOutputStream(out);
	
			// �� ���� ���� 
			bos.write(65);  // A
			bos.flush();
			
			// �ƽ�Ű �ڵ� (����) ��ſ� char ���
			bos.write('J'); 
			bos.write('A');
			bos.write('V');
			bos.write('A');
			bos.flush();
			
			// ���� ���� ����
			byte[] b = {'j','a','v','a',13,10,'b','o','y'};
			bos.write(b);
			bos.flush();
			
			//// write(int b), write(byte[] b) =>  �񿵾�� ��� �Ұ� /////
			
			// String Ŭ���� �̿� : �񿵾�� ��� ����
			String msg ="\nHello\n�ȳ�\n123\n����";
			byte[] b2 = msg.getBytes();
			bos.write(b2);
			bos.flush();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
			   if(bos != null) bos.close();
			   if(out != null) out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}








