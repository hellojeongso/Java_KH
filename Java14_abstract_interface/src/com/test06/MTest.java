package com.test06;

public class MTest {

	public static void main(String[] args) {
		// 생성자
		MyProfile my = new MyProfile("정소영","010-1234-5678"); 
		// String 파라미터
		my.jobLoc("서울시 어딘가");
		// 현재 객체에 스트링 값을 받는다했으니까..?
		my.display();
		// Display인터페이스의 추상 메소드에 상위 클래스(Profile) 메소드를 호출해서 재정의
		

	}

}
