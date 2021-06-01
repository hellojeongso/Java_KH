package com.test02;

import java.util.Arrays;

public class ShallowCopy {

	public static void main(String[] args) {
		// reference 복사 (얕은 값 복사, 주소 값 복사)
		int[] original = {10, 20, 30, 40};
		int[] copy = original; // 카피라는 배열에 오리지널 주소값을 그대로 넣겠다.
		
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(copy));
		
		System.out.println(original == copy); // true가 나온다. 
		
		copy[1] = 200;
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(copy));
		
		System.out.println("----------------------");
		
		System.out.println(original.hashCode());
		System.out.println(copy.hashCode()); // 같은 주소값을 바라본다. 
	}
}
