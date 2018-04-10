package com.mqz.week05;

public class Cat extends Pet implements Mouse{
	@Override
	public void talk() {
		System.out.println("ίχίχίχ");
	}
	@Override
	public void run() {
		System.out.println("CatRun");
	}
	@Override
	public void Catch() {
		// TODO Auto-generated method stub
		System.out.println("Cat catch mouse");
	}
	
	
	
}
