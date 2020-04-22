package com.ict.edu2;

public class Ex03_Main {
	public static void main(String[] args) {
		 Ex03_DCaphone dca = new Ex03_DCaphone();
		 dca.dca();
		 dca.call();
		 dca.sms();
		 
		 Ex03_MP3phone mp3 = new Ex03_MP3phone();
		 mp3.sound();
		 mp3.call();
		 mp3.sms();
		 
		 Ex03_gamephone game = new Ex03_gamephone();
		 game.play();
		 game.call();
		 game.sms();
	}
}
