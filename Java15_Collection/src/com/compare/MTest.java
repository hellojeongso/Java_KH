package com.compare;

import java.util.Arrays;

public class MTest {
	
	public static void main(String[] args) {
		
	
	Score[] qclass = new Score[3];
	
	Score hong = new Score();
	hong.setName("홍길동");
	hong.setKor(100);
	hong.setEng(78);
	hong.setMath(39);
	qclass[0] = hong;
	
	Score lee = new Score("이순신", 79, 100, 78);
	qclass[1] = lee;
	
	qclass[2] = new Score("김선달", 50, 90, 100);
	
	for (Score s: qclass) {
		System.out.println(s);
		}
	// 평균 기준으로 정렬하고 싶다. 
	
	System.out.println("------------------------");
		Arrays.sort(qclass);
		
		for (Score s: qclass) {
			System.out.println(s);
			//Exception in thread "main" java.lang.ClassCastException: class com.compare.Score cannot be cast to class java.lang.Comparable (com.compare.Score is in unnamed modul
			//어쩌고 저쩌고 오류가 난다
			//Score가서 위에 public class Score implements Comparable<Object>{ 입력하고 
			//오류 클릭해서 Override한다. cmpareTo자동으로 만들어진다.
		}
	
	}
}




