package com.ict.edu5;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

// 객체의 정보를 담을 수 있는 멤버들로 구성 되어야 한다.
// Externalizable 인터페이스를 사용하여서 직렬화를 만드다.(추상클래스인데 추상메소드가 있다.) 
//  - readExternal() , writeExternal() 
// 추상메소드에 해당 멤버들을 넣어줘야 직렬화 대상이 된다. (만약에 빼면 대상에서 제외된다.) 
public class VO implements Externalizable{
	private String name;
	private int age ;
	private double weight ;
	private boolean gender ;
	
	public VO() {}
	public VO(String name, int age, double weight, boolean gender) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
	  // name = (String) in.readObject();
	  age = (int) in.readObject();
	  weight = (double) in.readObject();
	 // gender = (boolean) in.readObject();
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
	   //out.writeObject(name);
	   out.writeObject(age);
	   out.writeObject(weight);
	   // out.writeObject(gender);
	}
}
