package com.test03;

public class RandomCube {
	public static void main(String[] args) {
		prn();
	}
	
	/*
	 * 1)
	 * 1 ~ 9 사이의 랜덤한 숫자를 가지고
	 * 5 * 5 형태의 숫자 상자를 출력하자
	 * 2 4 1 9 3
	 * 4 5 8 3 1
	 * 이런식으로 5*5사이즈
	 * 
	 */
	
	/* 2)
	 * 만들어진 큐브에서 X의 합을 출력하고,
	 * 전체(25개 숫자)의 평균을 출력하자.
	 */

	public static void prn() {
		
		int sumX = 0;
		//X의 합계 구하는 변수
		
		int sumAll = 0;
		// 전체합
		int cnt = 0; 
		// 전체가 몇개(25개임)를 더했는지 알아야 평균을구한다
		
		
		// 랜덤 불러오기 
		for (int i = 0; i < 5; i++) {
			// i가 0일때 j는 01234
			// i가 1일때 j가 01234
			for (int j = 0; j < 5; j++ ) {
				
				int ran = (int)(Math.random()*9) +1;
				// int ran이라는 지역변수는
				//큰 포문 안에 들어가있으면 이미 만들어진거 
				// 작은 포문으로 돌아갈때까지 나오니 줄로 랜덤 나오고
				//메소드 바깥에 넣으면 이미 만들어진 랜덤값의 숫자만 나온다
				//작은 포문안에 넣어야한다
				System.out.printf("%2d",ran);
				// 여기까지 25개의 랜덤숫자를 만듬 
				
				// x (대각선)의 합 아까배운거
				if( (i+j==4)||(i==j)) {
					sumX += ran;
				}
				
				// 전체 합, 더할때마다 카운트도 세줌
				sumAll +=ran;
				cnt++;
					
			}
				System.out.println();

		}
		double avg=(double)sumAll/cnt;
		// 썸올 cnt가 인트니까 소수점으로 변환하기 위해 더블

		System.out.println("X의 합 :" + sumX);
		System.out.println("전체 평균 : " + avg);
	}
}
