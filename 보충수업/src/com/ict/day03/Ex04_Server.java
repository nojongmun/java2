package com.ict.day03;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

// 무한루프, 스레드 처리 
// 서버에 사용되는 클래스 : ServerSocket, Socket
public class Ex04_Server implements Runnable {
	ServerSocket ss = null;
	Socket s = null;

	public Ex04_Server() {
		try {
			// 포트 : 내부와 외부을 연결하는 관문
			ss = new ServerSocket(7777);
			System.out.println("서버 대기중 ... ");
			new Thread(this).start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		try {
			while (true) {
               // 클라이언트가 접속할때까지 기다리다가 
			   // 접속을 하면 접속된 정보를 저장하는 소켓을 하나 만든다.
				// 접속자의 모든 정보는 s을 통해서 알수 있다.
				s = ss.accept();
				System.out.println(s.getInetAddress().getHostAddress());
				System.out.println(s.getInetAddress().getHostName());
			}
		} catch (Exception e) {
		}
	}

	public static void main(String[] args) {
		new Ex04_Server();
	}
}
