package com.mqz.week05;

public class GirlFriend {
	public void getPet(Pet pet){
		System.out.println("���ճ��"+pet.getName());
	}
	public static void main(String[] args) {
		GirlFriend girl = new GirlFriend();
		Pet pet = new Pet();
		pet.setName("TestPet");
		girl.getPet(pet);
	}
}
