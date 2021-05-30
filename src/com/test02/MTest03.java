package com.test02;

import com.test01.MTest01;

public class MTest03 {
	
	public static void main(String[] args) {
		MTest01.publicMethod();
		// MTest01.protectedMethod(); 같은 패키지가 아니라서 안됨
		// MTest01.defaultMethod(); 같은 패키지가 아니라서 안됨
		// MTest01.privateMethod(); 다른 클래스라서 안됨??
	}
}
