package com.lotto;

import java.util.Arrays;
/*
 * 중복되지 않는 6개 숫자 (1~45)를 작은 순부터 차례때로 정렬하여 콘솔에 출력하는 프로그램
 */


public class Lotto {
	// 0~5번지안에 1~45의 랜덤값이 들어가야함
	// arr 적고 리턴에 미리 리턴값(여기선 arr) 지정하고 시작하기
	// 로또 배열 생성
	public int[] make() {
		int[] arr = new int[6]; 
		int index = 0;
		
		while (index < 6) {
			int insert = (int)(Math.random() * 45) + 1;
			// 여기서 만든 랜덤값을 아래 코드로 전달
			if(!isSame(arr, insert)) {
				arr[index] = insert; 
				index++;
			} 	//issame=같니? !부정, 여기서 true가 나오면 사실상 false
		}
			return arr;

		}
		
	
	// 중복 값 판별
	public boolean isSame(int[] arr, int insert) {
		boolean same = false;
		// arr이랑 insert랑 같니? is는 true false 묻는 것
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == insert) {
				same = true;
				// 하나라도 같으면 true 
				break;
			}
		}
		
		return same;
				

		 
	}
	
	//정렬
	//왼쪽 오른쪽 비교해서 작은 값을 바꿔준다.
	public void sorting(int[] arr) {
		// 
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <arr.length-1; j++) {
				//System.out.println(i+ "->" + Arrays.toString(arr));
				// 한줄에 6개가 있다면 5번 비교
				// 즉 앞에 숫자 기준으로 비교하기때문에 length-1
				if (arr[j] > arr[j+1]) {
					// j는 기준 숫자, j+1은 다음 숫자
					// swap↓
					int tmp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = tmp;
					
				}
				
					
		}
	}
}
	//배열 출력 
	public void prn() {
		int[] arr = make();
		sorting(arr);
		// Arrays.sort(arr);
	System.out.println("[");
	for (int i = 0; i <arr.length; i++) {
		System.out.print(arr[i]+ "");
	}
		System.out.print("]");
	}

}

