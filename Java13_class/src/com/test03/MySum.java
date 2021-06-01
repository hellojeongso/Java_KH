package com.test03;

public class MySum {

	public static int sum (int i, int j) {
		return i + j;
	}
	
	public static double sum (double i , double j) {
		return i+j;
	}

	// 파라미터 갯수나 타입이 다르면 같은 이름의 메소드 선언 가능
	
	public static void sum (int i, int j, int k) {
		System.out.println(i+j+k);
	}
}
