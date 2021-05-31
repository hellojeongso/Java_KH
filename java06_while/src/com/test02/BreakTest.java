package com.test02;

public class BreakTest {
	/*
	 * A B C D E 
	 * F G H I J 
	 * K L M N O 
	 * P Q R S T
	 * U V W X Y
	 * Z
	 * 를 출력하자.
	 * 
	 * break를 자세하게 써보기 위해 조금 더 어렵게 코드를 짤 것 ! 
	 */
	
	
	public static void prn() {
		int count = 0;
		char c = 'A';
		boolean stop = false;
		
		while (!stop) {	
			while (true) {
				System.out.printf("%2c", c);
				c++;
				count++;
				
				if(count % 5== 0) {
					break;
				}
				
				if(count % 26 == 0) {
					stop = true;
					break;
				}
			}
		
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		prn();
	
	}
}
