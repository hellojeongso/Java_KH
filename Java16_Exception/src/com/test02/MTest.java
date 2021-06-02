package com.test02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MTest {
	public static void main(String[] args) {
		
	
	int a = 0;
	
	try {
		System.out.println("숫자를 입력해 주세요");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
	
		if (a == 4) {
			throw new MyException("반장이 좋아하는 4");
			}
		} catch(MyException e) {
			System.out.println("MyException 발생");
			e.printStackTrace();
			// try 정상적으로 실행이 됐든, catch로 오류가 발생이 됐든
			// 꼭 마지막에 실행해야하는 명령문이 finally ! 
			
		} catch(InputMismatchException e) {
			System.out.println("숫자가 아닌 다른 것 !");
			e.printStackTrace();
		} catch(ArithmeticException e) {
			System.out.println("계산 잘못되었을 때 !");
		} catch (Exception e) { // 위 오류 빼고 모든 예외는 여기에 잡힘
								// 맨 위에다 적을 수도 있지만, 세부적인 오류 상황마다 조치를 할 수 없으니까 
								// 조건(?)으로 catch를 걸어두고 마지막 조치로 Exception 달아둔 것! 
			System.out.println("뭐진 몰라도 어쨌든 예외 발생");
			e.printStackTrace();
			
		} finally {
			System.out.println("입력한 값 : " + a);
		}

	}
}