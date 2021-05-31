package com.test03;

public class SumX {

	
	/*
	 * 1 2 3 4 5 
	 * 6 7 8 9 10
	 * 11 12 13 14 15
	 * 16 17 18 19 20
	 * 21 22 23 24 25
	 * 
	 * X의 총 합을 구하자
	 * 1 5 7 9  13  17 19 21 25
	 * 117나옴 정답
	 * hint : 행렬이라고 생각해보자 (중첩된 포문 포문두개)
	 */
	
	public static void main(String[] args) {
	prn01();	
	}
	
	
	public static void prn01() {
		
		int cnt = 1;
		int sum = 0;
		
		for (int i= 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if ((i == j)||(i + j == 4)) {
					sum += cnt;
					//i가 j와 같다면 더하자
					//이거나 i+j가 4라면 더하자 
					//코드 작성후에 브레이크 포인트 잡고 F11눌러서 확인해보기
				}
				System.out.printf("%3d", cnt++);
				// 여기까지는 1부터 25까지 5줄씩 나옴
			}
			
			System.out.println();
			
		}
		
		System.out.println(sum);
		
		
	}
}
