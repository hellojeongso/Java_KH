package com.test02;

import java.util.Scanner;

public class MTest {
	/*
	 * 동적 바인딩 : 실행시(runtime) 메모리 할당을 하면서, 메소드를 동적으로 연동하는 방식
	 * 1. 코드 절약    2. 실행속도 향상    3. 행위 은닉
	 * 
	 * 다형성을 이용해서 동적바인딩을 한다..?
	 * 컴파일 하기전에 객체가 뭔지 모르는데... 뭐 실행해봐야 값이 뭔지 알 수 있다...
	 * 다 안적고 특정 객체와 특정 메소드만 사용하겠다..그럼 코드도 절약...
	 */

	public static void main(String[] args) {
		System.out.println("선택해주세요 [1:고양이  2:멍멍이  3:코끼리]");
		Scanner sc = new Scanner(System.in);
		int select = sc.nextInt();
		
		Animal animal = null;
		// ↓ 콘솔창에서 번호를 선택해서 입력값을 나오게 할 것
		
		switch(select) {
		case 1:
			animal = new Cat();
			break;
		case 2:
			animal = new Dog();
			break;
		case 3:
			animal = new Elephant();
			break;
		}
		
		
		animal.start();
		animal.stop();
		
		// instanceof : 타입을 확인해주는 연산자
		// 어떤 타입의 객체인지 확인 해준다. animal 타입의 객체가 어떤 타입이냐 ! 
		// animal이 cat 타입의 객체라면...?
		if (animal instanceof Cat) {
			System.out.println("Cat type");
			} else if (animal instanceof Dog) {
				System.out.println("Dog type");
			} else if (animal instanceof Elephant) {
				System.out.println("Elephant type");
			}	
	}
}
