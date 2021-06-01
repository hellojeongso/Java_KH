package com.test02;

public class MTest {
	
	public static void main(String[] args) {
		
	/*
	Cat cat = new Cat();
	cat.bark();
	
	Dog dog = new Dog();
	dog.bark();
	*/
		
	Animal some = new Dog();
	some.bark();
	
	some = new Cat();
	some.bark();
	// some.eat(); Animal타입이기 때문에 자식 객체의 메소드를 못가져옴 
	
	/*
	 * 다형성
	 * 1. 부모(선조)타입으로 자식(후손)생성
	 * 	 Parent p = new Child();
	 * 2. 부모의 이름에 자식 객체 대입
	 * 	 Child c = new Child();
	 *   Parent p = c;
	 * 3. 부모의 메서드를 통해 자식의 메서드 호출
	 */
	}
}