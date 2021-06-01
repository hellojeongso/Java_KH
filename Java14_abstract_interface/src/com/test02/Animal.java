package com.test02;

public abstract class Animal {
	// 클래스 만들때 abstract 체크할 것

	public Animal() {
		System.out.println("animal instance");
	}
	
	public abstract void start();
	public abstract void stop();
	// 추상 메소드 두개 만듬 !
	// 그러면 Animal을 상속받은 새로운 클래스(cat,Dog 등..)에 메소드가 자동으로 오버라이딩된다.(추상메소드)
}
