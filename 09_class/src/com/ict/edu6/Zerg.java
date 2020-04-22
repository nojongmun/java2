package com.ict.edu6;

public class Zerg implements Unit {
	String name;
	int energy;

	public Zerg(String name) {
		this.name = name;
		energy = 500 ;
	}

	@Override
	public void decEnergy() {
       this.energy = this.energy - 25;
	}

}
