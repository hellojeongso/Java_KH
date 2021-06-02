package com.test01;

class MyThread implements Runnable{
//MyThead 빨간 밑줄 오류 뜨면 클릭해서 추상메소드 만들 것 
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("i : " + i);
		}
		
	}
	
}


public class Thread01 {

	public static void main(String[] args) {
		// main thread의 우선순위가 높다 !!!
		System.out.println("main thread Strat!!");
		
		// 이건 Thread가 아니다.
		/*
		MyThread t01 = new MyThread();
		MyThread t02 = new MyThread();
		t01.run();
		t02.run();
		*/
		
		// 이게 Thread 이다.
		// runable을 implements한 MyThered를 Thread로 만든 것?
		Thread t01 = new Thread(new MyThread()); 
		Thread t02 = new Thread(new MyThread());
		
		// start() : 자동으로 run() 호출, 각각 돈다
		t01.start();
		t02.start();
		
		System.out.println("main thread stop!!");
	}
}
// ▲ 스레드를 객체화 시켜서 동작시키고 있다
// 프로세스 동작하는 상황에 따라 출력되는 결과값이 매번 다르다.
// 메인의 우선순위가 높기때문에 먼저 시작하고 끝날 확률이 높은데,
// t01 t02도 각 각 출발
