package com.test02;

public class Gugudan {
	public static void main(String[] args) {
		gugu();
}
	
	public static void gugu() {
		// 2단부터 9단까지 전제 출력
		for(int i = 2; i < 10; i++) {
			System.out.println(i + "단을 출력합니다.");
			
			for(int j = 1; j < 10; j++) {
				System.out.println(i+ "x" + j + "=" + i * j);
				}
			System.out.println();
		}
	}
}

