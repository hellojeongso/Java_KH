package com.test01;

class MyThread03 extends Thread{
	
	public MyThread03(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for (int i = 0; i< 1000; i++) {
			System.out.println(this.getName() + ": " + i);
		}
		
		System.out.println("-----------" + this.getName() + "------------");
	}
}

public class Thread03 {
	public static void main(String[] args) {
		MyThread03 t01 = new MyThread03("멍멍");
		MyThread03 t02 = new MyThread03("야옹");
		
		// java의 thread scheduling은 우선 순위(priority)와 
		// 순환할당(round-robin)방식을 이용한다.
		// 우선순위는 우선순위가 높은애를 더 할당하게 할거고
		// 순환할당은 시간마다 반복하게 할 것 ->메모장
		
		// priority : 우선순위
		t01.setPriority(10); // t01한테 우선 순위를 높게 줌(10) 
							// 우선 순위를 생각만 해줄게. 반영은 쪼끔 해줌
							// 멍멍이가 먼저 끝날 확률이 조금 높다 
		t02.setPriority(Thread.MIN_PRIORITY); // t02 우선순위 0
		
		// max~min -> 10~0
		
		t01.start();
		t02.start();
		
		System.out.println(t01.getName() + " VS " + t02.getName());
	}	
}


/*
 * 메인과 t01, t02 총 3개 스레드가 돌고 있다.
 */
