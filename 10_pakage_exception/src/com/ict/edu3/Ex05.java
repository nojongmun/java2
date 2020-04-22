package com.ict.edu3;

import java.util.InputMismatchException;
import java.util.Scanner;

// finally : ����ó���� ������� �ݵ�� ���� �ؾ� �Ǵ� ������ ó�� �Ҷ� ���
//           �����ͺ��̽�, I/O, ��Ʈ��ũ���� ����Ѵ�.
// ���� : 
//  try{
//      ���� �߻� ������ ����� ;
//  } catch(���ܰ�ü e){
//      ���� ��ü ó�� ����;
//  } catch(���ܰ�ü e){
//      ���� ��ü ó�� ����;'
//  } finally{
//     ���� ó���� ������� �ݵ�� �����ؾ� �ϴ� ����;
//  }

public class Ex05 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			int var = 50 ;
			System.out.print("�����Է� : ");
			int su = sc.nextInt();
			System.out.println("���� : " + (var / su));
		} catch (InputMismatchException e) {
			System.out.println("������ �Է���  �ּ���");
			return ;
		} catch (ArithmeticException e) {
			System.out.println("0���δ� ���� ���� �����ϴ�.");
			return;
		} finally {
			System.out.println("�ݵ�� �����ϴ� ����");
		}
		System.out.println("���� �ϼ̽��ϴ�.");
	}
}
