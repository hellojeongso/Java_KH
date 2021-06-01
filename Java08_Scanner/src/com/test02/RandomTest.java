package com.test02;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
	mathClass();
	//randomClass();
}
	public static void randomClass() {
		Random rd = new Random();
		System.out.println(rd.nextInt(100));
	} // static 붙어서 이렇게 호출한다는 것을 이해하기
	
	public static void mathClass() {
		// Math라는 클래스에.random메소드로 만들어진 값은 0.0 <= x < 1.0; x가 그렇단거임
		//double dran = Math.random();
		//System.out.println(dran);
		// min ~ max까지
		// (int)(math.random()*(max-min+1))+min;
		int min = 100;
		int max = 110;
		int ran = (int)(Math.random()*(max - min + 1)) + min;
		System.out.println(ran);
		// (int) int를 형변환해서란 뜻 
	}
}
