package com.mqz.week05;

public class Pet {
	private String name;
	private double age;
	public void talk() {
		System.out.println("�нн�");
	}
	public void run() {
		System.out.println("������");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}
	
	
	
}
