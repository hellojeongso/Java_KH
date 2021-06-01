package com.test01;

import java.util.Vector;

public class MTest02 {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("홍길동");
		v.add("이순신");
		v.add("강호동");
		v.add("유재석");
		v.add("신동엽");
		v.add("조세호");
		
		//System.out.println(v);
		
		//prnVector(v);
		
		transElement(v);
	}
	
	public static void transElement(Vector<String> v) {
		// 1. 홍길동의 인덱스를 찾아, -> v.indexOf("홍길동") 
		// 해당 인덱스의 값을 홍길순으로 바꾸어라
		v.set(v.indexOf("홍길동"),"홍길순");
		System.out.println(v);
		
		// 2. ~신으로 끝나는 객체를 찾아서,
		//    만일 있으면 "신"을 "자"로 바꾸자
		for (int i = 0; i < v.size(); i++) {
		if (v.get(i).endsWith("신")) { // endsWith 신이라면..
			v.set(i, v.get(i).replace("신","자"));
			}
		}
		System.out.println(v);
		// [홍길순/이순신/강호동/유재석/신동엽/조세호]
		// 0번지부터 마지막번지까지 반복하는데 
		// v.get i번지 가져왔는데 ! !  
		// endswith(String클래스의 메소드(v.get(벡터)의 i번지의 값 타입이 스트링이니까))
		// endswith("신")은 true.replace "신"을 "자"로 바꾸자 
		// v.set(i <- 바꿔서 여기에 넣는 것 대입
		
		
		// 3. 마지막 글자가 "호"인 객체를 찾아서
		// 	  만일 있으면 삭제하자
		for(String s : v) {
			if (s.endsWith("호")) { //s를 찾아서
				// java.util.ConcurrentModificationException
				// v.remove(s);
			}
				
		}
		
		for (int i = 0; i < v. size(); i++) {
			if (v.get(i).endsWith("호")) {
				v.remove(i);
			}
		}
		System.out.println(v);
	}	
			
	
	public static void prnVector(Vector<String> v) {
		// <홍길동 이순신 ... 조세호 > 형태로 출력하자 ! 
		System.out.print("<");
		
		/*
		for (int i = 0; i < v.size(); i++) {
			System.out.print(v.get(i) + " ");
		}
		*/
		
		// 향상된 for문 (forEach문이라 부름)
		// 오른쪽 덩어리(반복해서 가지고 나올 수 있는 값들(배열이나 컬렉션))를 왼쪽 덩어리(담을 수 있는 변수)에 하나씩 사용하고 반복하고 올라가서 
		// 다시 하나씩 사용하고... 명령을 수행한다.
		for (String s : v ) {
			System.out.print(s+ " ");
		}
		System.out.println(">");
	}
}
