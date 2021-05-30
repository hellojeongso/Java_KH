package com.test03;

public class MTest {

	public static void main(String[] args) {
		
		// 호출하니까 sum에 10과 20을 전달해서 
		// result라는 변수에 전달해서 10,20,30이라는 수를 포멧터에게 전달하여 실행함
		MyCalc.sum(10, 20);
		
		// 리턴이라는 키워드가 생겨서 
		int sub = MyCalc.sub(10,2);
		System.out.println(sub);
		
		
		double mul = MyCalc.mul(1.2, 3.4);
		System.out.println(mul);
		
		MyCalc.div(10, 3);
	}
}
