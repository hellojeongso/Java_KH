package com.test01;

import java.util.Arrays;

public class MTest02 {
	
	public static void main(String[] args) {
		
		// 1.
		int [][] a = new int[3][2];
		a[0][0] = 1;
		a[0][1] = 2;
		a[1][0] = 3;
		a[1][1] = 4;
		a[2][0] = 5;
		a[2][1] = 6;
		
		System.out.println(a[1][1]);
		
		
		// 2.
		int[][] b = new int[3][];
		b[0] = new int[3];
		b[1] = new int[5];
		b[2] = new int[2];
	
		
		// 3.
		int[][] c = new int[][] {
									{1,2},
									{3, 4, 5, 6, 7},
									{8},
									{9, 10, 11}
									// 원래 한줄로 쓰는데
									// 가독성을 위해 저렇게 씀
									// 커다란 배열안에 작은 배열 4개가 들어가는데
									// 작은 배열 0은 2칸
									// 작은 배열 1는 4칸
									// 작은 배열 2은 1칸
									// 작은 배열 3는 3칸
								};
								
		// 4.
	int [] [] d = {{1, 2, 3, 4}, {5}, {6, 7}, {8, 9, 10}};
	// 큰 배열에 3칸,
	// 작은 배열 0에 4칸
	// 작은 배열 2에 1칸
	// 작은 배열 2에 2칸
	// 작은 배열 3에 3칸
	// 큰 배열의 길이는 3칸 주소는 4칸???
	
	System.out.println(d[3][1]);
	prn(d);
	
	
	String[][] s = {{"Have", "a", "nice", "day"},
					{"너무", "어려워"},
					{"배열", "이차원 배열"}};
	
	modi(s);
	
	String [] qclass = {"트와이스", "아이유", "강동원", "주지훈","차은우"};
	System.out.println(Arrays.toString(qclass));
	
	System.out.println(Arrays.toString(s)); 
	System.out.println(Arrays.deepToString(s));
	}
	
	public static void modi(String[][] arr) {
		// nice -> good / 어려워 -> 쉬워로 바꾸고
		// 전체 출력하자
			
		arr[0][2] = "good";
		arr[1][1] = "쉬워";
		
		for (int i= 0; i < arr.length; i++) {
			for (int j = 0; j <arr[i].length; j++) {
				System.out.printf("%s ", arr[i][j]);
			}
				System.out.println();
		}
		
	}
	
	public static void prn(int[][] arr) {
		// arr 배열의 모든 요소를 출력하자
		// 1 2 3 4
		// 5 
		// 6 7
		// 8 9 10 형태로
		for (int i = 0; i < arr.length; i++) {	//커다란 배열부터 가져오겠다. 0부터 랭쓰보다 작을때까지. 0부터 시작이니까
			for (int j = 0; j < arr[i].length; j++) { // 작은 배열의 길이를 구하기 위해 arr[i].length로 지정 
													  // 작은 배열은 큰 배열 안에 속해있으니까
				
				System.out.printf("%3d", arr[i][j]);
				
			}
				System.out.println();
		}
		
		
	}

}


