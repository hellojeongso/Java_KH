package com.test01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionCalc {
	
	// 메소드▼
	public int calculation() {
		int res = 0;
		
		while(true) {
			try {
				res = inputNum() / inputNum();	
				 	 // 정확히 말하면 sc.nextInt를 가르킴
					 // 여기서 인풋미스웅앵이나 ari웅앵 에러가 발생하면 캐치가 잡아주고 명령문 수행하고 리턴돼서 올라감
				break;
			} catch(InputMismatchException e) { // input웅앵 타입 e는 변수 = 값 inputnum인듯? 
				System.out.println("숫자만 입력하라고!");
				e.printStackTrace();
				//Stack은 filo을 의미한다.
				//콘솔창에 a\라고 쳐서 일부로 오류를 내보자. 
				//그럼 오류가 좌르륵 나온느데 아래부터 읽어서 오류해결해야한다
			} catch(ArithmeticException e) {
				System.out.println("0으로 나누시면 안됩니다.");
				e.printStackTrace();
			}
		}
		return res;
	}
	
	public int inputNum() {
		System.out.println("숫자만 입력해주세요 : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		return n;
	}
}
