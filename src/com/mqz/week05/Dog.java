package com.mqz.week05;

public class Dog extends Pet implements Swim{
	@Override
	public void talk() {
		System.out.println("ÍôÍôÍô");
	}
	@Override
	public void run() {
		System.out.println("DogRun");
	}
	
	@Override
	public void Swimming() {
		// TODO Auto-generated method stub
		System.out.println("Dog Swim");
	}
	
	
	
}
