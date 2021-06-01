package com.test01;

public abstract class Animal {

	public void eat(String feed) {
		System.out.println(feed + "먹는다.");
	} // 그냥 흔한 메소드 선언
	
	// 추상 메소드 -> 상속 받는 자식 클래스가 반드시 구현해야한다 ! (오버라이딩도 같은 말) 
	public abstract void bark();
	
	
	
	// 공통적인 메소드는 만들어놓고 개별적인 메소드는 추상메소드로 이용한다.
	// 짖는 소리는 동물마다 다르니까.. 
}
