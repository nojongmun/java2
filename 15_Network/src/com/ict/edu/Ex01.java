package com.ict.edu;

import java.net.InetAddress;
import java.net.UnknownHostException;

// InetAddress : �ڹٿ��� IP�ּҸ� ǥ���ϴ� Ŭ����
//               �����ڰ� ���������� ������� �ʴ´�.
//                6���� static�޼ҵ带 �̿��Ѵ�.
//                ** localhost�� ���� ���� ����ϰ� �ִ� ��ǻ�͸� ���Ѵ�.
public class Ex01 {
	public static void main(String[] args) {
		try {
			InetAddress addr = InetAddress.getByName("www.naver.com");
			System.out.println("�̸� : " + addr.getHostName());
			System.out.println("IP : " + addr.getHostAddress());
			System.out.println("toString() : " + addr.toString());
			System.out.println("==========================");
			
			addr = InetAddress.getLocalHost();
			System.out.println("�̸� : " + addr.getHostName());
			System.out.println("IP : " + addr.getHostAddress());
			System.out.println("toString() : " + addr.toString());
			System.out.println("==========================");
			
			InetAddress[] addrs = InetAddress.getAllByName("www.daum.net");
			for (InetAddress k : addrs) {
				System.out.println("�̸� : " + k.getHostName());
				System.out.println("IP : " + k.getHostAddress());
				System.out.println("toString() : " + k.toString());
				System.out.println("------------------------");
			}
			System.out.println("==========================");
			// 210.89.160.88
			byte[] b = {(byte)(210),89,(byte)(160),88};
			addr = InetAddress.getByAddress(b);
			System.out.println("�̸� : " + addr.getHostName());
			System.out.println("IP : " + addr.getHostAddress());
			System.out.println("toString() : " + addr.toString());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}
}
