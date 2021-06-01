package com.b;

import com.a.AAA;

// AAA를 상속받은 BBB 
public class BBB extends AAA {

	private int b;
	
	// 기본 생성자
	public BBB() {
		/// super(); -> 해당 명령어가 없어도 자동으로 부모 생성자 호출 ! 
		System.out.println("BBB()");
	}
	// 파라미터 한개 짜리 생성자
	public BBB(int b) {
		// 부모의 생성자 -> AAA(int abc);
		super(b);
		this.b = b;
		System.out.println("BBB(int b)");
	}
	// 파라미터 두개짜리 생성자
	public BBB(int abc, int b) {
		super(abc);
		this.b = b;
		System.out.println("BBB(int abc, int b");
	}
	
	// getter & setter
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getSum() {
		// super : 부모 객체, 여기서 슈퍼는 AAA 
		// this : 나 객체
		// super() : 부모 생성자
		// this() : 나 생성자
		//int sum = super.getAbc() + this.getB();
		// ↓ super는 부모, this는 나이기때문에 생략가능 ex) 엄마 나 쇼파앉아도 돼..?
		int sum = getAbc() + getB();
		return sum;
	}
	
	// 부모의 메소드와 완벽하게 똑같은데 
	// 불러서 내 마음대로 바꾸었다.
	// 이것을 재정의라고 부른다. override
	@Override
	public void prn() {
		System.out.println("BB의 prn()");
	}
}
