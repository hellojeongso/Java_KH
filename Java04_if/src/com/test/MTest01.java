package com.test;

public class MTest01 {

	public static void main(String[] args) {
		// if : 만약에 ~ 라면
		prn01();
		prn02(true, false);

	}

	public static void prn01() {
		int i = 10;
		int j = 20;
		
		// 해당 조건이 참이라면 해당 명령문을 수행한다. 거짓이면 수행안함 
		if (i >= 10) {
			System.out.println("i는 10보다 크거나 같습니다.");
			
		}
		
		// if ~ else 조건이 참이면 if 명령문 수행하고 거짓이면 else 명령문 수행
		if (j < 10) {
			System.out.println("j는 10보다 작습니다.");
		}
		else { 
			System.out.println("j는 10보다 작지 않습니다.");
		}
		
		
		// if ~ else if ~ else   else if 다음조건 거짓이면 또 다음 조건 다 거짓이면 
		// 모든 조건이 거짓일 때 마지막 else 명령문 수행
		// 여러 만약에 
		if (i > j) {
			System.out.println("i가 j보다 큽니다.");
		} else if (i == j) {
			System.out.println("i와 j가 같습니다");
		} else {
			System.out.println("i가 j보다 작습니다");
		}
	}

	public static void prn02(boolean ring, boolean married) {
			if(ring) {
			   	 if(married) {
					System.out.println("결혼하셨군요!");
			   } else {
				  	System.out.println("연인이 있으시군요");
		  	   } 
				
		    }	else { 
			   	 if (married) {
					System.out.println("결혼하셨군요..!");
				 } else {
					System.out.println("솔로셨군요..");
				}
			}
				
			
			System.out.println("---------------");
			
			if (ring && married) {
				System.out.println("결혼하셨군요!");
			} else if (ring || married) {
				System.out.println("연인이 있으시군요!");
			} else {
				System.out.println("솔로셨군요...!");
			}
     }
}

