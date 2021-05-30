package com.test01;

public class MTest02 {

	public static void main(String[] args) {
		// Static : Class.method();
		MTest01.publicMethod();
		MTest01.protectedMethod();
		MTest01.defaultMethod();
		// MTest01.privateMethod();
		System.out.println("----------------------");
		
		// non-static : Class 변수 = new Class();
		//			  	변수.method(); 호출 하는 방법임 외워야함
		MTest01 nonStatic = new MTest01();
		nonStatic.nonStaticMethod();
		
	}
}
