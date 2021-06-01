  package com.test01;



public class MTest01 {
	public static void main(String[] args) {
		// array 만드는 방법
		
		// 1. 
		int [] a; 			// int형 값을 저장할 a라는 변수
		a = new int [5];	// 정의, int형 값을 저장할 메모리 칸을 5개 만들거야. (칸을 index라고 부름) 
							// 0~length-1이 칸 갯수임. (0,1,2,3,4) 여기선 5		0번지, 1번지, 2번지, 3번지, 4번지
		a[0]=1;				// 초기화
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		// a[5]=6; <= 배열의 값을 넘어섰음 new int 5이기 때문에
		
		System.out.println(a[2]);
		System.out.println(a[1]+a[3]);

	
		// 2. 
		int [] b = new int[] {5, 4, 3, 2, 1}; // 선언, 정의, 초기화
		System.out.println(b[1]); // => 1번째 칸을 불러서 4번 호출됨
		
		// 3. 
		int c[] = {7, 8, 9, 1, 2}; // 선언, 초기화
		System.out.println(c); // c를 호출하면 주소값이 나옴
		prn(c); // => 아래로 보낼건데 그럼 아규먼트 
		
		
		// 문제 ! 
		String[] s = new String[] {"Have", "A", "nice", "day"};
		modi(s); // 이 값을 아래 modi메소드 호출에 넣어준다. 
				
	}	

	
		public static void modi(String[] arr) {
		 // "nice"를 "good"으로 바꾸고 전체 출력하자
		 // arr[2] = "good"; <= 이것도 답이고
		 // 아래는 좀 어렵게 푼 것 
			for (int i = 0; i < arr.length; i++) {
				if (arr[i].equals("nice")) {
					arr[i] = "good";
				}
				System.out.printf("%s", arr[i]);
			}
			
			
		}
		public static void prn(int[] arr) { // 주소값이 나오니까 그래서 배열의 실제값을 불러올거임, 
											// prn을 호출하면서 (int[] arr) 파라미터에 prn(c); 아규먼트 들어간다.
			for (int i = 0; i < arr.length; i++) {
				System.out.printf("%2d", arr[i]); 	// i가 0이어서 7부터 출력 
													// arr.lenth는 배열의 전체 길이를 말함 
													// 5개 들어가있으니까 그러므로 5 
		}									
			System.out.println("");
			
		}
}
