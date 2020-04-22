package com.ict.edu;

import java.net.InetAddress;
import java.net.UnknownHostException;

// InetAddress : 자바에서 IP주소를 표현하는 클래스
//               생성자가 존재하지만 사용하지 않는다.
//                6개의 static메소드를 이용한다.
//                ** localhost란 현재 내가 사용하고 있는 컴퓨터를 말한다.
public class Ex01 {
	public static void main(String[] args) {
		try {
			InetAddress addr = InetAddress.getByName("www.naver.com");
			System.out.println("이름 : " + addr.getHostName());
			System.out.println("IP : " + addr.getHostAddress());
			System.out.println("toString() : " + addr.toString());
			System.out.println("==========================");
			
			addr = InetAddress.getLocalHost();
			System.out.println("이름 : " + addr.getHostName());
			System.out.println("IP : " + addr.getHostAddress());
			System.out.println("toString() : " + addr.toString());
			System.out.println("==========================");
			
			InetAddress[] addrs = InetAddress.getAllByName("www.daum.net");
			for (InetAddress k : addrs) {
				System.out.println("이름 : " + k.getHostName());
				System.out.println("IP : " + k.getHostAddress());
				System.out.println("toString() : " + k.toString());
				System.out.println("------------------------");
			}
			System.out.println("==========================");
			// 210.89.160.88
			byte[] b = {(byte)(210),89,(byte)(160),88};
			addr = InetAddress.getByAddress(b);
			System.out.println("이름 : " + addr.getHostName());
			System.out.println("IP : " + addr.getHostAddress());
			System.out.println("toString() : " + addr.toString());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}
}
