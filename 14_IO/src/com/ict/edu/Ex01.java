package com.ict.edu;

import java.io.File;

// File Ŭ���� : Ư����ġ�� �����Ѵ� �����̳� ���丮(����)�� ó���ϴ� Ŭ����
// �ֿ� ������ : File(String ���), File(String �������, String �������)
//           File(File �������, String �������)
// �ֿ�޼ҵ� : 
//  - createNewFile() : ���� �����ϸ� true,
//  - mkdir(), mkdirs() :  ���丮 �����ϸ� true, 
//  - delete() : ����, ���� ����
//  - isFile() : �����̸� true, 
//  - isDirectory() : ���丮�̸� true,
//  - length() : ���̰� �ƴ϶� ������ ũ�⸦ byte�� ��ȯ
//  - list() : Ư����ġ�� ������ String[]�� ���� ��ȯ
//  - getAbsolutePath() : �����ּ�,
//  - getCanonicalPath() : ����ȭ�ּ�
//  - getPath() : ����ּ�
public class Ex01 {
	public static void main(String[] args) {
		// String pathname = "C:\\study\\util";
		// String pathname = "C:/study/util";
		// �ü���� ������� ��밡���ϴ� ��
		String pathname = "C:"+File.separator+"study"+File.separator+"util";
		File file = new File(pathname);
		String[] list = file.list();
		for (String k : list) {
			// System.out.println(k);
			File file2 = new File(pathname, k);
			
			// System.out.println(file2);
			if(file2.isDirectory()) {
				// ���丮�� ũ�Ⱑ ����
				System.out.println("���丮 : " + file2);
			}else {
				System.out.println("���� : " + file2 + ",  ũ�� : "+file2.length()+"byte");
			}
		}
	}
}





