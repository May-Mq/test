package com.mqz.week05;

public class PetMen {
	public static void main(String[] args) {
		Pet array[] = new Pet[2];
		
		array[0] = new Dog();
		array[0].setName("��һ��");
		array[0].setAge(1.5);
		
		array[1] = new Cat();
		array[1].setName("èһ��");
		array[1].setAge(0.5);
		
		for(int i=0 ; i<2 ; i++ ) {
			System.out.println("�ҵ��ǳ��ǣ�"+array[i].getName()+",�ҵ������ǣ�"+array[i].getAge());
			array[i].talk();
			array[i].run();
			
			if(array[i] instanceof Swim) {
				((Swim)array[i]).Swimming();
			}
			if(array[i] instanceof Mouse) {
				((Mouse)array[i]).Catch();
			}
		}
	}
}
