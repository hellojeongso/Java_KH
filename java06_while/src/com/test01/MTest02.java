package com.test01;

public class MTest02 {
	public static void main(String[] args) {
		// 1. 1~100까지의 숫자를 역순으로 출력하자.
		prn01();
		prn02();
		prn03();
		// 2. 1~100까지의 숫자 중 2의 배수만 출력하자
		//prn02();
		
		// 3. 1~100까지의 숫자 중 7의 배수의 갯수와 총 합을 출력하자.
		//prn03();
		
	}
	
	public static void prn01() {
		int i = 100;
		while(i>0) {
			// i가 0보다 크다가 참일때까지 출력해달라. 
			// i가 1이 될때가지 라고해서 i == 1라고 쓰면 안됨 
			System.out.println(i);
			i--;
			//i를 출력해주시고 하나씩 빼주세요. 
		}
	}
	
	public static void prn02() {
		int i = 1;
		
		while (i<101) {
			
			if(i%2==0) {
				System.out.println(i);
			}

			i++;
		}
	
	}
		
		
	
	
	public static void prn03() {
		int i = 1; //1부터 100까지 반복할 애
		int count = 0; // 7의 배수의 갯수를 세줄것
		int sum = 0; // 더할애
		
		while (i < 101) {
			// 만약 7의 배수라면,
			if (i % 7 == 0) {
			// count++해주고 (배수의 개수 증가)
			count++;
			// sum에다가 sum + 7의배수(현재값)을 넣자. 
			// sum = sum + i;
			// sum + 7의 배수란 뜻 
			sum += i;
			}
			i++;
			
		}
		System.out.println();
		System.out.println("7의 배수의 개수 : " + count);
		System.out.println("7의 배수의 총 합 : " + sum);
	}
	
	
	
}
