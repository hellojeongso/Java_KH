package com.test01;

public class MTest02 {
	public static void main(String[] args) {
	// 식/값 => 정수형, 문자형, 문자열(자바 1.7이후부터 가능)
		
		country();
		
	}	
		
	public static void country() {
		String s = "한국";
		
		switch (s) {
			case "한국" :
				System.out.println("korea");
				break;
			case "중국" :
				System.out.println("china");
				break;
			case "일본" :
				System.out.println("japan");
				break;
				}
	}
}