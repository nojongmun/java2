package com.ict.day03;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

// ���ѷ���, ������ ó�� 
// ������ ���Ǵ� Ŭ���� : ServerSocket, Socket
public class Ex04_Server implements Runnable {
	ServerSocket ss = null;
	Socket s = null;

	public Ex04_Server() {
		try {
			// ��Ʈ : ���ο� �ܺ��� �����ϴ� ����
			ss = new ServerSocket(7777);
			System.out.println("���� ����� ... ");
			new Thread(this).start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		try {
			while (true) {
               // Ŭ���̾�Ʈ�� �����Ҷ����� ��ٸ��ٰ� 
			   // ������ �ϸ� ���ӵ� ������ �����ϴ� ������ �ϳ� �����.
				// �������� ��� ������ s�� ���ؼ� �˼� �ִ�.
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
