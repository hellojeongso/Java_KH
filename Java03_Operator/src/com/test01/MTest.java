package com.test01;

public class MTest {
	// 클래스와 메인메소드 사이를 필드라고 한다.
	// 상수 : 변수 앞에 final을 붙인다.
	public static final int TEN = 10;
	
	
	public static void main(String []args) {
		System.out.println(opr01(TEN, 3));
		
		//opr02();로만 호출 하면 ㅡㅡㅡㅡㅡ이 안나오니까 시스템아웃으로 쳐야함
		//opr02();는 다 수행을하고 ㅡㅡㅡ<- 으로 끝난상태임
		System.out.println(opr02());
		
		opr03(TEN, 3);
		opr04();
		// System.out~~~ 위에처럼 안하는 이유는 리턴값이 없는 void라서 
		opr05();
		
		boolean result = opr06();
		System.out.println(result);	
		
		opr07();
	}
	

	//1. 사칙연산
	public static String opr01 (int a , int b) {
		System.out.printf("%d + %d = %d\n", a, b, a+b);
		System.out.printf("%d - %d = %d\n", a, b, a-b);
		System.out.printf("%d * %d = %d\n", a, b, a*b);
		System.out.printf("%d / %d = %d\n", a, b, a/b);
		System.out.printf("%d %% %d = %d\n", a, b, a%b);
		
		
		return "사칙연산 끝\n";
	}

	//2. 대입연산
	public static String opr02 () {
		int res = 0;
		System.out.println("res: " + res);		//0
		res = res + TEN;
		System.out.println("res: " + res);		//10
		res = res + 3;
		System.out.println("res: " + res);		//13
		
		// res = res + Ten
		res += TEN;
		System.out.println("res: " + res);		//23
		
		return "-----------------------";
		
		
				
	}
	
	//3. 증감연산자				10		3
	public static void opr03(int a, int b) {
		/* ++ 붙으면 1이 올라가고 -- 1이 내려감
		 * 증감연산 (++. --)가 가능하다.
		 * 변수의 앞, 뒤에 증감/증가연산자를 붙이게 되면, 변수가 가진 값을 1씩 증가/증감하게 된다.
		 * 
		 * 전위 연산자 (++a) : 연산자를 변수 앞에 붙이면, 연산을 먼저 하고 값을 나중에 리턴한다.
		 * 후위 연산자 (a++) : 연산자를 변수 뒤에 붙이면, 값을 먼저 리턴하고 연산을 나중에 한다.
		 */
		System.out.println(a); // 10(10)
		System.out.println(a++); // 10이 됐는데 출력한 후에 11이 됨
		System.out.println(++a); // 12 (12)

		int result = a++ + --b + b++ + ++a;
		// result의 결과는? 10 2 4 10 ???22???
		// 	위에서 a++ 이은 결과 12가 출력되는데 메모리는 13으로 바뀜 + 2(2) + 2(3) + 14(앞에서 a가 13으로 바꼇으니까)
		System.out.println(result);
		
	}
	
	//4. 논리 연산자 (&,&&,|,||)
	public static void opr04() {
		// & : and (그리고)
		// | : 쉬프트 누르고 역슬래시 or(또는)
		// 결과 -> true / false
		
		// & : 양 쪽 모두 true여야지 true
		System.out.println(true & true);
		System.out.println(true & false);
		System.out.println(false & true);
		System.out.println(false & false);

		// | : 둘 중 하나만 true면 true
		System.out.println(true | true);
		System.out.println(true | false);
		System.out.println(false | true);
		System.out.println(false | false);
		
		System.out.println("----------d-");
		// && : 앞의 값이 false면, 뒤의 조건을 확인하지 않음
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println("----------d-");
		System.out.println(false && true);
		System.out.println(false && false);
		System.out.println("----------d-");
		// 데드코드 : 어처피 확인안할거야
		
		// || : 앞의 값이 true면, 뒤의 조건을 확인하지 않음
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		int a = 2;
		int b = 3;
		System.out.println((a>b)&&(a<b));
		//					(2>3) xx
	}		
		//5. 비교연산
		public static void opr05() {
			int i = 10;
			
			System.out.println(i == TEN);
			System.out.println(i != TEN);
			System.out.println(i > TEN);
			System.out.println(TEN <= 50);
		// == 같다 != 같지않다??? 
			
			
		}
		
		// 6.삼항연산
		public static boolean opr06() {
			// 타입 변수 = (조건)? 참일때 리턴값 : 거짓일때 리턴값 ;
			// 타입 = 참 리턴값 = 거짓 리턴값의 타입이 일치 !
			
			int a = 2;
			int b = 3;
			int i = (a > b) ? a + b : a - b;
			System.out.println(i);
			
			boolean res = (a > b) ? true : false;
			
			return res;
			
		}
	
		// 7. 비트연산
		public static void opr07() {
			// &, |, ^, ~, <<, >>
			// 0, 1비트 상태에서 연산한다.
		
			// int -> 4 byte -> 32bit 	
			int a = 10;
			// 0000 0000 0000 0000 0000 0000 0000 0000 1010
			
			int b = 2;
			// 0000	0000 0000 0000 0000 0000 0000 0000 0010
			
			System.out.println(a & b);
			// 0000	0000 0000 0000 0000 0000 0000 0000 0010
			// 0000	0000 0000 0000 0000 0000 0000 0000 0010
			// &-------------------------------------------
			// 0000	0000 0000 0000 0000 0000 0000 0000 0010
			// 0은 falue 1은 true -> 전기가 들어온다 1 트루 안들어온다 0펄스
			
			System.out.println(a | b);
			// 0000	0000 0000 0000 0000 0000 0000 0000 0010
			// 0000	0000 0000 0000 0000 0000 0000 0000 0010
			// |-------------------------------------------
			// 0000	0000 0000 0000 0000 0000 0000 0000 1010
	
			System.out.println(~a);
			// 0000	0000 0000 0000 0000 0000 0000 0000 1010
			// 1111 1111 1111 1111 1111 1111 1111 1111 0101
			
			System.out.println("------------------------");
			//이건 이진수알아야함
			int c = 10;
			// 0000	0000 0000 0000 0000 0000 0000 0000 1010
			System.out.println(Integer.toBinaryString(c));
			System.out.println(Integer.toBinaryString(c >> 2));
			// 00 0000 0000 0000 0000 0000 0000 0000 10 
			
		}
	}
	
