package com.test01;

class MyThread02 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("i: " + i);
		}
	}
}

public class Thread02 {
	// 부모의 클래스를 상속 받아서 메소드를 호출 후 스레드를 동작시키고 있다. 
	public static void main(String[] args) {
		System.out.println("main thread start!!!");
		
		MyThread02 t01 = new MyThread02();
		MyThread02 t02 = new MyThread02();
		
		t01.start();
		t02.start();
		// t01.run();으로 하면 스레드가 아님! 
		// 실행시키면 메인부터 차근차근 내려온다 그냥 일반적인 메소드 호출?
		System.out.println("main thread stop!!!");
	}
}
