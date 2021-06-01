package com.test01;
// 슈퍼클래스 지정하니까 자동으로 Override 만들어짐
public class Cat extends Animal {

	@Override
	public void bark() {
		System.out.println("야옹");

	}
	// eat 메소드 => 해도 되고, 안해도 되고. 
	// bark 메소드 => 반드시 해야한다. 
}
