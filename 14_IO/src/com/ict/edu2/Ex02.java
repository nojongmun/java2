package com.ict.edu2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

// 2. ���� ��Ʈ�� (����߽�) : ��� ó���� 2byte�� ó�� 
//   ���� ��Ʈ���� ��� : ���� ��� ���� ������ ���� ������ ������� �� ����
//   �ֻ��� Ŭ���� : Reader(�Է½�Ʈ��), Writer(��½�Ʈ��)

// FileOutputStream : 1byte��ó��, write(�ƽ�Ű�ڵ�), write(byte[] b),  
// FileWriter : 2byte��ó��, write(String str)
// �߰�) BufferedWriter �߰� : newLine() �޼ҵ� ���� => ���� ���⸦ �� ���ִ� �޼ҵ�
public class Ex02 {
	public static void main(String[] args) {
		String pathname 
		 = "C:"+File.separator+"study"+File.separator+"util"+ File.separator+"test06.txt";
		File file = new File(pathname);
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			bw.write("123456\n");
			bw.write("Hello~~\n");
			bw.write("���ѹα�");
			bw.newLine();
			bw.write("true");
			bw.newLine();
			bw.write("����");
			bw.newLine();
			bw.flush();
		} catch (Exception e) {
		} finally {
			try {
				bw.close();
				fw.close();
			} catch (Exception e2) {
			}
		}
	}
}
