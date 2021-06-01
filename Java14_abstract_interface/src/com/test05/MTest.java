package com.test05;

public class MTest {

	public static void main(String[] args) {
		TV tv = new IgTV();
		
		System.out.println(tv.volumeUp());
		System.out.println(tv.volumeUp());
		System.out.println(tv.volumeUp());
		System.out.println(tv);
		System.out.println(tv.volumeDown());
		System.out.println(tv.volumeDown());
		System.out.println(tv.volumeDown());
		
		tv = new SamsongTV();
		// 앞에 TV는 쓰면 안됨 그럼 똑같은거 또 만들어지는데 안됨
		System.out.println(tv.volumeUp());
		System.out.println(tv.volumeUp());
		System.out.println(tv.volumeUp());
		System.out.println(tv);
		System.out.println(tv.volumeDown());
		System.out.println(tv.volumeDown());
		System.out.println(tv.volumeDown());
		

	}

}
