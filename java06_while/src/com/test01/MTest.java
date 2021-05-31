package com.test01;

public class MTest {
	public static void main(String[] args) {
	/*
	 *  while(조건) {
	 *  	조건이 참일 때 반복될 명령;
	 *  } 
	 *  아래 i++ 지우면 1이 계속 나오면서 무한루프
	 */
		
		//prn01();
		prn02();
		//prn03();
	}
	
		

	
	public static void prn01() {
		int i=1;
		
		while (i<10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("while이 종료된 이후의 i값 : " + i);
	}
	
	public static void prn02() {
		int i = 1;
		
		do {
			System.out.println(i);
			i++;
		} while (i < 10);
		// i == 10이 아닌 이유 ! i가 1일 때 조건이 false이다. 
		// 나중에 while(i == 10); 해보기
		
		System.out.println("do~while 종료 후 i : " + i);
	}

	public static void prn03() {
		
		int i = 1;
		while (true) {
			System.out.println(i);
			i++;
			if (i == 10) { //만일 i가 10이라면 브레이크하자
				break;
			}
	}
	}
}
	
	
	
