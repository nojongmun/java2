package com.ict.edu2;

import java.util.ArrayList;
import java.util.List;

// 자동차 생산 공장
public class Car {
	// car를 가지고 있는 리스트
	private List<String> carList = null;
	public Car() {
		carList = new ArrayList<String>();
	}
	// 랜덤으로 자동차 생성하기
	public String getCat() {
		String carName = null;
		switch ((int)(Math.random()*3)) {
			case 0: carName="SM5"; break;
			case 1: carName="매그너스"; break;
			case 2: carName="카렌스"; break;
		}
		return carName;
	}
	// carList에서 차를  팔기
	public synchronized String pop() {
		String carName = null;
		
		// car 재고가 없을 때 
		if(carList.size() == 0) {
			System.out.println("차가 없어요 . 생산할때 까지 기다리세요");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// 리스트의 맨 마지막에 존재하는 carName을 반환하고 삭제하기 (판매한것)
		carName = (String)carList.remove(carList.size()-1);
		System.out.println("손님이 차를 사갔습니다. 판매한 차 이름은  : " + carName+"\n" );
		
		return carName;
	}
	
	// carList에 차를  채워넣기
	public synchronized void push(String car) {
		// 받은 car를 리스트에 넣기
		carList.add(car);
		System.out.println("차가 만들어 졌습니다. 만들어진 차 이름은 :  "+car+"\n");
		
		// 재고가 없을때는 wait()된 스레드를 다시 실행 시키는 구문
		if(carList.size() == 5) {
			notify();
		}
	}
}





