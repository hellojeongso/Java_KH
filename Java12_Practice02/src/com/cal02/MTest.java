package com.cal02;
import java.util.Scanner;

public class MTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("연도 입력 :");
		int year = sc.nextInt();
		System.out.println("월 입력 :");
		int month = sc.nextInt();
		
		CalenderUseApi cal = new CalenderUseApi();
		cal.prn(year, month);
	}
}
