package com.test03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.compare.Score;

public class MTest02 {

	public static void main(String[] args) {
		Set<Score> set = new HashSet<Score>();
		set.add(new Score("홍길동", 100, 90, 60));
		set.add(new Score("이순신", 50, 95, 100));
		set.add(new Score("김선달", 88, 100, 58));
		
		//printSet(set);
		// 메인 작성하고 아래 프린트셋 만든다
		
		transElement(set, "이순신", 10);
		
		// ir.hasNext에선 처음에 이순신 김선달 홍길동이 들어가있었다.
		// 위에 메소드에서 이순신을 호출했으니까 ir.next " 이순신이랑 같니? "
		// ir.next 그래서 김선달이 나왔다??
		// trans 얘 오류있는듯ㅜ 
	}
	
	private static void transElement(Set<Score> set, String name, int kor) {
		// set에서 name을 찾아서, 국어점수의 값을 kor로 바꾸고 전체 출력하자
		Iterator<Score> ir = set.iterator();
		while (ir.hasNext()) {
			Score temp = ir.next(); // <- 하나 담아두고 추가 !! 
			
			if(temp.getName().equals(name)) {
				temp.setKor(kor);
			}
			//if(ir.next().getName().equals(name)) {
				// ir.next에 뜨는 이름이 getname이랑 같은지 equals로 비교해라  
				//ir.next().setKor(kor);
		}
		
		System.out.println(set);
	}
		
	
		
		
	private static void printSet(Set<Score> set) {
		// 방법 1
		/*
		for (Score sc : set) {
			System.out.println(sc);
		}
		*/
		
		
		
		// 방법 2
		/*
		Object[] objectArr = set.toArray();
		for (int i = 0; i < objectArr.length; i++) {
			// 이름만 출력해주세요.
			System.out.println(((Score)objectArr[i]).getName());
			// 오브젝트Arr i번지는 부모타입이기때문에 원래 (Score)타입으로 바꿔줘야한다.
			
		}
		*/
		
		
		
		// 방법 3
		// iterator : collection의 저장 요소들을 읽어드리는 표준화된 방법 !! 
		// 컬렉션안에 있는 list와 set의 값들을 읽어드릴 수 있다.
		Iterator<Score> iterator = set.iterator();
		while (iterator.hasNext()) { // 값이 있나요? 
			System.out.println(iterator.next()); // 있으면 가져오세요
			// 토큰?메소드처럼 next next로 가져온다. 없으면 수행 끝
		}
		
	
	}
}
