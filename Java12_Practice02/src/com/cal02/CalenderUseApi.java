package com.cal02;

import java.util.Calendar;

//java.util.Calender 사용하여, 달력만들기

public class CalenderUseApi {

	public void prn(int year, int month) { // 출력한 연도와 월을 받아온다.
		
		// singleton -> 객체를 단 한번만 생성
		// Calendar cal2,3,4를 만들어도 같은 객체 참조한다. 
		Calendar cal = Calendar.getInstance();
		// getInstance 메소드를 이용하여 시스템의 날짜와 시간 정보를 표현할 수 있다. 
		// 객체는 실제 값
		
		System.out.printf("\t\t%d년 %d월\n", year, month);
		System.out.printf("일\t월\t화\t수\t목\t금\t토\n");
		// 스캐너 클래스 콘솔창에 출력할 날짜와 요일 입력 
		
		// year년 month월 1일로 Calender 객체 설정
		cal.set(year, month-1, 1);
		// 년 월 일 셋팅, 월은 0부터 시작하기때문에 -1
		// 1월은 0, 2월은 1, 3월은 2.. 배열의 인덱스값과 비슷?
		
		int start = cal.get(Calendar.DAY_OF_WEEK);
		// day of week는 요일을 의미하며 1~7까지의 값을 리턴한다
		// 일요일부터 ~ 토요일까지의 값을 리턴한다. 일요일은 1 토요일은 7

		// 요일을 출력하기 위해서 for문, start는 7
		// 요일 앞 공백
		for (int i = 1; i < start; i++) {
			System.out.printf("\t"); // 탭
		}
		
		// i : 1일부터 해당 연.월의 마지막 일까지 반복할 것
		// getActualMaximum는 캘린더 자체가 최대로 가질 수 있는 값(DATE는 1~31)
		for (int i = 1; i <= cal.getActualMaximum(Calendar.DATE); i++) {
			// 달력의 일 출력
			System.out.printf("%d\t", i);
			// start는 1일의 요일값(1~7사이의 값) 
			// 요일값(1~7)을 증가시키면서, 7의 배수가 되면 다음 줄로.
			// 아래 i가 아니라 start임 ! 
			if (start % 7 == 0) {
				System.out.println();
			}
			start++;
			// 스타트는 금요일이면 6 토요일이면 7
			// %7 == 0이니까 내려감 2021년 1월 달력 참고 
		}
	}
}
