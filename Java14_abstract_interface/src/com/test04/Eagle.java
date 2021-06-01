package com.test04;
// 쓸 때는 extends(클래스)먼저 나온다. 인터페이스는 여러 상속이 가능하다. Bird , , 가능 
public class Eagle extends Animal implements Bird {

	@Override
	public void fly() {
		System.out.println("파닥파닥");

	}

	@Override
	public void bark() {
		System.out.println("구구구");

	}

}
