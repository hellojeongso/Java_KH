package com.test03;

import java.util.HashSet;
import java.util.Set;

public class test03 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("1");
		set.add("3");
		set.add("5");
		set.add("2");
		set.add("6");
		set.add("4");
		set.add("7");
		set.add("3");
		set.add("3");
	
		for (String s: set) {
			System.out.println(s);
		}
		
		findSetElemant(set, "5");
	}
	
		public static void findSetElemant(Set<String> set, String find) {
			// set에 있는 특정 요소가 find와 같은 값일 때, "5 찾았다!"라고 출력하자
				//for (int i = 0; i < set.size(); i++) {
				//set.get(i);
				//▲ set은 순서가 없기때문에 get(index) 메소드 사용이 불가하다. 지 마음대로 넣어놨기때문에 get을 못씀
				//그래서 for 이치문을 사용해야한다
				for (String s : set) {
					if (s.equals(find)) { //api를 String 관련으로 봐야한다. set에서 s를 하나씩 넣고 있으니까
						System.out.println(find + "찾았다!!");
					}
			}
		}
}
