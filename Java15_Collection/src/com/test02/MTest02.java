package com.test02;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;
import com.compare.Score;
import java.util.Comparator;

public class MTest02 {
public static void main(String[] args) {
	List<Score> list = new ArrayList<Score>();
	
	Score hong = new Score();
	hong.setName("홍길동");
	hong.setKor(100);
	hong.setEng(78);
	hong.setMath(39);
	list.add(hong);
	
	Score lee = new Score("이순신", 79, 100, 78);
	list.add(lee);
	
	list.add(new Score("김선달", 50, 90, 100));
	
	System.out.println(list);
	
	System.out.println("--------------");
	Collections.sort(list, new MySortTest());
	// ▲ list에 스코어 들어 있고, new MySortTest는 심판이라 생각하기..
	System.out.println(list);
	
	}
}

/*
 * + : 앞의 인자가 더 큰 값
 * 0 : 같은 값
 * - : 뒤의 인자가 더 큰 값
 * 
 */

// 하나의 파일에서 public 클래스는 하나밖에 못만듬, 하지만 클래스는 여러개 만들 수 있음
class MySortTest implements Comparator<Score> {
						// compare를 강제 구현 시킴
	
	
	// other1 vs other2
	@Override			
	public int compare(Score o1, Score o2) {
		if (o1.getAvg() > o2.getAvg()) {
			 return 1;
			} else if (o1.getAvg() < o2.getAvg()) {
			 return -1;
			}
			 return 0;
	}
}



//comparable은 나와 다른 클래스
//comparator는
//외부클래스의 객체가 내가 비교하고 싶은 애들 두개를 비교해준다.
