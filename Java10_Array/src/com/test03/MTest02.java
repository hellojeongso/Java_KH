package com.test03;

public class MTest02 {
	public static void main(String[] args) {
	/*
	 * 1 4 7
	 * 2 5 8
	 * 3 6 9 
	 * 
	 * 모양의 이차원 배열을 만들어서 출력하자 
	 * 
	 */
		
		
/*
 * 	/*	int [][] a = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
		prn(a);
		}
	
		public static void prn(int[][] arr) {
			int cnt = 1;
			for (int i = 0; i < arr.length; i++) {

				for (int j = 0; j < arr[i].length; j++) {
					
					if (cnt % 3 == 0) {
						System.out.println();
					
					System.out.printf("%3d", arr[i][j]);
				}
			}		System.out.println();
		}
}
} 
// 
 */
		
	int[][] arr = new int[3][3];
	int cnt = 1;
	
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			arr[j][i] = cnt ++;
		}
	
	}
	
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			System.out.printf("%d ", arr[i][j]);
		}
		System.out.println();
		}
	}
		}
	
