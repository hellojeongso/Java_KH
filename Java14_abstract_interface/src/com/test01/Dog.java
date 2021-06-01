package com.test01;

public class Dog extends Animal {
	// 슈퍼클래스 지정 안하고 클래스를 만들면 Dog에 밑줄 뜨고 두가지 선택지가 나타난다. 
	// 1. bark 메소드 구현할래? 2. 너도 추상클래스 할래?

	@Override
	public void bark() {
		System.out.println("멍멍");
	}
	
	@Override
	public void eat(String feed) {
		System.out.println("멍멍이가");
		super.eat(feed);
	}

}
