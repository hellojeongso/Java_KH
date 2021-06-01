package com.test02;

public class MTest {
	public static void main(String[] args) {
		//stringTest();
		stringBufferTest();
}		
	// String을 +연산할 때, 내부적으로는 StringBuilder로 변환하여 연산함 (jdk 1.5)
	// 근데 배울 일은 없음 
	public static void stringBufferTest() {
		// (mutable) 스트링과 다르게 변한다.  
		StringBuffer sb = new StringBuffer();
		// 이렇게 쓰는걸 보니 참조타입이구나~!
		sb.append("안녕하세요!")
		.append("저는")
		.append("김선달 입니다.");  
		// sb.append;로 다다다 쓸 수 있는데 걍 이렇게 씀
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
		sb.replace(0, 6, "하이!");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
		sb.reverse();
		// reverse = 스트링과 다르게 반대로 출력해주는 메소드가 있다. 
		System.out.println(sb);
	}
	
	
	public static void stringTest() {
		String s = "안녕하세요!";
		s += "저는";
		s += "정소영입니다.";
		
		System.out.println(s);
		System.out.println(s.hashCode());
		
		s.replace("안녕하세요!", "하이!");
		System.out.println(s);
		// s.replace에 = 연산자로 안써서 안녕하세요로 그대로 나온다
		// 연결은 안녕하세요에 돼있고, pool에 하이!가 생겼다.
		// s에 대입하지 않으면, 변하지 않는다(만들어져있긴 하다)
		
		s = s.replace("안녕하세요!", "하이!");
		System.out.println(s);
		
}
}
