package com.ict.edu5;

public class TestMain {
	public static void main(String[] args) {
		Character ch = new Character("주인공");
		ch.walk();
		ch.run();
		ch.attack();
		ch.shield();
		   
	   System.out.println("==========");
	   Monster mon = new Monster("악당");
	   mon.walk();
	   mon.run();
	   mon.attack();
	   mon.shield();
	}
}