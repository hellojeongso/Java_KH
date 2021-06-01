package com.test02;

import java.util.Arrays;

public class DeepCopy {
	
	public static void main(String[] args) {
		
		// 깊은 값 복사 (값 자체를 복사)
		int[] original = new int[] {10,20,30,40}; // 오리지날의 똑같은 크기의 배열 복사
		
		// 1. 인덱스 값 하나하나를 복사
		int[] copyOne = new int[original.length];
		for (int i = 0; i < original.length; i++) {
			copyOne[i] = original[i];		// 똑같은 번지에 같은 값을 복사함 
		}
		
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(copyOne)); // 출력하면 똑같이 나옴
		System.out.println(original == copyOne); // false 나옴 왜냐하면 오리지날과 카피의 주소값이 다르다 
		copyOne[1] = 200; // 혹시나해서 copy의 20을 200으로 바꿈
		System.out.println(Arrays.toString(original)); 
		System.out.println(Arrays.toString(copyOne));
		// 그러고 출력해보니까 번지 다른 값이 나왔음
		
		System.out.println("----------------------");
		// 2. 원본 객체에 복사 요청
		int[] copyTwo = original.clone();	// 위에 어쩌고 저쩌고 할 필요 없이 간단하게 clone로 복사할 수 있음, 클론은 모든 객체들 사용가능
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(copyTwo));
		System.out.println(original == copyTwo);
		copyTwo[2] = 300;
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(copyTwo));
		System.out.println("----------------------");
		
		// 3. System을 사용하여 복사
		
		int[] systemArray = new int[10];
		Arrays.fill(systemArray, 4);
		System.out.println(Arrays.toString(systemArray));
		
		System.arraycopy(original, 0, systemArray, 5,3);
		// 원본에 0번지부터 systemArray로 5번지부터 3개 복사할거야
		// arraycopy(원본 배열, 원본에서 복사 시작할 인덱스, 복사 배열, 복사 시작할 인덱스, 복사 갯수)
		System.out.println(Arrays.toString(systemArray));
		
		System.out.println("------------------");
		
		System.out.println(original.hashCode());
		System.out.println(copyOne.hashCode());
		System.out.println(copyTwo.hashCode());
		System.out.println(systemArray.hashCode());
	}

}
