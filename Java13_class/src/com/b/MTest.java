package com.b;

import com.a.AAA;

public class MTest {

	public static void main(String[] args) {
		BBB b1 = new BBB();
		b1.setAbc(10); // setabc 즉 부모클래스 상속받아서 에러가 안난 것
		b1.setB(20);
		System.out.println(b1.getAbc());
		System.out.println(b1.getSum());
		
		BBB b2 = new BBB(10);
		// 1. 파라미터 한개 짜리 생성자 호출
		// 	bbb(int b)에 10 들어감
		// 2. bbb에서 super(d)가 aaa 부모생성자 호출
		// 3. public AAA (int abc에 10에 전달 
		// AAA 객체에서 this.abc에 10이 들어감
		// bbb 객체에서 this.b에도 10들어감 
		System.out.println(b2.getAbc());
		System.out.println(b2.getB());
		System.out.println(b2.getSum());
		b2.prn();
		
		AAA a1 = new AAA();
		AAA a2 = new BBB();
		
		a1.prn();
		a2.prn();
		//AAA a1 = new AAA();
		//System.out.println(a1.getAbc());
		//AAA a2 = new AAA(10);
		//System.out.println(a2.getAbc());
		
	}
}