package com.test02;

public class MyException extends Exception {
	// 사용자 정의 예외 : JVM에서 예외를 발생시켜 주지 않으므로 직업 예외 생성
	// java.rang.Exception 클래스를 상속받음 


	public MyException() {
		this("Exception test");
	}
	
	public MyException(String msg) {
		super(msg); // 부모의 msg를 호출해줄 것
	}
}
