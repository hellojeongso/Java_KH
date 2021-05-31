package com.test01;

public class MTest01 {
		public static void main(String[] args) {
	
			//int i = 1;
			
		//prn01();
		prn02();
		}
		
		public static void prn02() {
			for (int i = 100; i > 0; i--) {
		// 인트는 백부터 i가 영이 e될때까지 i--할거야
				System.out.println(i);
		}
		}
		
		
		
		public static void prn01() {
			
				// 초기값; 조건식; 증감식 MTest03 참조
				// for에서는 초기값과 조건식 증감식이 한꺼번에 들어간다. 
				// 그래서 for를 while로 while을 for로 바꿀 줄 알아야함
			for(int i = 0; i < 10; i++) {
				System.out.println(i);
			}
		}

}
