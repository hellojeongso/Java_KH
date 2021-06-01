package com.test01;

public class MTest {

	public static void main(String[] args) {
		AA a = new AA();
		
		// 부모 타입으로 자식 객체 대입 가능 (다형성) 
		Super s = a;
			// 큰 타입에서 작은 타입은 명시적형변환 ! Super => AA
		//AA abc = (AA) s;
		//System.out.println(abc);
		// 슈퍼 타입이지만 a는 자식 객체
		
		
		// java.lang.ClassCastException
		BB b = (BB) s; // BB의 b는 BB로 형변환 한 s
		System.out.println(b);
		// S는 AA만 담고있는데 new로 super와 BB가 없는데 BB로 형변환이 안돼서 안됨

		}
}
