package com.test02;

public class SleepTest {

	public static void main(String[] args) {
		
		while(true) {
			
			for (int i = 1; i <= 10; i++) {
				
				try {
					Thread.sleep(500);
					// 500밀리세컨드? 0.5초만큼 멈췄다가 쉬어라
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.printf("%c ", '♥');
			}
			System.out.println();
		}

	}

}
