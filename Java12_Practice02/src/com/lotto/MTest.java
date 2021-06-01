package com.lotto;

/*
 * 중복되지 않는 6개 숫자 (1~45)를 작은 순부터 차례대로 정렬하여 콘솔에 출력하는 프로그램
 */

public class MTest {
	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		lotto.prn();
	}

	}

	
	/*오답 public static void lotto() {
		
		int[] lotto = new int[6];
		
		int min = 1;
		int max = 45;
		
		for(int i=1; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*(max-min +1)) + min;
			for (int j=1; j<i; j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
			
			}
		
		for(int i=1; i<lotto.length; i++) {
			System.out.println(lotto[i]+" ");
		}
		System.out.println("Lotto 추첨 번호는" + lotto);
			
			
	}

}
 */
	