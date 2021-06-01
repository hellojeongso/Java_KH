package com.generic;

public class MTest {

	public static void main(String[] args) {
		// Emp타입의 Empno라는 변수는 문자열도 들어갈 수 있고, 숫자도 들어갈 수 있다.
		// 왜냐하면 Empno에 타입을 특정(<T>)해주지 않았기때문에 아무 타입을 넣어도 들어갈 수 있다.
		Emp emp01 = new Emp();
		emp01.setEmpno("a111");
		emp01.setEname("홍길동");
		System.out.println(emp01);
		
		Emp emp02 = new Emp();
		emp02.setEmpno(222);
		emp02.setEname("김선달");
		System.out.println(emp02);
		
		// emp01.setEmpno((int)emp01.getEmapno() + 1);
		// 문자열을 int타입으로 캐스팅 할 수 없다고 에러뜸.
		emp02.setEmpno((int)emp02.getEmapno() + 1);
		
		System.out.println(emp01);
		System.out.println(emp02);
		
		System.out.println("------------------------");
		
		Emp<Integer> emp03 = new Emp<Integer>();
		// emp03.setEmpno("111");
		// 에러코드 확인해보면 <Integer>로 강제했기때문에 문자열이 안들어감
		// ▼ 아래 확인
		emp03.setEmpno(111);
		
		Emp<Integer> emp04 = new Emp<Integer>(113, "이순신");
		
	}
}
