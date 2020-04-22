package com.ict.edu2;

import java.io.File;
import java.io.FileWriter;

// 2. ���� ��Ʈ�� (����߽�) : ��� ó���� 2byte�� ó�� 
//   ���� ��Ʈ���� ��� : ���� ��� ���� ������ ���� ������ ������� �� ����
//   �ֻ��� Ŭ���� : Reader(�Է½�Ʈ��), Writer(��½�Ʈ��)

// FileOutputStream : 1byte��ó��, write(�ƽ�Ű�ڵ�), write(byte[] b),  
// FileWriter : 2byte��ó��, write(String str)
public class Ex01 {
	public static void main(String[] args) {
		String pathname 
		 = "C:"+File.separator+"study"+File.separator+"util"+ File.separator+"test05.txt";
		File file = new File(pathname);
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			
			fw.write("123456\n");
			fw.write("Hello~~\n");
			fw.write("���ѹα�");
			fw.write("true");
			fw.write("����");
			fw.flush();
		} catch (Exception e) {
		} finally {
			try {
				fw.close();
			} catch (Exception e2) {
			}
		}
	}
}
